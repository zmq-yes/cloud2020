package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description:
 * @Author: ZMQ
 * @Date: 2022/11/8 14:25
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/inset")
    public CommonResult inset(@RequestBody Payment payment){
        int inset = paymentService.inset(payment);
        CommonResult commonResult = new CommonResult();
        if (inset>0){
            commonResult.setCode(200);
            commonResult.setMessage("成功");
            commonResult.setData(inset);
        }else{
            commonResult = new CommonResult(500,"失败");
        }
        return commonResult;
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        CommonResult paymentCommonResult = new CommonResult();
        if (payment == null) {
            paymentCommonResult.setCode(500);
            paymentCommonResult.setMessage("失败");
        }else{
            paymentCommonResult.setCode(200);
            paymentCommonResult.setMessage("成功");
            paymentCommonResult.setData(payment);
        }
        //log.info(payment.toString()+"9*************");
        return paymentCommonResult;
    }
}

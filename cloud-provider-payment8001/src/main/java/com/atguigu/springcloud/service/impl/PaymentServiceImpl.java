package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymaentServiceImpl
 * @Description:
 * @Author: ZMQ
 * @Date: 2022/11/8 14:20
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //@Autowired
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int inset(Payment payment) {
        return paymentDao.inset(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

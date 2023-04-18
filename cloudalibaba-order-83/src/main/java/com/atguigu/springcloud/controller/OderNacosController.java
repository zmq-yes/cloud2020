package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName: OderNacosController
 * Package: com.atguigu.springcloud.controller
 * Description:
 *
 * @Author zmq
 * @Create 2023/4/13 9:52
 * @Version 1.0
 */
@RestController
public class OderNacosController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }



}

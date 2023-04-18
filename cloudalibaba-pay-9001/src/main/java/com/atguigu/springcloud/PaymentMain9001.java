package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: PaymentMain9001
 * Package: com.atguigu.springcloud
 * Description:
 *
 * @Author zmq
 * @Create 2023/4/12 17:59
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}
package com.lvchao.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: FeignConsumerApplication
 * @Package: com.lvchao.sentinel
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/23 20:25
 * @version: V1.0
 */
/**
 * 访问网址：
 * http://localhost:8081/consumer/getConsumer
 */
@SpringBootApplication
public class FeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class,args);
    }
}

package com.lvchao.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: GatewayApplication
 * @Package: com.lvchao.sentinel
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/28 19:06
 * @version: V1.0
 */

/**
 * 点击测试url: http://localhost:8888/consumer/getConsumer
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}

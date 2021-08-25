package com.lvchao.sentinel.com.lvchao.sentinel.controller;

import com.lvchao.sentinel.api.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Title: ProvicerController
 * @Package: com.lvchao.sentinel.controller.ProvicerController
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/23 20:33
 * @version: V1.0
 */
@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/consumer/getConsumer")
    public String getConsumer(){
        Random random = new Random();
        return applicationName + ":" + random.nextInt(1000) + ":拼接:" + providerClient.getProvicer();
    }
}

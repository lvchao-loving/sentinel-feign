package com.lvchao.sentinel.com.lvchao.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lvchao.sentinel.api.ProviderClient;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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

    //@SentinelResource(value = "sentinel_springcloud",blockHandler = "exceptionHandler")
    @GetMapping("/consumer/getMyConsumer")
    public String getMyConsumer(){
        Random random = new Random();
        return applicationName + ":" + random.nextInt(1000) ;
    }

    public String exceptionHandler(BlockException e){
        log.info( "系统繁忙，请稍等！" + e);
        return "系统繁忙，请稍等！";
    }
}

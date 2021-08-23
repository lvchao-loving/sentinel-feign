package com.lvchao.sentinel.controller;

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
public class ProvicerController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/provider/getProvicer")
    public String getProvicer(){
        Random random = new Random();
        return applicationName + ":" + random.nextInt(1000);
    }
}

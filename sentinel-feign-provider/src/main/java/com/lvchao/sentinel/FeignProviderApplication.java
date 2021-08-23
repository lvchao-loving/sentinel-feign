package com.lvchao.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: FeignProviderApplication
 * @Package: com.lvchao.sentinel
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/23 20:26
 * @version: V1.0
 */

/**
 * 访问网址：
 * http://localhost:8080/provider/getProvicer
 */
@SpringBootApplication
public class FeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class,args);
    }
}

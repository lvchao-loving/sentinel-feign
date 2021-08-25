package com.lvchao.sentinel.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: ProviderClient
 * @Package: com.lvchao.sentinel.api
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/23 21:10
 * @version: V1.0
 */
@FeignClient(value = "sentinel-feign-provider", fallbackFactory = ProviderClientFallBack.class)
public interface ProviderClient {
    @GetMapping("/provider/getProvicer")
    String getProvicer();
}

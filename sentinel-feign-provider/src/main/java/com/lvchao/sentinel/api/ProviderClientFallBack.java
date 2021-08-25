package com.lvchao.sentinel.api;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Title: ProviderClientFallBack
 * @Package: com.lvchao.sentinel.api
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/23 21:10
 * @version: V1.0
 */
@Slf4j
@Component
public class ProviderClientFallBack implements FallbackFactory<ProviderClient> {
    @Override
    public ProviderClient create(Throwable cause) {

        return new ProviderClient(){
            @Override
            public String getProvicer() {
                log.error("调用异常！");
                return "调用异常！";
            }
        };
    }
}

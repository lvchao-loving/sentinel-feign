package com.lvchao.sentinel.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

/**
 * @Title: GatewayConfiguration
 * @Package: com.lvchao.sentinel.config
 * @Description:
 * @auther: chao.lv
 * @date: 2021/8/28 19:20
 * @version: V1.0
 */
@Component
public class GatewayConfiguration {

    @PostConstruct
    public void doInit(){
        GatewayCallbackManager.setBlockHandler(new BlockRequestHandler() {
            @Override
            public Mono<ServerResponse> handleRequest(ServerWebExchange exchange, Throwable t) {
                return ServerResponse.status(200).bodyValue("网关抛出的系统繁忙！");
            }
        });
    }
}

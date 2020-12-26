package org.example.web.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.grpc.DubboFooServiceGrpc;
import org.example.grpc.FooRequest;
import org.example.grpc.FooResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * <p>
 * FooRestController:
 * </p>
 *
 * @author lzb
 */
@RestController
public class FooRestController {

    @DubboReference//(protocol = "grpc")
    private DubboFooServiceGrpc.IFooService fooService;

    @GetMapping("/foo")
    public String foo() {
        FooResponse response = this.fooService.sayHello(FooRequest.newBuilder().setContent(UUID.randomUUID().toString()).build());
        return response.getContent();
    }
}

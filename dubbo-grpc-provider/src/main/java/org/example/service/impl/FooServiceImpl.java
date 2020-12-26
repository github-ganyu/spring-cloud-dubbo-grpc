package org.example.service.impl;

import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.grpc.DubboFooServiceGrpc;
import org.example.grpc.FooRequest;
import org.example.grpc.FooResponse;
import org.example.grpc.FooServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * FooServiceImpl:
 * </p>
 *
 * @author lzb
 */
@DubboService(protocol = {"grpc"}, interfaceClass = DubboFooServiceGrpc.IFooService.class)
public class FooServiceImpl extends DubboFooServiceGrpc.FooServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(FooServiceImpl.class);

    @Override
    public void sayHello(FooRequest request, StreamObserver<FooResponse> responseObserver) {
        //super.sayHello(request, responseObserver);
        LOGGER.info("接收到的参数：{}", request);
        responseObserver.onNext(FooResponse.newBuilder().setContent(request.getContent()).build());
        responseObserver.onCompleted();
    }
}

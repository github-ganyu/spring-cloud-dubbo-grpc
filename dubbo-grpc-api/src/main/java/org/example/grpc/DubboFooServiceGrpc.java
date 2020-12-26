
    package org.example.grpc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static org.example.grpc.FooServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: FooService.proto")
public final class DubboFooServiceGrpc {
private DubboFooServiceGrpc() {}

public static class DubboFooServiceStub implements IFooService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected FooServiceGrpc.FooServiceBlockingStub blockingStub;
protected FooServiceGrpc.FooServiceFutureStub futureStub;
protected FooServiceGrpc.FooServiceStub stub;

public DubboFooServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = FooServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = FooServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = FooServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public org.example.grpc.FooResponse sayHello(org.example.grpc.FooRequest request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.FooResponse> sayHelloAsync(org.example.grpc.FooRequest request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public void sayHello(org.example.grpc.FooRequest request, io.grpc.stub.StreamObserver<org.example.grpc.FooResponse> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request, responseObserver);
    }

}

public static DubboFooServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubboFooServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IFooService {
    default public org.example.grpc.FooResponse sayHello(org.example.grpc.FooRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.FooResponse> sayHelloAsync(org.example.grpc.FooRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void sayHello(org.example.grpc.FooRequest request, io.grpc.stub.StreamObserver<org.example.grpc.FooResponse> responseObserver);

}

public static abstract class FooServiceImplBase implements io.grpc.BindableService, IFooService {

private IFooService proxiedImpl;

public final void setProxiedImpl(IFooService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final org.example.grpc.FooResponse sayHello(org.example.grpc.FooRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<org.example.grpc.FooResponse> sayHelloAsync(org.example.grpc.FooRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void sayHello(org.example.grpc.FooRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.FooResponse> responseObserver) {
        asyncUnimplementedUnaryCall(org.example.grpc.FooServiceGrpc.getSayHelloMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    org.example.grpc.FooServiceGrpc.getSayHelloMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    org.example.grpc.FooRequest,
    org.example.grpc.FooResponse>(
    proxiedImpl, METHODID_SAY_HELLO)))
.build();
}
}
    private static final int METHODID_SAY_HELLO = 0;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IFooService serviceImpl;
private final int methodId;

MethodHandlers(IFooService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAY_HELLO:
            serviceImpl.sayHello((org.example.grpc.FooRequest) request,
            (io.grpc.stub.StreamObserver<org.example.grpc.FooResponse>) responseObserver);
            break;
    default:
    throw new java.lang.AssertionError();
    }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new java.lang.AssertionError();
            }
            }
            }

            }

package com.zahiar.kotlin_grpc_demo

import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver

@GRpcService
class DemoService : DemoGrpc.DemoImplBase() {

    override fun sayHello(request: DemoOuterClass.DemoRequest, responseObserver: StreamObserver<DemoOuterClass.DemoReply>) {
        val replyBuilder = DemoOuterClass.DemoReply.newBuilder().setMessage("Hello " + request.firstName + ", " + request.lastName)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }

}
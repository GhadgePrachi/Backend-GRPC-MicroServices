package com.projects.plantcare.grpc

import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class HelloServiceGrpcImpl : HelloServiceGrpc.HelloServiceImplBase() {

    override fun hello(request: HelloRequest?, responseObserver: StreamObserver<HelloResponse>?) {
        println("Processing hello world request")
        val response : HelloResponse = HelloResponse.newBuilder()
            .setGreeting("Hello, ${request?.firstName} ${request?.lastName}!")
            .build()
        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }
}

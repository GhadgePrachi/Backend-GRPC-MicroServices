package com.projects.plantcare.grpc

import io.grpc.stub.StreamObserver
import mu.KotlinLogging
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService

class HelloServiceGrpcImpl : HelloServiceGrpc.HelloServiceImplBase() {
    private val logger = KotlinLogging.logger {}
    override fun hello(request: HelloRequest?, responseObserver: StreamObserver<HelloResponse>?) {
        logger.info("Processing hello world request")
        val response : HelloResponse = HelloResponse.newBuilder()
            .setGreeting("Hello, ${request?.firstName} ${request?.lastName}!")
            .build()
        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }
}

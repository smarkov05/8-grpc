package com.mentoring.exception;

import io.grpc.Status;
import org.lognet.springboot.grpc.recovery.GRpcExceptionHandler;
import org.lognet.springboot.grpc.recovery.GRpcExceptionScope;
import org.lognet.springboot.grpc.recovery.GRpcServiceAdvice;

@GRpcServiceAdvice
public class GrpcExceptionAdvice {

    @GRpcExceptionHandler()
    public Status handleInvalidArgument(IllegalArgumentException e, GRpcExceptionScope scope) {
        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }
}
package com.mentoring.service;

import com.mentoring.stubs.pingpong.PingPongServiceGrpc;
import com.mentoring.stubs.pingpong.PingPongServiceOuterClass;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class PingPongService extends PingPongServiceGrpc.PingPongServiceImplBase {
    private static final int MIN_POWER = 1;
    private static final int MAX_POWER = 10;

    @Override
    public void hitBall(PingPongServiceOuterClass.HitBallProto request, StreamObserver<PingPongServiceOuterClass.BallReturnProto> responseObserver) {
        var targetServer = "localhost:8881";
        var hitPower = request.getHitPower();
        if (hitPower < MIN_POWER || hitPower > MAX_POWER) {
            throw new IllegalArgumentException("Incorrect hit power! Allowed values between 1 to 10. Your value is: " + hitPower);
        }

        var channel = ManagedChannelBuilder
                .forTarget(targetServer)
                .usePlaintext()
                .build();

        var blockingStub = PingPongServiceGrpc.newBlockingStub(channel);
        var serverResponse = blockingStub.hitBall(PingPongServiceOuterClass.HitBallProto.newBuilder()
                .setHitPower(hitPower)
                .build());

        responseObserver.onNext(
                PingPongServiceOuterClass.BallReturnProto.newBuilder()
                        .setCanBallReturn(serverResponse.getCanBallReturn())
                        .build());
        responseObserver.onCompleted();
    }
}

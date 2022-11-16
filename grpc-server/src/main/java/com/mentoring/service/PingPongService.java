package com.mentoring.service;

import com.mentoring.stubs.pingpong.PingPongServiceGrpc;
import com.mentoring.stubs.pingpong.PingPongServiceOuterClass;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class PingPongService extends PingPongServiceGrpc.PingPongServiceImplBase {

    @Override
    public void hitBall(PingPongServiceOuterClass.HitBallProto request, StreamObserver<PingPongServiceOuterClass.BallReturnProto> responseObserver) {
        var hitPower = request.getHitPower();
        var canHitReturn = canHitReturn(hitPower);
        responseObserver.onNext(
                PingPongServiceOuterClass.BallReturnProto.newBuilder()
                        .setCanBallReturn(canHitReturn)
                        .build());
        responseObserver.onCompleted();
    }

    public boolean canHitReturn(int hitPower) {
        var minPower = 1;
        var maxPower = 10;
        var returnHitPower = ((int) (Math.random() * (maxPower - minPower))) + minPower;
        return returnHitPower >= hitPower;
    }
}

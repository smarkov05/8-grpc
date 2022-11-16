from __future__ import print_function

import logging
import random

import grpc
import ping_pong_service_pb2
import ping_pong_service_pb2_grpc

def run():
    serveHitPower = random.randint(0,22)
    print("Serve the ball with power: " + str(serveHitPower))
    with grpc.insecure_channel('localhost:8881') as channel:
        stub = ping_pong_service_pb2_grpc.PingPongServiceStub(channel)
        response = stub.hitBall(ping_pong_service_pb2.HitBallProto(hitPower=serveHitPower))
    print("Can server return the ball : " + str(response.canBallReturn))


if __name__ == '__main__':
    logging.basicConfig()
    run()

# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import ping_pong_service_pb2 as ping__pong__service__pb2


class PingPongServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.hitBall = channel.unary_unary(
                '/com.mentoring.stubs.pingpong.PingPongService/hitBall',
                request_serializer=ping__pong__service__pb2.HitBallProto.SerializeToString,
                response_deserializer=ping__pong__service__pb2.BallReturnProto.FromString,
                )


class PingPongServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def hitBall(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_PingPongServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'hitBall': grpc.unary_unary_rpc_method_handler(
                    servicer.hitBall,
                    request_deserializer=ping__pong__service__pb2.HitBallProto.FromString,
                    response_serializer=ping__pong__service__pb2.BallReturnProto.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'com.mentoring.stubs.pingpong.PingPongService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class PingPongService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def hitBall(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.mentoring.stubs.pingpong.PingPongService/hitBall',
            ping__pong__service__pb2.HitBallProto.SerializeToString,
            ping__pong__service__pb2.BallReturnProto.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
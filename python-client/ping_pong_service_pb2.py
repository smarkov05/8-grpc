# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ping_pong_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17ping_pong_service.proto\x12\x1c\x63om.mentoring.stubs.pingpong\" \n\x0cHitBallProto\x12\x10\n\x08hitPower\x18\x01 \x01(\x05\"(\n\x0f\x42\x61llReturnProto\x12\x15\n\rcanBallReturn\x18\x01 \x01(\x08\x32w\n\x0fPingPongService\x12\x64\n\x07hitBall\x12*.com.mentoring.stubs.pingpong.HitBallProto\x1a-.com.mentoring.stubs.pingpong.BallReturnProtoB\x1e\n\x1c\x63om.mentoring.stubs.pingpongb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ping_pong_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.mentoring.stubs.pingpong'
  _HITBALLPROTO._serialized_start=57
  _HITBALLPROTO._serialized_end=89
  _BALLRETURNPROTO._serialized_start=91
  _BALLRETURNPROTO._serialized_end=131
  _PINGPONGSERVICE._serialized_start=133
  _PINGPONGSERVICE._serialized_end=252
# @@protoc_insertion_point(module_scope)

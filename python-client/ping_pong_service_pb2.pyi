from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class BallReturnProto(_message.Message):
    __slots__ = ["canBallReturn"]
    CANBALLRETURN_FIELD_NUMBER: _ClassVar[int]
    canBallReturn: bool
    def __init__(self, canBallReturn: bool = ...) -> None: ...

class HitBallProto(_message.Message):
    __slots__ = ["hitPower"]
    HITPOWER_FIELD_NUMBER: _ClassVar[int]
    hitPower: int
    def __init__(self, hitPower: _Optional[int] = ...) -> None: ...

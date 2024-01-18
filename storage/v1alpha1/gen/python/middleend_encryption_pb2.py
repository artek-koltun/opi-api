# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: middleend_encryption.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1amiddleend_encryption.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\x9a\x02\n\x0f\x45ncryptedVolume\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12,\n\x0fvolume_name_ref\x18\x02 \x01(\tB\x04\xe2\x41\x01\x02R\rvolumeNameRef\x12\x16\n\x03key\x18\x03 \x01(\x0c\x42\x04\xe2\x41\x01\x02R\x03key\x12@\n\x06\x63ipher\x18\x04 \x01(\x0e\x32\".opi_api.storage.v1.EncryptionTypeB\x04\xe2\x41\x01\x02R\x06\x63ipher:e\xea\x41\x62\n\"opi_api.storage.v1/EncryptedVolume\x12\x19\x65ncryptedVolumes/{volume}*\x10\x65ncryptedVolumes2\x0f\x65ncryptedVolume\"\xaa\x01\n\x1c\x43reateEncryptedVolumeRequest\x12T\n\x10\x65ncrypted_volume\x18\x01 \x01(\x0b\x32#.opi_api.storage.v1.EncryptedVolumeB\x04\xe2\x41\x01\x02R\x0f\x65ncryptedVolume\x12\x34\n\x13\x65ncrypted_volume_id\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\x11\x65ncryptedVolumeId\"\x8a\x01\n\x1c\x44\x65leteEncryptedVolumeRequest\x12?\n\x04name\x18\x01 \x01(\tB+\xe2\x41\x01\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolumeR\x04name\x12)\n\rallow_missing\x18\x02 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xe2\x01\n\x1cUpdateEncryptedVolumeRequest\x12T\n\x10\x65ncrypted_volume\x18\x01 \x01(\x0b\x32#.opi_api.storage.v1.EncryptedVolumeB\x04\xe2\x41\x01\x02R\x0f\x65ncryptedVolume\x12\x41\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x04\xe2\x41\x01\x01R\nupdateMask\x12)\n\rallow_missing\x18\x03 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xaa\x01\n\x1bListEncryptedVolumesRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB+\xe2\x41\x01\x02\xfa\x41$\x12\"opi_api.storage.v1/EncryptedVolumeR\x06parent\x12!\n\tpage_size\x18\x02 \x01(\x05\x42\x04\xe2\x41\x01\x01R\x08pageSize\x12#\n\npage_token\x18\x03 \x01(\tB\x04\xe2\x41\x01\x01R\tpageToken\"\x98\x01\n\x1cListEncryptedVolumesResponse\x12P\n\x11\x65ncrypted_volumes\x18\x01 \x03(\x0b\x32#.opi_api.storage.v1.EncryptedVolumeR\x10\x65ncryptedVolumes\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"\\\n\x19GetEncryptedVolumeRequest\x12?\n\x04name\x18\x01 \x01(\tB+\xe2\x41\x01\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolumeR\x04name\"^\n\x1bStatsEncryptedVolumeRequest\x12?\n\x04name\x18\x01 \x01(\tB+\xe2\x41\x01\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolumeR\x04name\"U\n\x1cStatsEncryptedVolumeResponse\x12\x35\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStatsR\x05stats2\xbc\x08\n\x1aMiddleendEncryptionService\x12\xc5\x01\n\x15\x43reateEncryptedVolume\x12\x30.opi_api.storage.v1.CreateEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\"U\xda\x41$encrypted_volume,encrypted_volume_id\x82\xd3\xe4\x93\x02(\"\x14/v1/encryptedVolumes:\x10\x65ncrypted_volume\x12\x8f\x01\n\x15\x44\x65leteEncryptedVolume\x12\x30.opi_api.storage.v1.DeleteEncryptedVolumeRequest\x1a\x16.google.protobuf.Empty\",\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1f*\x1d/v1/{name=encryptedVolumes/*}\x12\xd7\x01\n\x15UpdateEncryptedVolume\x12\x30.opi_api.storage.v1.UpdateEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\"g\xda\x41\x1c\x65ncrypted_volume,update_mask\x82\xd3\xe4\x93\x02\x42\x32./v1/{encrypted_volume.name=encryptedVolumes/*}:\x10\x65ncrypted_volume\x12\xa0\x01\n\x14ListEncryptedVolumes\x12/.opi_api.storage.v1.ListEncryptedVolumesRequest\x1a\x30.opi_api.storage.v1.ListEncryptedVolumesResponse\"%\xda\x41\x06parent\x82\xd3\xe4\x93\x02\x16\x12\x14/v1/{parent=volumes}\x12\x96\x01\n\x12GetEncryptedVolume\x12-.opi_api.storage.v1.GetEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\",\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v1/{name=encryptedVolumes/*}\x12\xad\x01\n\x14StatsEncryptedVolume\x12/.opi_api.storage.v1.StatsEncryptedVolumeRequest\x1a\x30.opi_api.storage.v1.StatsEncryptedVolumeResponse\"2\xda\x41\x04name\x82\xd3\xe4\x93\x02%\x12#/v1/{name=encryptedVolumes/*}:statsBg\n\x12opi_api.storage.v1B\x18MiddleendEncryptionProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'middleend_encryption_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022opi_api.storage.v1B\030MiddleendEncryptionProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['name']._options = None
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['volume_name_ref']._options = None
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['volume_name_ref']._serialized_options = b'\342A\001\002'
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['key']._options = None
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['key']._serialized_options = b'\342A\001\002'
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['cipher']._options = None
  _globals['_ENCRYPTEDVOLUME'].fields_by_name['cipher']._serialized_options = b'\342A\001\002'
  _globals['_ENCRYPTEDVOLUME']._options = None
  _globals['_ENCRYPTEDVOLUME']._serialized_options = b'\352Ab\n\"opi_api.storage.v1/EncryptedVolume\022\031encryptedVolumes/{volume}*\020encryptedVolumes2\017encryptedVolume'
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume']._options = None
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume']._serialized_options = b'\342A\001\002'
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume_id']._options = None
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume_id']._serialized_options = b'\342A\001\001'
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume']._options = None
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['encrypted_volume']._serialized_options = b'\342A\001\002'
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['update_mask']._options = None
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['update_mask']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['parent']._options = None
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['parent']._serialized_options = b'\342A\001\002\372A$\022\"opi_api.storage.v1/EncryptedVolume'
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['page_size']._options = None
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['page_size']._serialized_options = b'\342A\001\001'
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['page_token']._options = None
  _globals['_LISTENCRYPTEDVOLUMESREQUEST'].fields_by_name['page_token']._serialized_options = b'\342A\001\001'
  _globals['_GETENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_GETENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _globals['_STATSENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_STATSENCRYPTEDVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['CreateEncryptedVolume']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['CreateEncryptedVolume']._serialized_options = b'\332A$encrypted_volume,encrypted_volume_id\202\323\344\223\002(\"\024/v1/encryptedVolumes:\020encrypted_volume'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['DeleteEncryptedVolume']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['DeleteEncryptedVolume']._serialized_options = b'\332A\004name\202\323\344\223\002\037*\035/v1/{name=encryptedVolumes/*}'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['UpdateEncryptedVolume']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['UpdateEncryptedVolume']._serialized_options = b'\332A\034encrypted_volume,update_mask\202\323\344\223\002B2./v1/{encrypted_volume.name=encryptedVolumes/*}:\020encrypted_volume'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['ListEncryptedVolumes']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['ListEncryptedVolumes']._serialized_options = b'\332A\006parent\202\323\344\223\002\026\022\024/v1/{parent=volumes}'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['GetEncryptedVolume']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['GetEncryptedVolume']._serialized_options = b'\332A\004name\202\323\344\223\002\037\022\035/v1/{name=encryptedVolumes/*}'
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['StatsEncryptedVolume']._options = None
  _globals['_MIDDLEENDENCRYPTIONSERVICE'].methods_by_name['StatsEncryptedVolume']._serialized_options = b'\332A\004name\202\323\344\223\002%\022#/v1/{name=encryptedVolumes/*}:stats'
  _globals['_ENCRYPTEDVOLUME']._serialized_start=246
  _globals['_ENCRYPTEDVOLUME']._serialized_end=528
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST']._serialized_start=531
  _globals['_CREATEENCRYPTEDVOLUMEREQUEST']._serialized_end=701
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST']._serialized_start=704
  _globals['_DELETEENCRYPTEDVOLUMEREQUEST']._serialized_end=842
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST']._serialized_start=845
  _globals['_UPDATEENCRYPTEDVOLUMEREQUEST']._serialized_end=1071
  _globals['_LISTENCRYPTEDVOLUMESREQUEST']._serialized_start=1074
  _globals['_LISTENCRYPTEDVOLUMESREQUEST']._serialized_end=1244
  _globals['_LISTENCRYPTEDVOLUMESRESPONSE']._serialized_start=1247
  _globals['_LISTENCRYPTEDVOLUMESRESPONSE']._serialized_end=1399
  _globals['_GETENCRYPTEDVOLUMEREQUEST']._serialized_start=1401
  _globals['_GETENCRYPTEDVOLUMEREQUEST']._serialized_end=1493
  _globals['_STATSENCRYPTEDVOLUMEREQUEST']._serialized_start=1495
  _globals['_STATSENCRYPTEDVOLUMEREQUEST']._serialized_end=1589
  _globals['_STATSENCRYPTEDVOLUMERESPONSE']._serialized_start=1591
  _globals['_STATSENCRYPTEDVOLUMERESPONSE']._serialized_end=1676
  _globals['_MIDDLEENDENCRYPTIONSERVICE']._serialized_start=1679
  _globals['_MIDDLEENDENCRYPTIONSERVICE']._serialized_end=2763
# @@protoc_insertion_point(module_scope)

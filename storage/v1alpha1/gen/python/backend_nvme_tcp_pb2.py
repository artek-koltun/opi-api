# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_nvme_tcp.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import object_key_pb2 as object__key__pb2
import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16\x62\x61\x63kend_nvme_tcp.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x10object_key.proto\x1a\x0fopicommon.proto\x1a\nuuid.proto\"\xe9\x01\n\x14NVMfRemoteController\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05hdgst\x18\x02 \x01(\x08\x12\r\n\x05\x64\x64gst\x18\x03 \x01(\x08\x12\x34\n\tmultipath\x18\x04 \x01(\x0e\x32!.opi_api.storage.v1.NvmeMultipath\x12\x17\n\x0fio_queues_count\x18\x05 \x01(\x03\x12\x12\n\nqueue_size\x18\x06 \x01(\x03:B\xea\x41?\n+storage.opiproject.org/NVMfRemoteController\x12\x10volumes/{volume}\"\xe4\x02\n\x08NVMfPath\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x33\n\rcontroller_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x35\n\x06trtype\x18\x03 \x01(\x0e\x32%.opi_api.storage.v1.NvmeTransportType\x12\x35\n\x06\x61\x64rfam\x18\x04 \x01(\x0e\x32%.opi_api.storage.v1.NvmeAddressFamily\x12\x0e\n\x06traddr\x18\x05 \x01(\t\x12\x0f\n\x07trsvcid\x18\x06 \x01(\x03\x12\x0e\n\x06subnqn\x18\x07 \x01(\t\x12\x15\n\rsource_traddr\x18\x08 \x01(\t\x12\x16\n\x0esource_trsvcid\x18\t \x01(\x03\x12\x0f\n\x07hostnqn\x18\n \x01(\t:6\xea\x41\x33\n\x1fstorage.opiproject.org/NVMfPath\x12\x10volumes/{volume}\"\xee\x01\n\x13NVMfRemoteNamespace\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x33\n\rcontroller_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0c\n\x04nsid\x18\x03 \x01(\x05\x12\r\n\x05nguid\x18\x04 \x01(\t\x12\r\n\x05\x65ui64\x18\x05 \x01(\x03\x12%\n\x04uuid\x18\x06 \x01(\x0b\x32\x17.opi_api.common.v1.Uuid:A\xea\x41>\n*storage.opiproject.org/NVMfRemoteNamespace\x12\x10volumes/{volume}\"\x97\x01\n!CreateNVMfRemoteControllerRequest\x12N\n\x17nv_mf_remote_controller\x18\x02 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteControllerB\x03\xe0\x41\x02\x12\"\n\x1anv_mf_remote_controller_id\x18\x03 \x01(\t\"y\n!DeleteNVMfRemoteControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\xb6\x01\n!UpdateNVMfRemoteControllerRequest\x12I\n\x17nv_mf_remote_controller\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"\x8a\x01\n ListNVMfRemoteControllersRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x88\x01\n!ListNVMfRemoteControllersResponse\x12J\n\x18nv_mf_remote_controllers\x18\x01 \x03(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x1eGetNVMfRemoteControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\"L\n NVMfRemoteControllerResetRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"L\n NVMfRemoteControllerStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"S\n!NVMfRemoteControllerStatsResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\x88\x01\n\x1fListNVMfRemoteNamespacesRequest\x12>\n\x06parent\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&opi_api.storage.v1/NVMfRemoteNamespace\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x85\x01\n ListNVMfRemoteNamespacesResponse\x12H\n\x17nv_mf_remote_namespaces\x18\x01 \x03(\x0b\x32\'.opi_api.storage.v1.NVMfRemoteNamespace\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"e\n\x15\x43reateNVMfPathRequest\x12\x35\n\nnv_mf_path\x18\x01 \x01(\x0b\x32\x1c.opi_api.storage.v1.NVMfPathB\x03\xe0\x41\x02\x12\x15\n\rnv_mf_path_id\x18\x02 \x01(\t\"a\n\x15\x44\x65leteNVMfPathRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bopi_api.storage.v1/NVMfPath\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x91\x01\n\x15UpdateNVMfPathRequest\x12\x30\n\nnv_mf_path\x18\x01 \x01(\x0b\x32\x1c.opi_api.storage.v1.NVMfPath\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"r\n\x14ListNVMfPathsRequest\x12\x33\n\x06parent\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bopi_api.storage.v1/NVMfPath\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"c\n\x15ListNVMfPathsResponse\x12\x31\n\x0bnv_mf_paths\x18\x01 \x03(\x0b\x32\x1c.opi_api.storage.v1.NVMfPath\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"G\n\x12GetNVMfPathRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bopi_api.storage.v1/NVMfPath\"@\n\x14NVMfPathStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"G\n\x15NVMfPathStatsResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats*\xb4\x01\n\x11NvmeTransportType\x12#\n\x1fNVME_TRANSPORT_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11NVME_TRANSPORT_FC\x10\x01\x12\x17\n\x13NVME_TRANSPORT_PCIE\x10\x02\x12\x17\n\x13NVME_TRANSPORT_RDMA\x10\x03\x12\x16\n\x12NVME_TRANSPORT_TCP\x10\x04\x12\x19\n\x15NVME_TRANSPORT_CUSTOM\x10\x05*\xa8\x01\n\x11NvmeAddressFamily\x12#\n\x1fNVME_ADDRESS_FAMILY_UNSPECIFIED\x10\x00\x12\x14\n\x10NVMF_ADRFAM_IPV4\x10\x01\x12\x14\n\x10NVMF_ADRFAM_IPV6\x10\x02\x12\x12\n\x0eNVMF_ADRFAM_IB\x10\x03\x12\x12\n\x0eNVMF_ADRFAM_FC\x10\x04\x12\x1a\n\x16NVMF_ADRFAM_INTRA_HOST\x10\x05*\x86\x01\n\rNvmeMultipath\x12\x1e\n\x1aNVME_MULTIPATH_UNSPECIFIED\x10\x00\x12\x1a\n\x16NVME_MULTIPATH_DISABLE\x10\x01\x12\x1b\n\x17NVME_MULTIPATH_FAILOVER\x10\x02\x12\x1c\n\x18NVME_MULTIPATH_MULTIPATH\x10\x03\x32\xef\x11\n\x1bNVMfRemoteControllerService\x12\xe0\x01\n\x1a\x43reateNVMfRemoteController\x12\x35.opi_api.storage.v1.CreateNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"a\x82\xd3\xe4\x93\x02&\"\x0b/v1/volumes:\x17nv_mf_remote_controller\xda\x41\x32nv_mf_remote_controller,nv_mf_remote_controller_id\x12\x9d\x01\n\x1a\x44\x65leteNVMfRemoteController\x12\x35.opi_api.storage.v1.DeleteNVMfRemoteControllerRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\xf3\x01\n\x1aUpdateNVMfRemoteController\x12\x35.opi_api.storage.v1.UpdateNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"t\x82\xd3\xe4\x93\x02H2-/v1/{nv_mf_remote_controller.name=subsystems}:\x17nv_mf_remote_controller\xda\x41#nv_mf_remote_controller,update_mask\x12\xb2\x01\n\x19ListNVMfRemoteControllers\x12\x34.opi_api.storage.v1.ListNVMfRemoteControllersRequest\x1a\x35.opi_api.storage.v1.ListNVMfRemoteControllersResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\xa9\x01\n\x17GetNVMfRemoteController\x12\x32.opi_api.storage.v1.GetNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12k\n\x19NVMfRemoteControllerReset\x12\x34.opi_api.storage.v1.NVMfRemoteControllerResetRequest\x1a\x16.google.protobuf.Empty\"\x00\x12\x8a\x01\n\x19NVMfRemoteControllerStats\x12\x34.opi_api.storage.v1.NVMfRemoteControllerStatsRequest\x1a\x35.opi_api.storage.v1.NVMfRemoteControllerStatsResponse\"\x00\x12\xaf\x01\n\x18ListNVMfRemoteNamespaces\x12\x33.opi_api.storage.v1.ListNVMfRemoteNamespacesRequest\x1a\x34.opi_api.storage.v1.ListNVMfRemoteNamespacesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x95\x01\n\x0e\x43reateNVMfPath\x12).opi_api.storage.v1.CreateNVMfPathRequest\x1a\x1c.opi_api.storage.v1.NVMfPath\":\x82\xd3\xe4\x93\x02\x19\"\x0b/v1/volumes:\nnv_mf_path\xda\x41\x18nv_mf_path,nv_mf_path_id\x12\x85\x01\n\x0e\x44\x65leteNVMfPath\x12).opi_api.storage.v1.DeleteNVMfPathRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\xa8\x01\n\x0eUpdateNVMfPath\x12).opi_api.storage.v1.UpdateNVMfPathRequest\x1a\x1c.opi_api.storage.v1.NVMfPath\"M\x82\xd3\xe4\x93\x02.2 /v1/{nv_mf_path.name=subsystems}:\nnv_mf_path\xda\x41\x16nv_mf_path,update_mask\x12\x8e\x01\n\rListNVMfPaths\x12(.opi_api.storage.v1.ListNVMfPathsRequest\x1a).opi_api.storage.v1.ListNVMfPathsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x85\x01\n\x0bGetNVMfPath\x12&.opi_api.storage.v1.GetNVMfPathRequest\x1a\x1c.opi_api.storage.v1.NVMfPath\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\x66\n\rNVMfPathStats\x12(.opi_api.storage.v1.NVMfPathStatsRequest\x1a).opi_api.storage.v1.NVMfPathStatsResponse\"\x00\x42\x62\n\x12opi_api.storage.v1B\x13\x42\x61\x63kendNvmeTcpProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_NVMETRANSPORTTYPE = DESCRIPTOR.enum_types_by_name['NvmeTransportType']
NvmeTransportType = enum_type_wrapper.EnumTypeWrapper(_NVMETRANSPORTTYPE)
_NVMEADDRESSFAMILY = DESCRIPTOR.enum_types_by_name['NvmeAddressFamily']
NvmeAddressFamily = enum_type_wrapper.EnumTypeWrapper(_NVMEADDRESSFAMILY)
_NVMEMULTIPATH = DESCRIPTOR.enum_types_by_name['NvmeMultipath']
NvmeMultipath = enum_type_wrapper.EnumTypeWrapper(_NVMEMULTIPATH)
NVME_TRANSPORT_TYPE_UNSPECIFIED = 0
NVME_TRANSPORT_FC = 1
NVME_TRANSPORT_PCIE = 2
NVME_TRANSPORT_RDMA = 3
NVME_TRANSPORT_TCP = 4
NVME_TRANSPORT_CUSTOM = 5
NVME_ADDRESS_FAMILY_UNSPECIFIED = 0
NVMF_ADRFAM_IPV4 = 1
NVMF_ADRFAM_IPV6 = 2
NVMF_ADRFAM_IB = 3
NVMF_ADRFAM_FC = 4
NVMF_ADRFAM_INTRA_HOST = 5
NVME_MULTIPATH_UNSPECIFIED = 0
NVME_MULTIPATH_DISABLE = 1
NVME_MULTIPATH_FAILOVER = 2
NVME_MULTIPATH_MULTIPATH = 3


_NVMFREMOTECONTROLLER = DESCRIPTOR.message_types_by_name['NVMfRemoteController']
_NVMFPATH = DESCRIPTOR.message_types_by_name['NVMfPath']
_NVMFREMOTENAMESPACE = DESCRIPTOR.message_types_by_name['NVMfRemoteNamespace']
_CREATENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMfRemoteControllerRequest']
_DELETENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMfRemoteControllerRequest']
_UPDATENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMfRemoteControllerRequest']
_LISTNVMFREMOTECONTROLLERSREQUEST = DESCRIPTOR.message_types_by_name['ListNVMfRemoteControllersRequest']
_LISTNVMFREMOTECONTROLLERSRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMfRemoteControllersResponse']
_GETNVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetNVMfRemoteControllerRequest']
_NVMFREMOTECONTROLLERRESETREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerResetRequest']
_NVMFREMOTECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsRequest']
_NVMFREMOTECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsResponse']
_LISTNVMFREMOTENAMESPACESREQUEST = DESCRIPTOR.message_types_by_name['ListNVMfRemoteNamespacesRequest']
_LISTNVMFREMOTENAMESPACESRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMfRemoteNamespacesResponse']
_CREATENVMFPATHREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMfPathRequest']
_DELETENVMFPATHREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMfPathRequest']
_UPDATENVMFPATHREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMfPathRequest']
_LISTNVMFPATHSREQUEST = DESCRIPTOR.message_types_by_name['ListNVMfPathsRequest']
_LISTNVMFPATHSRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMfPathsResponse']
_GETNVMFPATHREQUEST = DESCRIPTOR.message_types_by_name['GetNVMfPathRequest']
_NVMFPATHSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMfPathStatsRequest']
_NVMFPATHSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMfPathStatsResponse']
NVMfRemoteController = _reflection.GeneratedProtocolMessageType('NVMfRemoteController', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLER,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteController)
  })
_sym_db.RegisterMessage(NVMfRemoteController)

NVMfPath = _reflection.GeneratedProtocolMessageType('NVMfPath', (_message.Message,), {
  'DESCRIPTOR' : _NVMFPATH,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfPath)
  })
_sym_db.RegisterMessage(NVMfPath)

NVMfRemoteNamespace = _reflection.GeneratedProtocolMessageType('NVMfRemoteNamespace', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTENAMESPACE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteNamespace)
  })
_sym_db.RegisterMessage(NVMfRemoteNamespace)

CreateNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('CreateNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(CreateNVMfRemoteControllerRequest)

DeleteNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(DeleteNVMfRemoteControllerRequest)

UpdateNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(UpdateNVMfRemoteControllerRequest)

ListNVMfRemoteControllersRequest = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteControllersRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTECONTROLLERSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteControllersRequest)
  })
_sym_db.RegisterMessage(ListNVMfRemoteControllersRequest)

ListNVMfRemoteControllersResponse = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteControllersResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTECONTROLLERSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteControllersResponse)
  })
_sym_db.RegisterMessage(ListNVMfRemoteControllersResponse)

GetNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('GetNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(GetNVMfRemoteControllerRequest)

NVMfRemoteControllerResetRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerResetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERRESETREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerResetRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerResetRequest)

NVMfRemoteControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsRequest)

NVMfRemoteControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsResponse)

ListNVMfRemoteNamespacesRequest = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteNamespacesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTENAMESPACESREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteNamespacesRequest)
  })
_sym_db.RegisterMessage(ListNVMfRemoteNamespacesRequest)

ListNVMfRemoteNamespacesResponse = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteNamespacesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTENAMESPACESRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)
  })
_sym_db.RegisterMessage(ListNVMfRemoteNamespacesResponse)

CreateNVMfPathRequest = _reflection.GeneratedProtocolMessageType('CreateNVMfPathRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMFPATHREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMfPathRequest)
  })
_sym_db.RegisterMessage(CreateNVMfPathRequest)

DeleteNVMfPathRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMfPathRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMFPATHREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMfPathRequest)
  })
_sym_db.RegisterMessage(DeleteNVMfPathRequest)

UpdateNVMfPathRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMfPathRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMFPATHREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMfPathRequest)
  })
_sym_db.RegisterMessage(UpdateNVMfPathRequest)

ListNVMfPathsRequest = _reflection.GeneratedProtocolMessageType('ListNVMfPathsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFPATHSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfPathsRequest)
  })
_sym_db.RegisterMessage(ListNVMfPathsRequest)

ListNVMfPathsResponse = _reflection.GeneratedProtocolMessageType('ListNVMfPathsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFPATHSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfPathsResponse)
  })
_sym_db.RegisterMessage(ListNVMfPathsResponse)

GetNVMfPathRequest = _reflection.GeneratedProtocolMessageType('GetNVMfPathRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMFPATHREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMfPathRequest)
  })
_sym_db.RegisterMessage(GetNVMfPathRequest)

NVMfPathStatsRequest = _reflection.GeneratedProtocolMessageType('NVMfPathStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFPATHSTATSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfPathStatsRequest)
  })
_sym_db.RegisterMessage(NVMfPathStatsRequest)

NVMfPathStatsResponse = _reflection.GeneratedProtocolMessageType('NVMfPathStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFPATHSTATSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfPathStatsResponse)
  })
_sym_db.RegisterMessage(NVMfPathStatsResponse)

_NVMFREMOTECONTROLLERSERVICE = DESCRIPTOR.services_by_name['NVMfRemoteControllerService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\023BackendNvmeTcpProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NVMFREMOTECONTROLLER._options = None
  _NVMFREMOTECONTROLLER._serialized_options = b'\352A?\n+storage.opiproject.org/NVMfRemoteController\022\020volumes/{volume}'
  _NVMFPATH._options = None
  _NVMFPATH._serialized_options = b'\352A3\n\037storage.opiproject.org/NVMfPath\022\020volumes/{volume}'
  _NVMFREMOTENAMESPACE._options = None
  _NVMFREMOTENAMESPACE._serialized_options = b'\352A>\n*storage.opiproject.org/NVMfRemoteNamespace\022\020volumes/{volume}'
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['nv_mf_remote_controller']._options = None
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['nv_mf_remote_controller']._serialized_options = b'\340A\002'
  _DELETENVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETENVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _LISTNVMFREMOTECONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMFREMOTECONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _GETNVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETNVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _LISTNVMFREMOTENAMESPACESREQUEST.fields_by_name['parent']._options = None
  _LISTNVMFREMOTENAMESPACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A(\n&opi_api.storage.v1/NVMfRemoteNamespace'
  _CREATENVMFPATHREQUEST.fields_by_name['nv_mf_path']._options = None
  _CREATENVMFPATHREQUEST.fields_by_name['nv_mf_path']._serialized_options = b'\340A\002'
  _DELETENVMFPATHREQUEST.fields_by_name['name']._options = None
  _DELETENVMFPATHREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033opi_api.storage.v1/NVMfPath'
  _LISTNVMFPATHSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMFPATHSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\035\n\033opi_api.storage.v1/NVMfPath'
  _GETNVMFPATHREQUEST.fields_by_name['name']._options = None
  _GETNVMFPATHREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033opi_api.storage.v1/NVMfPath'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfRemoteController']._serialized_options = b'\202\323\344\223\002&\"\013/v1/volumes:\027nv_mf_remote_controller\332A2nv_mf_remote_controller,nv_mf_remote_controller_id'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfRemoteController']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfRemoteController']._serialized_options = b'\202\323\344\223\002H2-/v1/{nv_mf_remote_controller.name=subsystems}:\027nv_mf_remote_controller\332A#nv_mf_remote_controller,update_mask'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteControllers']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteControllers']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfRemoteController']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteNamespaces']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteNamespaces']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfPath']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfPath']._serialized_options = b'\202\323\344\223\002\031\"\013/v1/volumes:\nnv_mf_path\332A\030nv_mf_path,nv_mf_path_id'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfPath']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfPath']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfPath']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfPath']._serialized_options = b'\202\323\344\223\002.2 /v1/{nv_mf_path.name=subsystems}:\nnv_mf_path\332A\026nv_mf_path,update_mask'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfPaths']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfPaths']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfPath']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfPath']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMETRANSPORTTYPE._serialized_start=3242
  _NVMETRANSPORTTYPE._serialized_end=3422
  _NVMEADDRESSFAMILY._serialized_start=3425
  _NVMEADDRESSFAMILY._serialized_end=3593
  _NVMEMULTIPATH._serialized_start=3596
  _NVMEMULTIPATH._serialized_end=3730
  _NVMFREMOTECONTROLLER._serialized_start=272
  _NVMFREMOTECONTROLLER._serialized_end=505
  _NVMFPATH._serialized_start=508
  _NVMFPATH._serialized_end=864
  _NVMFREMOTENAMESPACE._serialized_start=867
  _NVMFREMOTENAMESPACE._serialized_end=1105
  _CREATENVMFREMOTECONTROLLERREQUEST._serialized_start=1108
  _CREATENVMFREMOTECONTROLLERREQUEST._serialized_end=1259
  _DELETENVMFREMOTECONTROLLERREQUEST._serialized_start=1261
  _DELETENVMFREMOTECONTROLLERREQUEST._serialized_end=1382
  _UPDATENVMFREMOTECONTROLLERREQUEST._serialized_start=1385
  _UPDATENVMFREMOTECONTROLLERREQUEST._serialized_end=1567
  _LISTNVMFREMOTECONTROLLERSREQUEST._serialized_start=1570
  _LISTNVMFREMOTECONTROLLERSREQUEST._serialized_end=1708
  _LISTNVMFREMOTECONTROLLERSRESPONSE._serialized_start=1711
  _LISTNVMFREMOTECONTROLLERSRESPONSE._serialized_end=1847
  _GETNVMFREMOTECONTROLLERREQUEST._serialized_start=1849
  _GETNVMFREMOTECONTROLLERREQUEST._serialized_end=1944
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_start=1946
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_end=2022
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_start=2024
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_end=2100
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_start=2102
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_end=2185
  _LISTNVMFREMOTENAMESPACESREQUEST._serialized_start=2188
  _LISTNVMFREMOTENAMESPACESREQUEST._serialized_end=2324
  _LISTNVMFREMOTENAMESPACESRESPONSE._serialized_start=2327
  _LISTNVMFREMOTENAMESPACESRESPONSE._serialized_end=2460
  _CREATENVMFPATHREQUEST._serialized_start=2462
  _CREATENVMFPATHREQUEST._serialized_end=2563
  _DELETENVMFPATHREQUEST._serialized_start=2565
  _DELETENVMFPATHREQUEST._serialized_end=2662
  _UPDATENVMFPATHREQUEST._serialized_start=2665
  _UPDATENVMFPATHREQUEST._serialized_end=2810
  _LISTNVMFPATHSREQUEST._serialized_start=2812
  _LISTNVMFPATHSREQUEST._serialized_end=2926
  _LISTNVMFPATHSRESPONSE._serialized_start=2928
  _LISTNVMFPATHSRESPONSE._serialized_end=3027
  _GETNVMFPATHREQUEST._serialized_start=3029
  _GETNVMFPATHREQUEST._serialized_end=3100
  _NVMFPATHSTATSREQUEST._serialized_start=3102
  _NVMFPATHSTATSREQUEST._serialized_end=3166
  _NVMFPATHSTATSRESPONSE._serialized_start=3168
  _NVMFPATHSTATSRESPONSE._serialized_end=3239
  _NVMFREMOTECONTROLLERSERVICE._serialized_start=3733
  _NVMFREMOTECONTROLLERSERVICE._serialized_end=6020
# @@protoc_insertion_point(module_scope)

# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: l3_xpu_infra_mgr.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16l3_xpu_infra_mgr.proto\x12 opi_api.network.evpn_gw.v1alpha1\x1a\x12networktypes.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x19google/api/resource.proto\"\xf1\x01\n\x03Vrf\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12\x43\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.evpn_gw.v1alpha1.VrfSpecB\x04\xe2\x41\x01\x02R\x04spec\x12I\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.VrfStatusB\x04\xe2\x41\x01\x03R\x06status:@\xea\x41=\n$opi_api.network.evpn_gw.v1alpha1/Vrf\x12\nvrfs/{vrf}*\x04vrfs2\x03vrf\"\xf0\x01\n\x07VrfSpec\x12\x1b\n\x03vni\x18\x01 \x01(\rB\x04\xe2\x41\x01\x01H\x00R\x03vni\x88\x01\x01\x12\x63\n\x12loopback_ip_prefix\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x04\xe2\x41\x01\x02R\x10loopbackIpPrefix\x12[\n\x0evtep_ip_prefix\x18\x03 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x04\xe2\x41\x01\x01R\x0cvtepIpPrefixB\x06\n\x04_vni\"\xd8\x02\n\tVrfStatus\x12)\n\rrouting_table\x18\x01 \x01(\rB\x04\xe2\x41\x01\x03R\x0croutingTable\x12\x1f\n\x08local_as\x18\x02 \x01(\rB\x04\xe2\x41\x01\x03R\x07localAs\x12\x14\n\x02rd\x18\x03 \x01(\tB\x04\xe2\x41\x01\x03R\x02rd\x12\x18\n\x04rmac\x18\x04 \x01(\x0c\x42\x04\xe2\x41\x01\x03R\x04rmac\x12#\n\nimport_rts\x18\x05 \x03(\tB\x04\xe2\x41\x01\x03R\timportRts\x12#\n\nexport_rts\x18\x06 \x03(\tB\x04\xe2\x41\x01\x03R\texportRts\x12-\n\x0flogical_bridges\x18\x07 \x03(\tB\x04\xe2\x41\x01\x03R\x0elogicalBridges\x12V\n\x0boper_status\x18\x08 \x01(\x0e\x32/.opi_api.network.evpn_gw.v1alpha1.VRFOperStatusB\x04\xe2\x41\x01\x03R\noperStatus\"n\n\x10\x43reateVrfRequest\x12\x1b\n\x06vrf_id\x18\x01 \x01(\tB\x04\xe2\x41\x01\x01R\x05vrfId\x12=\n\x03vrf\x18\x02 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.VrfB\x04\xe2\x41\x01\x02R\x03vrf\"Y\n\x0fListVrfsRequest\x12!\n\tpage_size\x18\x01 \x01(\x05\x42\x04\xe2\x41\x01\x01R\x08pageSize\x12#\n\npage_token\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\tpageToken\"u\n\x10ListVrfsResponse\x12\x39\n\x04vrfs\x18\x01 \x03(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.VrfR\x04vrfs\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"R\n\rGetVrfRequest\x12\x41\n\x04name\x18\x01 \x01(\tB-\xe2\x41\x01\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/VrfR\x04name\"\x80\x01\n\x10\x44\x65leteVrfRequest\x12\x41\n\x04name\x18\x01 \x01(\tB-\xe2\x41\x01\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/VrfR\x04name\x12)\n\rallow_missing\x18\x02 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xbf\x01\n\x10UpdateVrfRequest\x12=\n\x03vrf\x18\x01 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.VrfB\x04\xe2\x41\x01\x02R\x03vrf\x12\x41\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x04\xe2\x41\x01\x01R\nupdateMask\x12)\n\rallow_missing\x18\x03 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xf1\x01\n\x03Svi\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12\x43\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.evpn_gw.v1alpha1.SviSpecB\x04\xe2\x41\x01\x02R\x04spec\x12I\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.SviStatusB\x04\xe2\x41\x01\x03R\x06status:@\xea\x41=\n$opi_api.network.evpn_gw.v1alpha1/Svi\x12\nsvis/{svi}*\x04svis2\x03svi\"\xf2\x02\n\x07SviSpec\x12?\n\x03vrf\x18\x01 \x01(\tB-\xe2\x41\x01\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/VrfR\x03vrf\x12^\n\x0elogical_bridge\x18\x02 \x01(\tB7\xe2\x41\x01\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridgeR\rlogicalBridge\x12%\n\x0bmac_address\x18\x03 \x01(\x0c\x42\x04\xe2\x41\x01\x02R\nmacAddress\x12W\n\x0cgw_ip_prefix\x18\x04 \x03(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x04\xe2\x41\x01\x02R\ngwIpPrefix\x12#\n\nenable_bgp\x18\x05 \x01(\x08\x42\x04\xe2\x41\x01\x01R\tenableBgp\x12!\n\tremote_as\x18\x06 \x01(\rB\x04\xe2\x41\x01\x01R\x08remoteAs\"c\n\tSviStatus\x12V\n\x0boper_status\x18\x01 \x01(\x0e\x32/.opi_api.network.evpn_gw.v1alpha1.SVIOperStatusB\x04\xe2\x41\x01\x03R\noperStatus\"n\n\x10\x43reateSviRequest\x12\x1b\n\x06svi_id\x18\x01 \x01(\tB\x04\xe2\x41\x01\x01R\x05sviId\x12=\n\x03svi\x18\x02 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.SviB\x04\xe2\x41\x01\x02R\x03svi\"Y\n\x0fListSvisRequest\x12!\n\tpage_size\x18\x01 \x01(\x05\x42\x04\xe2\x41\x01\x01R\x08pageSize\x12#\n\npage_token\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\tpageToken\"u\n\x10ListSvisResponse\x12\x39\n\x04svis\x18\x01 \x03(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.SviR\x04svis\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"R\n\rGetSviRequest\x12\x41\n\x04name\x18\x01 \x01(\tB-\xe2\x41\x01\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/SviR\x04name\"\x80\x01\n\x10\x44\x65leteSviRequest\x12\x41\n\x04name\x18\x01 \x01(\tB-\xe2\x41\x01\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/SviR\x04name\x12)\n\rallow_missing\x18\x02 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xbf\x01\n\x10UpdateSviRequest\x12=\n\x03svi\x18\x01 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.SviB\x04\xe2\x41\x01\x02R\x03svi\x12\x41\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x04\xe2\x41\x01\x01R\nupdateMask\x12)\n\rallow_missing\x18\x03 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing*b\n\rVRFOperStatus\x12\x1f\n\x1bVRF_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x16\n\x12VRF_OPER_STATUS_UP\x10\x01\x12\x18\n\x14VRF_OPER_STATUS_DOWN\x10\x02*b\n\rSVIOperStatus\x12\x1f\n\x1bSVI_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x16\n\x12SVI_OPER_STATUS_UP\x10\x01\x12\x18\n\x14SVI_OPER_STATUS_DOWN\x10\x02\x32\xbe\x05\n\nVrfService\x12\x8a\x01\n\tCreateVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\"\"\xda\x41\nvrf,vrf_id\x82\xd3\xe4\x93\x02\x0f\"\x08/v1/vrfs:\x03vrf\x12\x83\x01\n\x08ListVrfs\x12\x31.opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest\x1a\x32.opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse\"\x10\x82\xd3\xe4\x93\x02\n\x12\x08/v1/vrfs\x12\x82\x01\n\x06GetVrf\x12/.opi_api.network.evpn_gw.v1alpha1.GetVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\" \xda\x41\x04name\x82\xd3\xe4\x93\x02\x13\x12\x11/v1/{name=vrfs/*}\x12y\n\tDeleteVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest\x1a\x16.google.protobuf.Empty\" \xda\x41\x04name\x82\xd3\xe4\x93\x02\x13*\x11/v1/{name=vrfs/*}\x12\x9c\x01\n\tUpdateVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.UpdateVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\"4\xda\x41\x0fvrf,update_mask\x82\xd3\xe4\x93\x02\x1c\x32\x15/v1/{vrf.name=vrfs/*}:\x03vrf2\xbe\x05\n\nSviService\x12\x8a\x01\n\tCreateSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.CreateSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\"\"\xda\x41\nsvi,svi_id\x82\xd3\xe4\x93\x02\x0f\"\x08/v1/svis:\x03svi\x12\x83\x01\n\x08ListSvis\x12\x31.opi_api.network.evpn_gw.v1alpha1.ListSvisRequest\x1a\x32.opi_api.network.evpn_gw.v1alpha1.ListSvisResponse\"\x10\x82\xd3\xe4\x93\x02\n\x12\x08/v1/svis\x12\x82\x01\n\x06GetSvi\x12/.opi_api.network.evpn_gw.v1alpha1.GetSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\" \xda\x41\x04name\x82\xd3\xe4\x93\x02\x13\x12\x11/v1/{name=svis/*}\x12y\n\tDeleteSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest\x1a\x16.google.protobuf.Empty\" \xda\x41\x04name\x82\xd3\xe4\x93\x02\x13*\x11/v1/{name=svis/*}\x12\x9c\x01\n\tUpdateSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.UpdateSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\"4\xda\x41\x0fsvi,update_mask\x82\xd3\xe4\x93\x02\x1c\x32\x15/v1/{svi.name=svis/*}:\x03sviBw\n opi_api.network.evpn_gw.v1alpha1B\x12L3XpuInfraMgrProtoP\x01Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'l3_xpu_infra_mgr_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n opi_api.network.evpn_gw.v1alpha1B\022L3XpuInfraMgrProtoP\001Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/go'
  _globals['_VRF'].fields_by_name['name']._options = None
  _globals['_VRF'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_VRF'].fields_by_name['spec']._options = None
  _globals['_VRF'].fields_by_name['spec']._serialized_options = b'\342A\001\002'
  _globals['_VRF'].fields_by_name['status']._options = None
  _globals['_VRF'].fields_by_name['status']._serialized_options = b'\342A\001\003'
  _globals['_VRF']._options = None
  _globals['_VRF']._serialized_options = b'\352A=\n$opi_api.network.evpn_gw.v1alpha1/Vrf\022\nvrfs/{vrf}*\004vrfs2\003vrf'
  _globals['_VRFSPEC'].fields_by_name['vni']._options = None
  _globals['_VRFSPEC'].fields_by_name['vni']._serialized_options = b'\342A\001\001'
  _globals['_VRFSPEC'].fields_by_name['loopback_ip_prefix']._options = None
  _globals['_VRFSPEC'].fields_by_name['loopback_ip_prefix']._serialized_options = b'\342A\001\002'
  _globals['_VRFSPEC'].fields_by_name['vtep_ip_prefix']._options = None
  _globals['_VRFSPEC'].fields_by_name['vtep_ip_prefix']._serialized_options = b'\342A\001\001'
  _globals['_VRFSTATUS'].fields_by_name['routing_table']._options = None
  _globals['_VRFSTATUS'].fields_by_name['routing_table']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['local_as']._options = None
  _globals['_VRFSTATUS'].fields_by_name['local_as']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['rd']._options = None
  _globals['_VRFSTATUS'].fields_by_name['rd']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['rmac']._options = None
  _globals['_VRFSTATUS'].fields_by_name['rmac']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['import_rts']._options = None
  _globals['_VRFSTATUS'].fields_by_name['import_rts']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['export_rts']._options = None
  _globals['_VRFSTATUS'].fields_by_name['export_rts']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['logical_bridges']._options = None
  _globals['_VRFSTATUS'].fields_by_name['logical_bridges']._serialized_options = b'\342A\001\003'
  _globals['_VRFSTATUS'].fields_by_name['oper_status']._options = None
  _globals['_VRFSTATUS'].fields_by_name['oper_status']._serialized_options = b'\342A\001\003'
  _globals['_CREATEVRFREQUEST'].fields_by_name['vrf_id']._options = None
  _globals['_CREATEVRFREQUEST'].fields_by_name['vrf_id']._serialized_options = b'\342A\001\001'
  _globals['_CREATEVRFREQUEST'].fields_by_name['vrf']._options = None
  _globals['_CREATEVRFREQUEST'].fields_by_name['vrf']._serialized_options = b'\342A\001\002'
  _globals['_LISTVRFSREQUEST'].fields_by_name['page_size']._options = None
  _globals['_LISTVRFSREQUEST'].fields_by_name['page_size']._serialized_options = b'\342A\001\001'
  _globals['_LISTVRFSREQUEST'].fields_by_name['page_token']._options = None
  _globals['_LISTVRFSREQUEST'].fields_by_name['page_token']._serialized_options = b'\342A\001\001'
  _globals['_GETVRFREQUEST'].fields_by_name['name']._options = None
  _globals['_GETVRFREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _globals['_DELETEVRFREQUEST'].fields_by_name['name']._options = None
  _globals['_DELETEVRFREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _globals['_DELETEVRFREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_DELETEVRFREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEVRFREQUEST'].fields_by_name['vrf']._options = None
  _globals['_UPDATEVRFREQUEST'].fields_by_name['vrf']._serialized_options = b'\342A\001\002'
  _globals['_UPDATEVRFREQUEST'].fields_by_name['update_mask']._options = None
  _globals['_UPDATEVRFREQUEST'].fields_by_name['update_mask']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEVRFREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_UPDATEVRFREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_SVI'].fields_by_name['name']._options = None
  _globals['_SVI'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_SVI'].fields_by_name['spec']._options = None
  _globals['_SVI'].fields_by_name['spec']._serialized_options = b'\342A\001\002'
  _globals['_SVI'].fields_by_name['status']._options = None
  _globals['_SVI'].fields_by_name['status']._serialized_options = b'\342A\001\003'
  _globals['_SVI']._options = None
  _globals['_SVI']._serialized_options = b'\352A=\n$opi_api.network.evpn_gw.v1alpha1/Svi\022\nsvis/{svi}*\004svis2\003svi'
  _globals['_SVISPEC'].fields_by_name['vrf']._options = None
  _globals['_SVISPEC'].fields_by_name['vrf']._serialized_options = b'\342A\001\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _globals['_SVISPEC'].fields_by_name['logical_bridge']._options = None
  _globals['_SVISPEC'].fields_by_name['logical_bridge']._serialized_options = b'\342A\001\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _globals['_SVISPEC'].fields_by_name['mac_address']._options = None
  _globals['_SVISPEC'].fields_by_name['mac_address']._serialized_options = b'\342A\001\002'
  _globals['_SVISPEC'].fields_by_name['gw_ip_prefix']._options = None
  _globals['_SVISPEC'].fields_by_name['gw_ip_prefix']._serialized_options = b'\342A\001\002'
  _globals['_SVISPEC'].fields_by_name['enable_bgp']._options = None
  _globals['_SVISPEC'].fields_by_name['enable_bgp']._serialized_options = b'\342A\001\001'
  _globals['_SVISPEC'].fields_by_name['remote_as']._options = None
  _globals['_SVISPEC'].fields_by_name['remote_as']._serialized_options = b'\342A\001\001'
  _globals['_SVISTATUS'].fields_by_name['oper_status']._options = None
  _globals['_SVISTATUS'].fields_by_name['oper_status']._serialized_options = b'\342A\001\003'
  _globals['_CREATESVIREQUEST'].fields_by_name['svi_id']._options = None
  _globals['_CREATESVIREQUEST'].fields_by_name['svi_id']._serialized_options = b'\342A\001\001'
  _globals['_CREATESVIREQUEST'].fields_by_name['svi']._options = None
  _globals['_CREATESVIREQUEST'].fields_by_name['svi']._serialized_options = b'\342A\001\002'
  _globals['_LISTSVISREQUEST'].fields_by_name['page_size']._options = None
  _globals['_LISTSVISREQUEST'].fields_by_name['page_size']._serialized_options = b'\342A\001\001'
  _globals['_LISTSVISREQUEST'].fields_by_name['page_token']._options = None
  _globals['_LISTSVISREQUEST'].fields_by_name['page_token']._serialized_options = b'\342A\001\001'
  _globals['_GETSVIREQUEST'].fields_by_name['name']._options = None
  _globals['_GETSVIREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Svi'
  _globals['_DELETESVIREQUEST'].fields_by_name['name']._options = None
  _globals['_DELETESVIREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Svi'
  _globals['_DELETESVIREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_DELETESVIREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_UPDATESVIREQUEST'].fields_by_name['svi']._options = None
  _globals['_UPDATESVIREQUEST'].fields_by_name['svi']._serialized_options = b'\342A\001\002'
  _globals['_UPDATESVIREQUEST'].fields_by_name['update_mask']._options = None
  _globals['_UPDATESVIREQUEST'].fields_by_name['update_mask']._serialized_options = b'\342A\001\001'
  _globals['_UPDATESVIREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_UPDATESVIREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_VRFSERVICE'].methods_by_name['CreateVrf']._options = None
  _globals['_VRFSERVICE'].methods_by_name['CreateVrf']._serialized_options = b'\332A\nvrf,vrf_id\202\323\344\223\002\017\"\010/v1/vrfs:\003vrf'
  _globals['_VRFSERVICE'].methods_by_name['ListVrfs']._options = None
  _globals['_VRFSERVICE'].methods_by_name['ListVrfs']._serialized_options = b'\202\323\344\223\002\n\022\010/v1/vrfs'
  _globals['_VRFSERVICE'].methods_by_name['GetVrf']._options = None
  _globals['_VRFSERVICE'].methods_by_name['GetVrf']._serialized_options = b'\332A\004name\202\323\344\223\002\023\022\021/v1/{name=vrfs/*}'
  _globals['_VRFSERVICE'].methods_by_name['DeleteVrf']._options = None
  _globals['_VRFSERVICE'].methods_by_name['DeleteVrf']._serialized_options = b'\332A\004name\202\323\344\223\002\023*\021/v1/{name=vrfs/*}'
  _globals['_VRFSERVICE'].methods_by_name['UpdateVrf']._options = None
  _globals['_VRFSERVICE'].methods_by_name['UpdateVrf']._serialized_options = b'\332A\017vrf,update_mask\202\323\344\223\002\0342\025/v1/{vrf.name=vrfs/*}:\003vrf'
  _globals['_SVISERVICE'].methods_by_name['CreateSvi']._options = None
  _globals['_SVISERVICE'].methods_by_name['CreateSvi']._serialized_options = b'\332A\nsvi,svi_id\202\323\344\223\002\017\"\010/v1/svis:\003svi'
  _globals['_SVISERVICE'].methods_by_name['ListSvis']._options = None
  _globals['_SVISERVICE'].methods_by_name['ListSvis']._serialized_options = b'\202\323\344\223\002\n\022\010/v1/svis'
  _globals['_SVISERVICE'].methods_by_name['GetSvi']._options = None
  _globals['_SVISERVICE'].methods_by_name['GetSvi']._serialized_options = b'\332A\004name\202\323\344\223\002\023\022\021/v1/{name=svis/*}'
  _globals['_SVISERVICE'].methods_by_name['DeleteSvi']._options = None
  _globals['_SVISERVICE'].methods_by_name['DeleteSvi']._serialized_options = b'\332A\004name\202\323\344\223\002\023*\021/v1/{name=svis/*}'
  _globals['_SVISERVICE'].methods_by_name['UpdateSvi']._options = None
  _globals['_SVISERVICE'].methods_by_name['UpdateSvi']._serialized_options = b'\332A\017svi,update_mask\202\323\344\223\002\0342\025/v1/{svi.name=svis/*}:\003svi'
  _globals['_VRFOPERSTATUS']._serialized_start=3272
  _globals['_VRFOPERSTATUS']._serialized_end=3370
  _globals['_SVIOPERSTATUS']._serialized_start=3372
  _globals['_SVIOPERSTATUS']._serialized_end=3470
  _globals['_VRF']._serialized_start=259
  _globals['_VRF']._serialized_end=500
  _globals['_VRFSPEC']._serialized_start=503
  _globals['_VRFSPEC']._serialized_end=743
  _globals['_VRFSTATUS']._serialized_start=746
  _globals['_VRFSTATUS']._serialized_end=1090
  _globals['_CREATEVRFREQUEST']._serialized_start=1092
  _globals['_CREATEVRFREQUEST']._serialized_end=1202
  _globals['_LISTVRFSREQUEST']._serialized_start=1204
  _globals['_LISTVRFSREQUEST']._serialized_end=1293
  _globals['_LISTVRFSRESPONSE']._serialized_start=1295
  _globals['_LISTVRFSRESPONSE']._serialized_end=1412
  _globals['_GETVRFREQUEST']._serialized_start=1414
  _globals['_GETVRFREQUEST']._serialized_end=1496
  _globals['_DELETEVRFREQUEST']._serialized_start=1499
  _globals['_DELETEVRFREQUEST']._serialized_end=1627
  _globals['_UPDATEVRFREQUEST']._serialized_start=1630
  _globals['_UPDATEVRFREQUEST']._serialized_end=1821
  _globals['_SVI']._serialized_start=1824
  _globals['_SVI']._serialized_end=2065
  _globals['_SVISPEC']._serialized_start=2068
  _globals['_SVISPEC']._serialized_end=2438
  _globals['_SVISTATUS']._serialized_start=2440
  _globals['_SVISTATUS']._serialized_end=2539
  _globals['_CREATESVIREQUEST']._serialized_start=2541
  _globals['_CREATESVIREQUEST']._serialized_end=2651
  _globals['_LISTSVISREQUEST']._serialized_start=2653
  _globals['_LISTSVISREQUEST']._serialized_end=2742
  _globals['_LISTSVISRESPONSE']._serialized_start=2744
  _globals['_LISTSVISRESPONSE']._serialized_end=2861
  _globals['_GETSVIREQUEST']._serialized_start=2863
  _globals['_GETSVIREQUEST']._serialized_end=2945
  _globals['_DELETESVIREQUEST']._serialized_start=2948
  _globals['_DELETESVIREQUEST']._serialized_end=3076
  _globals['_UPDATESVIREQUEST']._serialized_start=3079
  _globals['_UPDATESVIREQUEST']._serialized_end=3270
  _globals['_VRFSERVICE']._serialized_start=3473
  _globals['_VRFSERVICE']._serialized_end=4175
  _globals['_SVISERVICE']._serialized_start=4178
  _globals['_SVISERVICE']._serialized_end=4880
# @@protoc_insertion_point(module_scope)

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public final class BackendNullProto {
  private BackendNullProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebug_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugDeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugDeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022backend_null.proto\022\022opi_api.storage.v1" +
      "\032\020object_key.proto\032\nuuid.proto\"t\n\tNullDe" +
      "bug\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\022\n\nblock_s" +
      "ize\030\003 \001(\003\022\022\n\nnum_blocks\030\004 \001(\003\022%\n\004uuid\030\005 " +
      "\001(\0132\027.opi_api.common.v1.Uuid\"G\n\026NullDebu" +
      "gCreateRequest\022-\n\006device\030\001 \001(\0132\035.opi_api" +
      ".storage.v1.NullDebug\"\031\n\027NullDebugCreate" +
      "Response\"$\n\026NullDebugDeleteRequest\022\n\n\002id" +
      "\030\001 \001(\003\"\031\n\027NullDebugDeleteResponse\"G\n\026Nul" +
      "lDebugUpdateRequest\022-\n\006device\030\001 \001(\0132\035.op" +
      "i_api.storage.v1.NullDebug\"\031\n\027NullDebugU" +
      "pdateResponse\"\026\n\024NullDebugListRequest\"F\n" +
      "\025NullDebugListResponse\022-\n\006device\030\001 \003(\0132\035" +
      ".opi_api.storage.v1.NullDebug\"!\n\023NullDeb" +
      "ugGetRequest\022\n\n\002id\030\001 \001(\003\"E\n\024NullDebugGet" +
      "Response\022-\n\006device\030\001 \001(\0132\035.opi_api.stora" +
      "ge.v1.NullDebug\"#\n\025NullDebugStatsRequest" +
      "\022\n\n\002id\030\001 \001(\003\"3\n\026NullDebugStatsResponse\022\n" +
      "\n\002id\030\001 \001(\003\022\r\n\005stats\030\002 \001(\t2\224\005\n\020NullDebugS" +
      "ervice\022l\n\017NullDebugCreate\022*.opi_api.stor" +
      "age.v1.NullDebugCreateRequest\032+.opi_api." +
      "storage.v1.NullDebugCreateResponse\"\000\022l\n\017" +
      "NullDebugDelete\022*.opi_api.storage.v1.Nul" +
      "lDebugDeleteRequest\032+.opi_api.storage.v1" +
      ".NullDebugDeleteResponse\"\000\022l\n\017NullDebugU" +
      "pdate\022*.opi_api.storage.v1.NullDebugUpda" +
      "teRequest\032+.opi_api.storage.v1.NullDebug" +
      "UpdateResponse\"\000\022f\n\rNullDebugList\022(.opi_" +
      "api.storage.v1.NullDebugListRequest\032).op" +
      "i_api.storage.v1.NullDebugListResponse\"\000" +
      "\022c\n\014NullDebugGet\022\'.opi_api.storage.v1.Nu" +
      "llDebugGetRequest\032(.opi_api.storage.v1.N" +
      "ullDebugGetResponse\"\000\022i\n\016NullDebugStats\022" +
      ").opi_api.storage.v1.NullDebugStatsReque" +
      "st\032*.opi_api.storage.v1.NullDebugStatsRe" +
      "sponse\"\000B_\n\022opi_api.storage.v1B\020BackendN" +
      "ullProtoP\001Z5github.com/opiproject/opi-ap" +
      "i/storage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_NullDebug_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebug_descriptor,
        new java.lang.String[] { "Id", "Name", "BlockSize", "NumBlocks", "Uuid", });
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_NullDebugCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugCreateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NullDebugDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_NullDebugDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugDeleteResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_NullDebugUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugUpdateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NullDebugListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NullDebugListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_storage_v1_NullDebugGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NullDebugGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_storage_v1_NullDebugGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugGetResponse_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
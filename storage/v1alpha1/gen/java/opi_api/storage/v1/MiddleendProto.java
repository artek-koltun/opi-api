// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

public final class MiddleendProto {
  private MiddleendProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_EncryptedVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_EncryptedVolumeStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017middleend.proto\022\022opi_api.storage.v1\032\017o" +
      "picommon.proto\032\020object_key.proto\032\027google" +
      "/api/client.proto\032\031google/api/resource.p" +
      "roto\032\033google/protobuf/empty.proto\032\034googl" +
      "e/api/annotations.proto\032\037google/api/fiel" +
      "d_behavior.proto\032 google/protobuf/field_" +
      "mask.proto\"\276\001\n\017EncryptedVolume\0229\n\023encryp" +
      "ted_volume_id\030\001 \001(\0132\034.opi_api.common.v1." +
      "ObjectKey\022/\n\tvolume_id\030\002 \001(\0132\034.opi_api.c" +
      "ommon.v1.ObjectKey\022\013\n\003key\030\003 \001(\014\0222\n\006ciphe" +
      "r\030\004 \001(\0162\".opi_api.storage.v1.EncryptionT" +
      "ype\"\273\001\n\034CreateEncryptedVolumeRequest\022:\n\006" +
      "parent\030\001 \001(\tB*\340A\002\372A$\n\"opi_api.storage.v1" +
      "/EncryptedVolume\022B\n\020encrypted_volume\030\002 \001" +
      "(\0132#.opi_api.storage.v1.EncryptedVolumeB" +
      "\003\340A\002\022\033\n\023encrypted_volume_id\030\003 \001(\t\"X\n\034Del" +
      "eteEncryptedVolumeRequest\0228\n\004name\030\001 \001(\tB" +
      "*\340A\002\372A$\n\"opi_api.storage.v1/EncryptedVol" +
      "ume\"\216\001\n\034UpdateEncryptedVolumeRequest\022=\n\020" +
      "encrypted_volume\030\001 \001(\0132#.opi_api.storage" +
      ".v1.EncryptedVolume\022/\n\013update_mask\030\002 \001(\013" +
      "2\032.google.protobuf.FieldMask\"\200\001\n\033ListEnc" +
      "ryptedVolumesRequest\022:\n\006parent\030\001 \001(\tB*\340A" +
      "\002\372A$\n\"opi_api.storage.v1/EncryptedVolume" +
      "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"" +
      "w\n\034ListEncryptedVolumesResponse\022>\n\021encry" +
      "pted_volumes\030\001 \003(\0132#.opi_api.storage.v1." +
      "EncryptedVolume\022\027\n\017next_page_token\030\002 \001(\t" +
      "\"U\n\031GetEncryptedVolumeRequest\0228\n\004name\030\001 " +
      "\001(\tB*\340A\002\372A$\n\"opi_api.storage.v1/Encrypte" +
      "dVolume\"X\n\033EncryptedVolumeStatsRequest\0229" +
      "\n\023encrypted_volume_id\030\001 \001(\0132\034.opi_api.co" +
      "mmon.v1.ObjectKey\"h\n\034EncryptedVolumeStat" +
      "sResponse\0229\n\023encrypted_volume_id\030\001 \001(\0132\034" +
      ".opi_api.common.v1.ObjectKey\022\r\n\005stats\030\002 " +
      "\001(\t2\200\010\n\020MiddleendService\022\317\001\n\025CreateEncry" +
      "ptedVolume\0220.opi_api.storage.v1.CreateEn" +
      "cryptedVolumeRequest\032#.opi_api.storage.v" +
      "1.EncryptedVolume\"_\202\323\344\223\002+\"\027/v1/{parent=s" +
      "ubsystems}:\020encrypted_volume\332A+parent,en" +
      "crypted_volume,encrypted_volume_id\022\215\001\n\025D" +
      "eleteEncryptedVolume\0220.opi_api.storage.v" +
      "1.DeleteEncryptedVolumeRequest\032\026.google." +
      "protobuf.Empty\"*\202\323\344\223\002\035*\033/v1/{name=volume" +
      "s}/{volume}\332A\004name\022\317\001\n\025UpdateEncryptedVo" +
      "lume\0220.opi_api.storage.v1.UpdateEncrypte" +
      "dVolumeRequest\032#.opi_api.storage.v1.Encr" +
      "yptedVolume\"_\202\323\344\223\002:2&/v1/{encrypted_volu" +
      "me.name=subsystems}:\020encrypted_volume\332A\034" +
      "encrypted_volume,update_mask\022\240\001\n\024ListEnc" +
      "ryptedVolumes\022/.opi_api.storage.v1.ListE" +
      "ncryptedVolumesRequest\0320.opi_api.storage" +
      ".v1.ListEncryptedVolumesResponse\"%\202\323\344\223\002\026" +
      "\022\024/v1/{parent=volumes}\332A\006parent\022\227\001\n\022GetE" +
      "ncryptedVolume\022-.opi_api.storage.v1.GetE" +
      "ncryptedVolumeRequest\032#.opi_api.storage." +
      "v1.EncryptedVolume\"-\202\323\344\223\002 \022\036/v1/{name=su" +
      "bsystems}/{volume}\332A\004name\022{\n\024EncryptedVo" +
      "lumeStats\022/.opi_api.storage.v1.Encrypted" +
      "VolumeStatsRequest\0320.opi_api.storage.v1." +
      "EncryptedVolumeStatsResponse\"\000B]\n\022opi_ap" +
      "i.storage.v1B\016MiddleendProtoP\001Z5github.c" +
      "om/opiproject/opi-api/storage/v1alpha1/g" +
      "en/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_EncryptedVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_EncryptedVolume_descriptor,
        new java.lang.String[] { "EncryptedVolumeId", "VolumeId", "Key", "Cipher", });
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Parent", "EncryptedVolume", "EncryptedVolumeId", });
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "EncryptedVolume", "UpdateMask", });
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListEncryptedVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListEncryptedVolumesResponse_descriptor,
        new java.lang.String[] { "EncryptedVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetEncryptedVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_EncryptedVolumeStatsRequest_descriptor,
        new java.lang.String[] { "EncryptedVolumeId", });
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor,
        new java.lang.String[] { "EncryptedVolumeId", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

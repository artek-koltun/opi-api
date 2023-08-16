// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface AioVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.AioVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int64 block_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The blockSize.
   */
  long getBlockSize();

  /**
   * <code>int64 blocks_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The blocksCount.
   */
  long getBlocksCount();

  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the uuid field is set.
   */
  boolean hasUuid();
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The uuid.
   */
  opi_api.common.v1.Uuid getUuid();
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.common.v1.UuidOrBuilder getUuidOrBuilder();

  /**
   * <code>string filename = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   * <code>string filename = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString
      getFilenameBytes();
}
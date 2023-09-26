// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface DeleteAioVolumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.DeleteAioVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Object's unique identifier to delete
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Object's unique identifier to delete
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, and the resource is not found, the request will succeed
   * but no action will be taken on the server
   * </pre>
   *
   * <code>bool allow_missing = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}

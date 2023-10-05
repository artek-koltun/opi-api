// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

public interface CreateNvmeNamespaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNvmeNamespaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parent's subsystem unique identifier
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Parent's subsystem unique identifier
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The Nvme Namespace to be created
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespace nvme_namespace = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeNamespace field is set.
   */
  boolean hasNvmeNamespace();
  /**
   * <pre>
   * The Nvme Namespace to be created
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespace nvme_namespace = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeNamespace.
   */
  opi_api.storage.v1.NvmeNamespace getNvmeNamespace();
  /**
   * <pre>
   * The Nvme Namespace to be created
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespace nvme_namespace = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeNamespaceOrBuilder getNvmeNamespaceOrBuilder();

  /**
   * <pre>
   * An optional ID to assign to the Nvme Namespace.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_namespace_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeNamespaceId.
   */
  java.lang.String getNvmeNamespaceId();
  /**
   * <pre>
   * An optional ID to assign to the Nvme Namespace.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_namespace_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmeNamespaceId.
   */
  com.google.protobuf.ByteString
      getNvmeNamespaceIdBytes();
}

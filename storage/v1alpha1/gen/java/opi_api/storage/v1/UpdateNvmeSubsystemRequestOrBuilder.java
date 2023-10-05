// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

public interface UpdateNvmeSubsystemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNvmeSubsystemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeSubsystem field is set.
   */
  boolean hasNvmeSubsystem();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeSubsystem.
   */
  opi_api.storage.v1.NvmeSubsystem getNvmeSubsystem();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeSubsystemOrBuilder getNvmeSubsystemOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set to true, and the object is not found, a new object will be created.
   * In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}

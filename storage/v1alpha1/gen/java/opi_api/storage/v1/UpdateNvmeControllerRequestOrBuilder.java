// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

public interface UpdateNvmeControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNvmeControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeController field is set.
   */
  boolean hasNvmeController();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeController.
   */
  opi_api.storage.v1.NvmeController getNvmeController();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeControllerOrBuilder getNvmeControllerOrBuilder();

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

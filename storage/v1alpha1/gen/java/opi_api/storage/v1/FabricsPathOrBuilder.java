// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

public interface FabricsPathOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.FabricsPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Destination service id (e.g. Port)
   * </pre>
   *
   * <code>int64 trsvcid = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trsvcid.
   */
  long getTrsvcid();

  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnqn.
   */
  java.lang.String getSubnqn();
  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subnqn.
   */
  com.google.protobuf.ByteString
      getSubnqnBytes();

  /**
   * <pre>
   * Address family
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for adrfam.
   */
  int getAdrfamValue();
  /**
   * <pre>
   * Address family
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adrfam.
   */
  opi_api.storage.v1.NvmeAddressFamily getAdrfam();

  /**
   * <pre>
   * Source address (e.g. IP of local NIC)
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTraddr.
   */
  java.lang.String getSourceTraddr();
  /**
   * <pre>
   * Source address (e.g. IP of local NIC)
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for sourceTraddr.
   */
  com.google.protobuf.ByteString
      getSourceTraddrBytes();

  /**
   * <pre>
   * Source port (e.g. Port of local NIC)
   * </pre>
   *
   * <code>int64 source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTrsvcid.
   */
  long getSourceTrsvcid();

  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hostnqn.
   */
  java.lang.String getHostnqn();
  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for hostnqn.
   */
  com.google.protobuf.ByteString
      getHostnqnBytes();
}

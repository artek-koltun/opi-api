// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityPolicyStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityPolicyStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * no.of unique rules in h/w
   * </pre>
   *
   * <code>int32 rule_count = 1;</code>
   * @return The ruleCount.
   */
  int getRuleCount();

  /**
   * <pre>
   * no. of VPCs using the policy
   * </pre>
   *
   * <code>int32 vpc_count = 2;</code>
   * @return The vpcCount.
   */
  int getVpcCount();

  /**
   * <pre>
   * no. of subnets using the policy
   * </pre>
   *
   * <code>int32 subnet_count = 3;</code>
   * @return The subnetCount.
   */
  int getSubnetCount();

  /**
   * <pre>
   * no. of vnics using the policy
   * </pre>
   *
   * <code>int32 vnic_count = 4;</code>
   * @return The vnicCount.
   */
  int getVnicCount();

  /**
   * <pre>
   * security policy h/w pool handle, if any
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_pool_handle = 5;</code>
   * @return Whether the hwPoolHandle field is set.
   */
  boolean hasHwPoolHandle();
  /**
   * <pre>
   * security policy h/w pool handle, if any
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_pool_handle = 5;</code>
   * @return The hwPoolHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getHwPoolHandle();
  /**
   * <pre>
   * security policy h/w pool handle, if any
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_pool_handle = 5;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getHwPoolHandleOrBuilder();

  /**
   * <pre>
   * security-policy h/w handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 6;</code>
   * @return Whether the hwHandle field is set.
   */
  boolean hasHwHandle();
  /**
   * <pre>
   * security-policy h/w handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 6;</code>
   * @return The hwHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getHwHandle();
  /**
   * <pre>
   * security-policy h/w handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 6;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getHwHandleOrBuilder();

  /**
   * <pre>
   * security-policy base address
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: this is the actual 64bit memory address. --)
   * </pre>
   *
   * <code>uint64 policy_base_address = 7;</code>
   * @return The policyBaseAddress.
   */
  long getPolicyBaseAddress();
}
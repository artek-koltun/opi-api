// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Multipath mode value options
 * </pre>
 *
 * Protobuf enum {@code opi_api.storage.v1.NvmeMultipath}
 */
public enum NvmeMultipath
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Multipath mode is not specified
   * </pre>
   *
   * <code>NVME_MULTIPATH_UNSPECIFIED = 0;</code>
   */
  NVME_MULTIPATH_UNSPECIFIED(0),
  /**
   * <pre>
   * Multipathing is disabled
   * </pre>
   *
   * <code>NVME_MULTIPATH_DISABLE = 1;</code>
   */
  NVME_MULTIPATH_DISABLE(1),
  /**
   * <pre>
   * Failover mode where only one active connection is maintained and
   * path is changed only at switch-over
   * </pre>
   *
   * <code>NVME_MULTIPATH_FAILOVER = 2;</code>
   */
  NVME_MULTIPATH_FAILOVER(2),
  /**
   * <pre>
   * Multipath mode where active connections are maintained for every path
   * </pre>
   *
   * <code>NVME_MULTIPATH_MULTIPATH = 3;</code>
   */
  NVME_MULTIPATH_MULTIPATH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Multipath mode is not specified
   * </pre>
   *
   * <code>NVME_MULTIPATH_UNSPECIFIED = 0;</code>
   */
  public static final int NVME_MULTIPATH_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Multipathing is disabled
   * </pre>
   *
   * <code>NVME_MULTIPATH_DISABLE = 1;</code>
   */
  public static final int NVME_MULTIPATH_DISABLE_VALUE = 1;
  /**
   * <pre>
   * Failover mode where only one active connection is maintained and
   * path is changed only at switch-over
   * </pre>
   *
   * <code>NVME_MULTIPATH_FAILOVER = 2;</code>
   */
  public static final int NVME_MULTIPATH_FAILOVER_VALUE = 2;
  /**
   * <pre>
   * Multipath mode where active connections are maintained for every path
   * </pre>
   *
   * <code>NVME_MULTIPATH_MULTIPATH = 3;</code>
   */
  public static final int NVME_MULTIPATH_MULTIPATH_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NvmeMultipath valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NvmeMultipath forNumber(int value) {
    switch (value) {
      case 0: return NVME_MULTIPATH_UNSPECIFIED;
      case 1: return NVME_MULTIPATH_DISABLE;
      case 2: return NVME_MULTIPATH_FAILOVER;
      case 3: return NVME_MULTIPATH_MULTIPATH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NvmeMultipath>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NvmeMultipath> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NvmeMultipath>() {
          public NvmeMultipath findValueByNumber(int number) {
            return NvmeMultipath.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final NvmeMultipath[] VALUES = values();

  public static NvmeMultipath valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NvmeMultipath(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.storage.v1.NvmeMultipath)
}


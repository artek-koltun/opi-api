// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a response to get an Nvme Controller statistics.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.StatsNvmeControllerResponse}
 */
public final class StatsNvmeControllerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.StatsNvmeControllerResponse)
    StatsNvmeControllerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatsNvmeControllerResponse.newBuilder() to construct.
  private StatsNvmeControllerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatsNvmeControllerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatsNvmeControllerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatsNvmeControllerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            opi_api.storage.v1.VolumeStats.Builder subBuilder = null;
            if (stats_ != null) {
              subBuilder = stats_.toBuilder();
            }
            stats_ = input.readMessage(opi_api.storage.v1.VolumeStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stats_);
              stats_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_StatsNvmeControllerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_StatsNvmeControllerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.StatsNvmeControllerResponse.class, opi_api.storage.v1.StatsNvmeControllerResponse.Builder.class);
  }

  public static final int STATS_FIELD_NUMBER = 1;
  private opi_api.storage.v1.VolumeStats stats_;
  /**
   * <pre>
   * Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  @java.lang.Override
  public boolean hasStats() {
    return stats_ != null;
  }
  /**
   * <pre>
   * Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return The stats.
   */
  @java.lang.Override
  public opi_api.storage.v1.VolumeStats getStats() {
    return stats_ == null ? opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
  }
  /**
   * <pre>
   * Controller statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder() {
    return getStats();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stats_ != null) {
      output.writeMessage(1, getStats());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStats());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.StatsNvmeControllerResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.StatsNvmeControllerResponse other = (opi_api.storage.v1.StatsNvmeControllerResponse) obj;

    if (hasStats() != other.hasStats()) return false;
    if (hasStats()) {
      if (!getStats()
          .equals(other.getStats())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStats()) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStats().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.StatsNvmeControllerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.StatsNvmeControllerResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a response to get an Nvme Controller statistics.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.StatsNvmeControllerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.StatsNvmeControllerResponse)
      opi_api.storage.v1.StatsNvmeControllerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_StatsNvmeControllerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_StatsNvmeControllerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.StatsNvmeControllerResponse.class, opi_api.storage.v1.StatsNvmeControllerResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.StatsNvmeControllerResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statsBuilder_ == null) {
        stats_ = null;
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_StatsNvmeControllerResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.StatsNvmeControllerResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.StatsNvmeControllerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.StatsNvmeControllerResponse build() {
      opi_api.storage.v1.StatsNvmeControllerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.StatsNvmeControllerResponse buildPartial() {
      opi_api.storage.v1.StatsNvmeControllerResponse result = new opi_api.storage.v1.StatsNvmeControllerResponse(this);
      if (statsBuilder_ == null) {
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.StatsNvmeControllerResponse) {
        return mergeFrom((opi_api.storage.v1.StatsNvmeControllerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.StatsNvmeControllerResponse other) {
      if (other == opi_api.storage.v1.StatsNvmeControllerResponse.getDefaultInstance()) return this;
      if (other.hasStats()) {
        mergeStats(other.getStats());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.StatsNvmeControllerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.StatsNvmeControllerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.VolumeStats stats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder> statsBuilder_;
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     * @return Whether the stats field is set.
     */
    public boolean hasStats() {
      return statsBuilder_ != null || stats_ != null;
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     * @return The stats.
     */
    public opi_api.storage.v1.VolumeStats getStats() {
      if (statsBuilder_ == null) {
        return stats_ == null ? opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
      } else {
        return statsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public Builder setStats(opi_api.storage.v1.VolumeStats value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stats_ = value;
        onChanged();
      } else {
        statsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public Builder setStats(
        opi_api.storage.v1.VolumeStats.Builder builderForValue) {
      if (statsBuilder_ == null) {
        stats_ = builderForValue.build();
        onChanged();
      } else {
        statsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public Builder mergeStats(opi_api.storage.v1.VolumeStats value) {
      if (statsBuilder_ == null) {
        if (stats_ != null) {
          stats_ =
            opi_api.storage.v1.VolumeStats.newBuilder(stats_).mergeFrom(value).buildPartial();
        } else {
          stats_ = value;
        }
        onChanged();
      } else {
        statsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = null;
        onChanged();
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public opi_api.storage.v1.VolumeStats.Builder getStatsBuilder() {
      
      onChanged();
      return getStatsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    public opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilder();
      } else {
        return stats_ == null ?
            opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
      }
    }
    /**
     * <pre>
     * Controller statistics
     * </pre>
     *
     * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder> 
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder>(
                getStats(),
                getParentForChildren(),
                isClean());
        stats_ = null;
      }
      return statsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.StatsNvmeControllerResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsNvmeControllerResponse)
  private static final opi_api.storage.v1.StatsNvmeControllerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.StatsNvmeControllerResponse();
  }

  public static opi_api.storage.v1.StatsNvmeControllerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatsNvmeControllerResponse>
      PARSER = new com.google.protobuf.AbstractParser<StatsNvmeControllerResponse>() {
    @java.lang.Override
    public StatsNvmeControllerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatsNvmeControllerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatsNvmeControllerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatsNvmeControllerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.StatsNvmeControllerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


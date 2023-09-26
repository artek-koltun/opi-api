// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a response to list all Aio Volumes.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.ListAioVolumesResponse}
 */
public final class ListAioVolumesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListAioVolumesResponse)
    ListAioVolumesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAioVolumesResponse.newBuilder() to construct.
  private ListAioVolumesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAioVolumesResponse() {
    aioVolumes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAioVolumesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAioVolumesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              aioVolumes_ = new java.util.ArrayList<opi_api.storage.v1.AioVolume>();
              mutable_bitField0_ |= 0x00000001;
            }
            aioVolumes_.add(
                input.readMessage(opi_api.storage.v1.AioVolume.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        aioVolumes_ = java.util.Collections.unmodifiableList(aioVolumes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListAioVolumesResponse.class, opi_api.storage.v1.ListAioVolumesResponse.Builder.class);
  }

  public static final int AIO_VOLUMES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.AioVolume> aioVolumes_;
  /**
   * <pre>
   * List of Aio volumes
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.AioVolume> getAioVolumesList() {
    return aioVolumes_;
  }
  /**
   * <pre>
   * List of Aio volumes
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.AioVolumeOrBuilder> 
      getAioVolumesOrBuilderList() {
    return aioVolumes_;
  }
  /**
   * <pre>
   * List of Aio volumes
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  @java.lang.Override
  public int getAioVolumesCount() {
    return aioVolumes_.size();
  }
  /**
   * <pre>
   * List of Aio volumes
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioVolume getAioVolumes(int index) {
    return aioVolumes_.get(index);
  }
  /**
   * <pre>
   * List of Aio volumes
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioVolumeOrBuilder getAioVolumesOrBuilder(
      int index) {
    return aioVolumes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < aioVolumes_.size(); i++) {
      output.writeMessage(1, aioVolumes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aioVolumes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, aioVolumes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.storage.v1.ListAioVolumesResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListAioVolumesResponse other = (opi_api.storage.v1.ListAioVolumesResponse) obj;

    if (!getAioVolumesList()
        .equals(other.getAioVolumesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getAioVolumesCount() > 0) {
      hash = (37 * hash) + AIO_VOLUMES_FIELD_NUMBER;
      hash = (53 * hash) + getAioVolumesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListAioVolumesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListAioVolumesResponse prototype) {
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
   * Represents a response to list all Aio Volumes.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.ListAioVolumesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListAioVolumesResponse)
      opi_api.storage.v1.ListAioVolumesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListAioVolumesResponse.class, opi_api.storage.v1.ListAioVolumesResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListAioVolumesResponse.newBuilder()
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
        getAioVolumesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (aioVolumesBuilder_ == null) {
        aioVolumes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        aioVolumesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioVolumesResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListAioVolumesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioVolumesResponse build() {
      opi_api.storage.v1.ListAioVolumesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListAioVolumesResponse buildPartial() {
      opi_api.storage.v1.ListAioVolumesResponse result = new opi_api.storage.v1.ListAioVolumesResponse(this);
      int from_bitField0_ = bitField0_;
      if (aioVolumesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          aioVolumes_ = java.util.Collections.unmodifiableList(aioVolumes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aioVolumes_ = aioVolumes_;
      } else {
        result.aioVolumes_ = aioVolumesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.storage.v1.ListAioVolumesResponse) {
        return mergeFrom((opi_api.storage.v1.ListAioVolumesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListAioVolumesResponse other) {
      if (other == opi_api.storage.v1.ListAioVolumesResponse.getDefaultInstance()) return this;
      if (aioVolumesBuilder_ == null) {
        if (!other.aioVolumes_.isEmpty()) {
          if (aioVolumes_.isEmpty()) {
            aioVolumes_ = other.aioVolumes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAioVolumesIsMutable();
            aioVolumes_.addAll(other.aioVolumes_);
          }
          onChanged();
        }
      } else {
        if (!other.aioVolumes_.isEmpty()) {
          if (aioVolumesBuilder_.isEmpty()) {
            aioVolumesBuilder_.dispose();
            aioVolumesBuilder_ = null;
            aioVolumes_ = other.aioVolumes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aioVolumesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAioVolumesFieldBuilder() : null;
          } else {
            aioVolumesBuilder_.addAllMessages(other.aioVolumes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      opi_api.storage.v1.ListAioVolumesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListAioVolumesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.AioVolume> aioVolumes_ =
      java.util.Collections.emptyList();
    private void ensureAioVolumesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        aioVolumes_ = new java.util.ArrayList<opi_api.storage.v1.AioVolume>(aioVolumes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioVolume, opi_api.storage.v1.AioVolume.Builder, opi_api.storage.v1.AioVolumeOrBuilder> aioVolumesBuilder_;

    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioVolume> getAioVolumesList() {
      if (aioVolumesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aioVolumes_);
      } else {
        return aioVolumesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public int getAioVolumesCount() {
      if (aioVolumesBuilder_ == null) {
        return aioVolumes_.size();
      } else {
        return aioVolumesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public opi_api.storage.v1.AioVolume getAioVolumes(int index) {
      if (aioVolumesBuilder_ == null) {
        return aioVolumes_.get(index);
      } else {
        return aioVolumesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder setAioVolumes(
        int index, opi_api.storage.v1.AioVolume value) {
      if (aioVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAioVolumesIsMutable();
        aioVolumes_.set(index, value);
        onChanged();
      } else {
        aioVolumesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder setAioVolumes(
        int index, opi_api.storage.v1.AioVolume.Builder builderForValue) {
      if (aioVolumesBuilder_ == null) {
        ensureAioVolumesIsMutable();
        aioVolumes_.set(index, builderForValue.build());
        onChanged();
      } else {
        aioVolumesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder addAioVolumes(opi_api.storage.v1.AioVolume value) {
      if (aioVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAioVolumesIsMutable();
        aioVolumes_.add(value);
        onChanged();
      } else {
        aioVolumesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder addAioVolumes(
        int index, opi_api.storage.v1.AioVolume value) {
      if (aioVolumesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAioVolumesIsMutable();
        aioVolumes_.add(index, value);
        onChanged();
      } else {
        aioVolumesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder addAioVolumes(
        opi_api.storage.v1.AioVolume.Builder builderForValue) {
      if (aioVolumesBuilder_ == null) {
        ensureAioVolumesIsMutable();
        aioVolumes_.add(builderForValue.build());
        onChanged();
      } else {
        aioVolumesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder addAioVolumes(
        int index, opi_api.storage.v1.AioVolume.Builder builderForValue) {
      if (aioVolumesBuilder_ == null) {
        ensureAioVolumesIsMutable();
        aioVolumes_.add(index, builderForValue.build());
        onChanged();
      } else {
        aioVolumesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder addAllAioVolumes(
        java.lang.Iterable<? extends opi_api.storage.v1.AioVolume> values) {
      if (aioVolumesBuilder_ == null) {
        ensureAioVolumesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aioVolumes_);
        onChanged();
      } else {
        aioVolumesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder clearAioVolumes() {
      if (aioVolumesBuilder_ == null) {
        aioVolumes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aioVolumesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public Builder removeAioVolumes(int index) {
      if (aioVolumesBuilder_ == null) {
        ensureAioVolumesIsMutable();
        aioVolumes_.remove(index);
        onChanged();
      } else {
        aioVolumesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public opi_api.storage.v1.AioVolume.Builder getAioVolumesBuilder(
        int index) {
      return getAioVolumesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public opi_api.storage.v1.AioVolumeOrBuilder getAioVolumesOrBuilder(
        int index) {
      if (aioVolumesBuilder_ == null) {
        return aioVolumes_.get(index);  } else {
        return aioVolumesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.AioVolumeOrBuilder> 
         getAioVolumesOrBuilderList() {
      if (aioVolumesBuilder_ != null) {
        return aioVolumesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aioVolumes_);
      }
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public opi_api.storage.v1.AioVolume.Builder addAioVolumesBuilder() {
      return getAioVolumesFieldBuilder().addBuilder(
          opi_api.storage.v1.AioVolume.getDefaultInstance());
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public opi_api.storage.v1.AioVolume.Builder addAioVolumesBuilder(
        int index) {
      return getAioVolumesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.AioVolume.getDefaultInstance());
    }
    /**
     * <pre>
     * List of Aio volumes
     * </pre>
     *
     * <code>repeated .opi_api.storage.v1.AioVolume aio_volumes = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioVolume.Builder> 
         getAioVolumesBuilderList() {
      return getAioVolumesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioVolume, opi_api.storage.v1.AioVolume.Builder, opi_api.storage.v1.AioVolumeOrBuilder> 
        getAioVolumesFieldBuilder() {
      if (aioVolumesBuilder_ == null) {
        aioVolumesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.AioVolume, opi_api.storage.v1.AioVolume.Builder, opi_api.storage.v1.AioVolumeOrBuilder>(
                aioVolumes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        aioVolumes_ = null;
      }
      return aioVolumesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListAioVolumesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioVolumesResponse)
  private static final opi_api.storage.v1.ListAioVolumesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListAioVolumesResponse();
  }

  public static opi_api.storage.v1.ListAioVolumesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAioVolumesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAioVolumesResponse>() {
    @java.lang.Override
    public ListAioVolumesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAioVolumesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAioVolumesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAioVolumesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListAioVolumesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


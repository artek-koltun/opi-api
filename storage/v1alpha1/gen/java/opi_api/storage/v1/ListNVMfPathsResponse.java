// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListNVMfPathsResponse}
 */
public final class ListNVMfPathsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNVMfPathsResponse)
    ListNVMfPathsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNVMfPathsResponse.newBuilder() to construct.
  private ListNVMfPathsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNVMfPathsResponse() {
    nvMfPaths_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNVMfPathsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNVMfPathsResponse(
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
              nvMfPaths_ = new java.util.ArrayList<opi_api.storage.v1.NVMfPath>();
              mutable_bitField0_ |= 0x00000001;
            }
            nvMfPaths_.add(
                input.readMessage(opi_api.storage.v1.NVMfPath.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nvMfPaths_ = java.util.Collections.unmodifiableList(nvMfPaths_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfPathsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfPathsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNVMfPathsResponse.class, opi_api.storage.v1.ListNVMfPathsResponse.Builder.class);
  }

  public static final int NV_MF_PATHS_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NVMfPath> nvMfPaths_;
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NVMfPath> getNvMfPathsList() {
    return nvMfPaths_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NVMfPathOrBuilder> 
      getNvMfPathsOrBuilderList() {
    return nvMfPaths_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  @java.lang.Override
  public int getNvMfPathsCount() {
    return nvMfPaths_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfPath getNvMfPaths(int index) {
    return nvMfPaths_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathsOrBuilder(
      int index) {
    return nvMfPaths_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
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
    for (int i = 0; i < nvMfPaths_.size(); i++) {
      output.writeMessage(1, nvMfPaths_.get(i));
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
    for (int i = 0; i < nvMfPaths_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nvMfPaths_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.ListNVMfPathsResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNVMfPathsResponse other = (opi_api.storage.v1.ListNVMfPathsResponse) obj;

    if (!getNvMfPathsList()
        .equals(other.getNvMfPathsList())) return false;
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
    if (getNvMfPathsCount() > 0) {
      hash = (37 * hash) + NV_MF_PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getNvMfPathsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfPathsResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListNVMfPathsResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListNVMfPathsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNVMfPathsResponse)
      opi_api.storage.v1.ListNVMfPathsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfPathsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfPathsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNVMfPathsResponse.class, opi_api.storage.v1.ListNVMfPathsResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNVMfPathsResponse.newBuilder()
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
        getNvMfPathsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nvMfPathsBuilder_ == null) {
        nvMfPaths_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nvMfPathsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfPathsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfPathsResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNVMfPathsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfPathsResponse build() {
      opi_api.storage.v1.ListNVMfPathsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfPathsResponse buildPartial() {
      opi_api.storage.v1.ListNVMfPathsResponse result = new opi_api.storage.v1.ListNVMfPathsResponse(this);
      int from_bitField0_ = bitField0_;
      if (nvMfPathsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nvMfPaths_ = java.util.Collections.unmodifiableList(nvMfPaths_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nvMfPaths_ = nvMfPaths_;
      } else {
        result.nvMfPaths_ = nvMfPathsBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.ListNVMfPathsResponse) {
        return mergeFrom((opi_api.storage.v1.ListNVMfPathsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNVMfPathsResponse other) {
      if (other == opi_api.storage.v1.ListNVMfPathsResponse.getDefaultInstance()) return this;
      if (nvMfPathsBuilder_ == null) {
        if (!other.nvMfPaths_.isEmpty()) {
          if (nvMfPaths_.isEmpty()) {
            nvMfPaths_ = other.nvMfPaths_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNvMfPathsIsMutable();
            nvMfPaths_.addAll(other.nvMfPaths_);
          }
          onChanged();
        }
      } else {
        if (!other.nvMfPaths_.isEmpty()) {
          if (nvMfPathsBuilder_.isEmpty()) {
            nvMfPathsBuilder_.dispose();
            nvMfPathsBuilder_ = null;
            nvMfPaths_ = other.nvMfPaths_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nvMfPathsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNvMfPathsFieldBuilder() : null;
          } else {
            nvMfPathsBuilder_.addAllMessages(other.nvMfPaths_);
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
      opi_api.storage.v1.ListNVMfPathsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNVMfPathsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NVMfPath> nvMfPaths_ =
      java.util.Collections.emptyList();
    private void ensureNvMfPathsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nvMfPaths_ = new java.util.ArrayList<opi_api.storage.v1.NVMfPath>(nvMfPaths_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder> nvMfPathsBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMfPath> getNvMfPathsList() {
      if (nvMfPathsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nvMfPaths_);
      } else {
        return nvMfPathsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public int getNvMfPathsCount() {
      if (nvMfPathsBuilder_ == null) {
        return nvMfPaths_.size();
      } else {
        return nvMfPathsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public opi_api.storage.v1.NVMfPath getNvMfPaths(int index) {
      if (nvMfPathsBuilder_ == null) {
        return nvMfPaths_.get(index);
      } else {
        return nvMfPathsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder setNvMfPaths(
        int index, opi_api.storage.v1.NVMfPath value) {
      if (nvMfPathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfPathsIsMutable();
        nvMfPaths_.set(index, value);
        onChanged();
      } else {
        nvMfPathsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder setNvMfPaths(
        int index, opi_api.storage.v1.NVMfPath.Builder builderForValue) {
      if (nvMfPathsBuilder_ == null) {
        ensureNvMfPathsIsMutable();
        nvMfPaths_.set(index, builderForValue.build());
        onChanged();
      } else {
        nvMfPathsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder addNvMfPaths(opi_api.storage.v1.NVMfPath value) {
      if (nvMfPathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfPathsIsMutable();
        nvMfPaths_.add(value);
        onChanged();
      } else {
        nvMfPathsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder addNvMfPaths(
        int index, opi_api.storage.v1.NVMfPath value) {
      if (nvMfPathsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfPathsIsMutable();
        nvMfPaths_.add(index, value);
        onChanged();
      } else {
        nvMfPathsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder addNvMfPaths(
        opi_api.storage.v1.NVMfPath.Builder builderForValue) {
      if (nvMfPathsBuilder_ == null) {
        ensureNvMfPathsIsMutable();
        nvMfPaths_.add(builderForValue.build());
        onChanged();
      } else {
        nvMfPathsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder addNvMfPaths(
        int index, opi_api.storage.v1.NVMfPath.Builder builderForValue) {
      if (nvMfPathsBuilder_ == null) {
        ensureNvMfPathsIsMutable();
        nvMfPaths_.add(index, builderForValue.build());
        onChanged();
      } else {
        nvMfPathsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder addAllNvMfPaths(
        java.lang.Iterable<? extends opi_api.storage.v1.NVMfPath> values) {
      if (nvMfPathsBuilder_ == null) {
        ensureNvMfPathsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nvMfPaths_);
        onChanged();
      } else {
        nvMfPathsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder clearNvMfPaths() {
      if (nvMfPathsBuilder_ == null) {
        nvMfPaths_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nvMfPathsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public Builder removeNvMfPaths(int index) {
      if (nvMfPathsBuilder_ == null) {
        ensureNvMfPathsIsMutable();
        nvMfPaths_.remove(index);
        onChanged();
      } else {
        nvMfPathsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public opi_api.storage.v1.NVMfPath.Builder getNvMfPathsBuilder(
        int index) {
      return getNvMfPathsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathsOrBuilder(
        int index) {
      if (nvMfPathsBuilder_ == null) {
        return nvMfPaths_.get(index);  } else {
        return nvMfPathsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NVMfPathOrBuilder> 
         getNvMfPathsOrBuilderList() {
      if (nvMfPathsBuilder_ != null) {
        return nvMfPathsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nvMfPaths_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public opi_api.storage.v1.NVMfPath.Builder addNvMfPathsBuilder() {
      return getNvMfPathsFieldBuilder().addBuilder(
          opi_api.storage.v1.NVMfPath.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public opi_api.storage.v1.NVMfPath.Builder addNvMfPathsBuilder(
        int index) {
      return getNvMfPathsFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NVMfPath.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMfPath.Builder> 
         getNvMfPathsBuilderList() {
      return getNvMfPathsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder> 
        getNvMfPathsFieldBuilder() {
      if (nvMfPathsBuilder_ == null) {
        nvMfPathsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder>(
                nvMfPaths_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nvMfPaths_ = null;
      }
      return nvMfPathsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
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
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNVMfPathsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfPathsResponse)
  private static final opi_api.storage.v1.ListNVMfPathsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNVMfPathsResponse();
  }

  public static opi_api.storage.v1.ListNVMfPathsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNVMfPathsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNVMfPathsResponse>() {
    @java.lang.Override
    public ListNVMfPathsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNVMfPathsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNVMfPathsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNVMfPathsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNVMfPathsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


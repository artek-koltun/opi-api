// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List securitypolicy response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse}
 */
public final class ListSecurityPolicysResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)
    ListSecurityPolicysResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSecurityPolicysResponse.newBuilder() to construct.
  private ListSecurityPolicysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSecurityPolicysResponse() {
    securitypolicy_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSecurityPolicysResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSecurityPolicysResponse(
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
              securitypolicy_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.SecurityPolicy>();
              mutable_bitField0_ |= 0x00000001;
            }
            securitypolicy_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.SecurityPolicy.parser(), extensionRegistry));
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
        securitypolicy_ = java.util.Collections.unmodifiableList(securitypolicy_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListSecurityPolicysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListSecurityPolicysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.class, opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.Builder.class);
  }

  public static final int SECURITYPOLICY_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy> securitypolicy_;
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy> getSecuritypolicyList() {
    return securitypolicy_;
  }
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder> 
      getSecuritypolicyOrBuilderList() {
    return securitypolicy_;
  }
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  @java.lang.Override
  public int getSecuritypolicyCount() {
    return securitypolicy_.size();
  }
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityPolicy getSecuritypolicy(int index) {
    return securitypolicy_.get(index);
  }
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder getSecuritypolicyOrBuilder(
      int index) {
    return securitypolicy_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
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
   * next page token
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
    for (int i = 0; i < securitypolicy_.size(); i++) {
      output.writeMessage(1, securitypolicy_.get(i));
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
    for (int i = 0; i < securitypolicy_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, securitypolicy_.get(i));
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse other = (opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse) obj;

    if (!getSecuritypolicyList()
        .equals(other.getSecuritypolicyList())) return false;
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
    if (getSecuritypolicyCount() > 0) {
      hash = (37 * hash) + SECURITYPOLICY_FIELD_NUMBER;
      hash = (53 * hash) + getSecuritypolicyList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse prototype) {
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
   * List securitypolicy response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListSecurityPolicysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListSecurityPolicysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.class, opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.newBuilder()
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
        getSecuritypolicyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (securitypolicyBuilder_ == null) {
        securitypolicy_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        securitypolicyBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListSecurityPolicysResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse build() {
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse result = new opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse(this);
      int from_bitField0_ = bitField0_;
      if (securitypolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          securitypolicy_ = java.util.Collections.unmodifiableList(securitypolicy_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.securitypolicy_ = securitypolicy_;
      } else {
        result.securitypolicy_ = securitypolicyBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.getDefaultInstance()) return this;
      if (securitypolicyBuilder_ == null) {
        if (!other.securitypolicy_.isEmpty()) {
          if (securitypolicy_.isEmpty()) {
            securitypolicy_ = other.securitypolicy_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSecuritypolicyIsMutable();
            securitypolicy_.addAll(other.securitypolicy_);
          }
          onChanged();
        }
      } else {
        if (!other.securitypolicy_.isEmpty()) {
          if (securitypolicyBuilder_.isEmpty()) {
            securitypolicyBuilder_.dispose();
            securitypolicyBuilder_ = null;
            securitypolicy_ = other.securitypolicy_;
            bitField0_ = (bitField0_ & ~0x00000001);
            securitypolicyBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSecuritypolicyFieldBuilder() : null;
          } else {
            securitypolicyBuilder_.addAllMessages(other.securitypolicy_);
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
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy> securitypolicy_ =
      java.util.Collections.emptyList();
    private void ensureSecuritypolicyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        securitypolicy_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.SecurityPolicy>(securitypolicy_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityPolicy, opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder, opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder> securitypolicyBuilder_;

    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy> getSecuritypolicyList() {
      if (securitypolicyBuilder_ == null) {
        return java.util.Collections.unmodifiableList(securitypolicy_);
      } else {
        return securitypolicyBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public int getSecuritypolicyCount() {
      if (securitypolicyBuilder_ == null) {
        return securitypolicy_.size();
      } else {
        return securitypolicyBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy getSecuritypolicy(int index) {
      if (securitypolicyBuilder_ == null) {
        return securitypolicy_.get(index);
      } else {
        return securitypolicyBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder setSecuritypolicy(
        int index, opi_api.network.cloud.v1alpha1.SecurityPolicy value) {
      if (securitypolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritypolicyIsMutable();
        securitypolicy_.set(index, value);
        onChanged();
      } else {
        securitypolicyBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder setSecuritypolicy(
        int index, opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder builderForValue) {
      if (securitypolicyBuilder_ == null) {
        ensureSecuritypolicyIsMutable();
        securitypolicy_.set(index, builderForValue.build());
        onChanged();
      } else {
        securitypolicyBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder addSecuritypolicy(opi_api.network.cloud.v1alpha1.SecurityPolicy value) {
      if (securitypolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritypolicyIsMutable();
        securitypolicy_.add(value);
        onChanged();
      } else {
        securitypolicyBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder addSecuritypolicy(
        int index, opi_api.network.cloud.v1alpha1.SecurityPolicy value) {
      if (securitypolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritypolicyIsMutable();
        securitypolicy_.add(index, value);
        onChanged();
      } else {
        securitypolicyBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder addSecuritypolicy(
        opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder builderForValue) {
      if (securitypolicyBuilder_ == null) {
        ensureSecuritypolicyIsMutable();
        securitypolicy_.add(builderForValue.build());
        onChanged();
      } else {
        securitypolicyBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder addSecuritypolicy(
        int index, opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder builderForValue) {
      if (securitypolicyBuilder_ == null) {
        ensureSecuritypolicyIsMutable();
        securitypolicy_.add(index, builderForValue.build());
        onChanged();
      } else {
        securitypolicyBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder addAllSecuritypolicy(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.SecurityPolicy> values) {
      if (securitypolicyBuilder_ == null) {
        ensureSecuritypolicyIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, securitypolicy_);
        onChanged();
      } else {
        securitypolicyBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder clearSecuritypolicy() {
      if (securitypolicyBuilder_ == null) {
        securitypolicy_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        securitypolicyBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public Builder removeSecuritypolicy(int index) {
      if (securitypolicyBuilder_ == null) {
        ensureSecuritypolicyIsMutable();
        securitypolicy_.remove(index);
        onChanged();
      } else {
        securitypolicyBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder getSecuritypolicyBuilder(
        int index) {
      return getSecuritypolicyFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder getSecuritypolicyOrBuilder(
        int index) {
      if (securitypolicyBuilder_ == null) {
        return securitypolicy_.get(index);  } else {
        return securitypolicyBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder> 
         getSecuritypolicyOrBuilderList() {
      if (securitypolicyBuilder_ != null) {
        return securitypolicyBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(securitypolicy_);
      }
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder addSecuritypolicyBuilder() {
      return getSecuritypolicyFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.SecurityPolicy.getDefaultInstance());
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder addSecuritypolicyBuilder(
        int index) {
      return getSecuritypolicyFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.SecurityPolicy.getDefaultInstance());
    }
    /**
     * <pre>
     * list of securitypolicys
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder> 
         getSecuritypolicyBuilderList() {
      return getSecuritypolicyFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityPolicy, opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder, opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder> 
        getSecuritypolicyFieldBuilder() {
      if (securitypolicyBuilder_ == null) {
        securitypolicyBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.SecurityPolicy, opi_api.network.cloud.v1alpha1.SecurityPolicy.Builder, opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder>(
                securitypolicy_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        securitypolicy_ = null;
      }
      return securitypolicyBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
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
     * next page token
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
     * next page token
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
     * next page token
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
     * next page token
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)
  private static final opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSecurityPolicysResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSecurityPolicysResponse>() {
    @java.lang.Override
    public ListSecurityPolicysResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSecurityPolicysResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSecurityPolicysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSecurityPolicysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

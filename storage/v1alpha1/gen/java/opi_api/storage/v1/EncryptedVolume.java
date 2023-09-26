// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_encryption.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents volume encrypting IOs
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.EncryptedVolume}
 */
public final class EncryptedVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.EncryptedVolume)
    EncryptedVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncryptedVolume.newBuilder() to construct.
  private EncryptedVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncryptedVolume() {
    name_ = "";
    volumeNameRef_ = "";
    key_ = com.google.protobuf.ByteString.EMPTY;
    cipher_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncryptedVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncryptedVolume(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            volumeNameRef_ = s;
            break;
          }
          case 26: {

            key_ = input.readBytes();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            cipher_ = rawValue;
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
    return opi_api.storage.v1.MiddleendEncryptionProto.internal_static_opi_api_storage_v1_EncryptedVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendEncryptionProto.internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.EncryptedVolume.class, opi_api.storage.v1.EncryptedVolume.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME_NAME_REF_FIELD_NUMBER = 2;
  private volatile java.lang.Object volumeNameRef_;
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The volumeNameRef.
   */
  @java.lang.Override
  public java.lang.String getVolumeNameRef() {
    java.lang.Object ref = volumeNameRef_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volumeNameRef_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for volumeNameRef.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVolumeNameRefBytes() {
    java.lang.Object ref = volumeNameRef_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volumeNameRef_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * Key to be used for encryption
   * </pre>
   *
   * <code>bytes key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int CIPHER_FIELD_NUMBER = 4;
  private int cipher_;
  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for cipher.
   */
  @java.lang.Override public int getCipherValue() {
    return cipher_;
  }
  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cipher.
   */
  @java.lang.Override public opi_api.storage.v1.EncryptionType getCipher() {
    @SuppressWarnings("deprecation")
    opi_api.storage.v1.EncryptionType result = opi_api.storage.v1.EncryptionType.valueOf(cipher_);
    return result == null ? opi_api.storage.v1.EncryptionType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeNameRef_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, volumeNameRef_);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(3, key_);
    }
    if (cipher_ != opi_api.storage.v1.EncryptionType.ENCRYPTION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, cipher_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeNameRef_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, volumeNameRef_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, key_);
    }
    if (cipher_ != opi_api.storage.v1.EncryptionType.ENCRYPTION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, cipher_);
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
    if (!(obj instanceof opi_api.storage.v1.EncryptedVolume)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.EncryptedVolume other = (opi_api.storage.v1.EncryptedVolume) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getVolumeNameRef()
        .equals(other.getVolumeNameRef())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (cipher_ != other.cipher_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VOLUME_NAME_REF_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeNameRef().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + CIPHER_FIELD_NUMBER;
    hash = (53 * hash) + cipher_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolume parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.EncryptedVolume prototype) {
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
   * Represents volume encrypting IOs
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.EncryptedVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.EncryptedVolume)
      opi_api.storage.v1.EncryptedVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendEncryptionProto.internal_static_opi_api_storage_v1_EncryptedVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendEncryptionProto.internal_static_opi_api_storage_v1_EncryptedVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.EncryptedVolume.class, opi_api.storage.v1.EncryptedVolume.Builder.class);
    }

    // Construct using opi_api.storage.v1.EncryptedVolume.newBuilder()
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
      name_ = "";

      volumeNameRef_ = "";

      key_ = com.google.protobuf.ByteString.EMPTY;

      cipher_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendEncryptionProto.internal_static_opi_api_storage_v1_EncryptedVolume_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolume getDefaultInstanceForType() {
      return opi_api.storage.v1.EncryptedVolume.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolume build() {
      opi_api.storage.v1.EncryptedVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolume buildPartial() {
      opi_api.storage.v1.EncryptedVolume result = new opi_api.storage.v1.EncryptedVolume(this);
      result.name_ = name_;
      result.volumeNameRef_ = volumeNameRef_;
      result.key_ = key_;
      result.cipher_ = cipher_;
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
      if (other instanceof opi_api.storage.v1.EncryptedVolume) {
        return mergeFrom((opi_api.storage.v1.EncryptedVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.EncryptedVolume other) {
      if (other == opi_api.storage.v1.EncryptedVolume.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getVolumeNameRef().isEmpty()) {
        volumeNameRef_ = other.volumeNameRef_;
        onChanged();
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.cipher_ != 0) {
        setCipherValue(other.getCipherValue());
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
      opi_api.storage.v1.EncryptedVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.EncryptedVolume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object volumeNameRef_ = "";
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The volumeNameRef.
     */
    public java.lang.String getVolumeNameRef() {
      java.lang.Object ref = volumeNameRef_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volumeNameRef_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for volumeNameRef.
     */
    public com.google.protobuf.ByteString
        getVolumeNameRefBytes() {
      java.lang.Object ref = volumeNameRef_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volumeNameRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The volumeNameRef to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeNameRef(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volumeNameRef_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVolumeNameRef() {
      
      volumeNameRef_ = getDefaultInstance().getVolumeNameRef();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for volumeNameRef to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeNameRefBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volumeNameRef_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int cipher_ = 0;
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for cipher.
     */
    @java.lang.Override public int getCipherValue() {
      return cipher_;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for cipher to set.
     * @return This builder for chaining.
     */
    public Builder setCipherValue(int value) {
      
      cipher_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The cipher.
     */
    @java.lang.Override
    public opi_api.storage.v1.EncryptionType getCipher() {
      @SuppressWarnings("deprecation")
      opi_api.storage.v1.EncryptionType result = opi_api.storage.v1.EncryptionType.valueOf(cipher_);
      return result == null ? opi_api.storage.v1.EncryptionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The cipher to set.
     * @return This builder for chaining.
     */
    public Builder setCipher(opi_api.storage.v1.EncryptionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cipher_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCipher() {
      
      cipher_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.EncryptedVolume)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.EncryptedVolume)
  private static final opi_api.storage.v1.EncryptedVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.EncryptedVolume();
  }

  public static opi_api.storage.v1.EncryptedVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptedVolume>
      PARSER = new com.google.protobuf.AbstractParser<EncryptedVolume>() {
    @java.lang.Override
    public EncryptedVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncryptedVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncryptedVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptedVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.EncryptedVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_encryption.proto

package opi_api.storage.v1;

public interface EncryptedVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.EncryptedVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The volumeNameRef.
   */
  java.lang.String getVolumeNameRef();
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>string volume_name_ref = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for volumeNameRef.
   */
  com.google.protobuf.ByteString
      getVolumeNameRefBytes();

  /**
   * <pre>
   * Key to be used for encryption
   * </pre>
   *
   * <code>bytes key = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for cipher.
   */
  int getCipherValue();
  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.EncryptionType cipher = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cipher.
   */
  opi_api.storage.v1.EncryptionType getCipher();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public interface StatsQosVolumeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.StatsQosVolumeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Volume statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <pre>
   * Volume statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <pre>
   * Volume statistics
   * </pre>
   *
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}

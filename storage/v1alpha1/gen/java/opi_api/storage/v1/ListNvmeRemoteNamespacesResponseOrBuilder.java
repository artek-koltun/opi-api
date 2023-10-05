// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

public interface ListNvmeRemoteNamespacesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListNvmeRemoteNamespacesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Remote Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeRemoteNamespace nvme_remote_namespaces = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NvmeRemoteNamespace> 
      getNvmeRemoteNamespacesList();
  /**
   * <pre>
   * List of Remote Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeRemoteNamespace nvme_remote_namespaces = 1;</code>
   */
  opi_api.storage.v1.NvmeRemoteNamespace getNvmeRemoteNamespaces(int index);
  /**
   * <pre>
   * List of Remote Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeRemoteNamespace nvme_remote_namespaces = 1;</code>
   */
  int getNvmeRemoteNamespacesCount();
  /**
   * <pre>
   * List of Remote Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeRemoteNamespace nvme_remote_namespaces = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NvmeRemoteNamespaceOrBuilder> 
      getNvmeRemoteNamespacesOrBuilderList();
  /**
   * <pre>
   * List of Remote Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeRemoteNamespace nvme_remote_namespaces = 1;</code>
   */
  opi_api.storage.v1.NvmeRemoteNamespaceOrBuilder getNvmeRemoteNamespacesOrBuilder(
      int index);

  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}

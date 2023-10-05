// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

public interface ListNvmeNamespacesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListNvmeNamespacesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Nvme Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NvmeNamespace> 
      getNvmeNamespacesList();
  /**
   * <pre>
   * List of Nvme Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  opi_api.storage.v1.NvmeNamespace getNvmeNamespaces(int index);
  /**
   * <pre>
   * List of Nvme Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  int getNvmeNamespacesCount();
  /**
   * <pre>
   * List of Nvme Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NvmeNamespaceOrBuilder> 
      getNvmeNamespacesOrBuilderList();
  /**
   * <pre>
   * List of Nvme Namespaces
   * </pre>
   *
   * <code>repeated .opi_api.storage.v1.NvmeNamespace nvme_namespaces = 1;</code>
   */
  opi_api.storage.v1.NvmeNamespaceOrBuilder getNvmeNamespacesOrBuilder(
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

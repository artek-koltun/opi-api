// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: openoffload.proto

#include "openoffload.pb.h"
#include "openoffload.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace security {
namespace firewall {
namespace v1 {

static const char* SessionTable_method_names[] = {
  "/opi_api.security.firewall.v1.SessionTable/AddSession",
  "/opi_api.security.firewall.v1.SessionTable/GetSession",
  "/opi_api.security.firewall.v1.SessionTable/DeleteSession",
  "/opi_api.security.firewall.v1.SessionTable/GetAllSession",
};

std::unique_ptr< SessionTable::Stub> SessionTable::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< SessionTable::Stub> stub(new SessionTable::Stub(channel, options));
  return stub;
}

SessionTable::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_AddSession_(SessionTable_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::CLIENT_STREAMING, channel)
  , rpcmethod_GetSession_(SessionTable_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteSession_(SessionTable_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetAllSession_(SessionTable_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::ClientWriter< ::opi_api::security::firewall::v1::SessionRequest>* SessionTable::Stub::AddSessionRaw(::grpc::ClientContext* context, ::opi_api::security::firewall::v1::AddSessionResponse* response) {
  return ::grpc::internal::ClientWriterFactory< ::opi_api::security::firewall::v1::SessionRequest>::Create(channel_.get(), rpcmethod_AddSession_, context, response);
}

void SessionTable::Stub::async::AddSession(::grpc::ClientContext* context, ::opi_api::security::firewall::v1::AddSessionResponse* response, ::grpc::ClientWriteReactor< ::opi_api::security::firewall::v1::SessionRequest>* reactor) {
  ::grpc::internal::ClientCallbackWriterFactory< ::opi_api::security::firewall::v1::SessionRequest>::Create(stub_->channel_.get(), stub_->rpcmethod_AddSession_, context, response, reactor);
}

::grpc::ClientAsyncWriter< ::opi_api::security::firewall::v1::SessionRequest>* SessionTable::Stub::AsyncAddSessionRaw(::grpc::ClientContext* context, ::opi_api::security::firewall::v1::AddSessionResponse* response, ::grpc::CompletionQueue* cq, void* tag) {
  return ::grpc::internal::ClientAsyncWriterFactory< ::opi_api::security::firewall::v1::SessionRequest>::Create(channel_.get(), cq, rpcmethod_AddSession_, context, response, true, tag);
}

::grpc::ClientAsyncWriter< ::opi_api::security::firewall::v1::SessionRequest>* SessionTable::Stub::PrepareAsyncAddSessionRaw(::grpc::ClientContext* context, ::opi_api::security::firewall::v1::AddSessionResponse* response, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncWriterFactory< ::opi_api::security::firewall::v1::SessionRequest>::Create(channel_.get(), cq, rpcmethod_AddSession_, context, response, false, nullptr);
}

::grpc::Status SessionTable::Stub::GetSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::opi_api::security::firewall::v1::SessionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetSession_, context, request, response);
}

void SessionTable::Stub::async::GetSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetSession_, context, request, response, std::move(f));
}

void SessionTable::Stub::async::GetSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetSession_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponse>* SessionTable::Stub::PrepareAsyncGetSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::firewall::v1::SessionResponse, ::opi_api::security::firewall::v1::SessionId, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetSession_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponse>* SessionTable::Stub::AsyncGetSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetSessionRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status SessionTable::Stub::DeleteSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::opi_api::security::firewall::v1::SessionResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_DeleteSession_, context, request, response);
}

void SessionTable::Stub::async::DeleteSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteSession_, context, request, response, std::move(f));
}

void SessionTable::Stub::async::DeleteSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteSession_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponse>* SessionTable::Stub::PrepareAsyncDeleteSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::firewall::v1::SessionResponse, ::opi_api::security::firewall::v1::SessionId, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_DeleteSession_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponse>* SessionTable::Stub::AsyncDeleteSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionId& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncDeleteSessionRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status SessionTable::Stub::GetAllSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs& request, ::opi_api::security::firewall::v1::SessionResponses* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::security::firewall::v1::SessionRequestArgs, ::opi_api::security::firewall::v1::SessionResponses, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetAllSession_, context, request, response);
}

void SessionTable::Stub::async::GetAllSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs* request, ::opi_api::security::firewall::v1::SessionResponses* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::security::firewall::v1::SessionRequestArgs, ::opi_api::security::firewall::v1::SessionResponses, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetAllSession_, context, request, response, std::move(f));
}

void SessionTable::Stub::async::GetAllSession(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs* request, ::opi_api::security::firewall::v1::SessionResponses* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetAllSession_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponses>* SessionTable::Stub::PrepareAsyncGetAllSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::security::firewall::v1::SessionResponses, ::opi_api::security::firewall::v1::SessionRequestArgs, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetAllSession_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::security::firewall::v1::SessionResponses>* SessionTable::Stub::AsyncGetAllSessionRaw(::grpc::ClientContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetAllSessionRaw(context, request, cq);
  result->StartCall();
  return result;
}

SessionTable::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SessionTable_method_names[0],
      ::grpc::internal::RpcMethod::CLIENT_STREAMING,
      new ::grpc::internal::ClientStreamingHandler< SessionTable::Service, ::opi_api::security::firewall::v1::SessionRequest, ::opi_api::security::firewall::v1::AddSessionResponse>(
          [](SessionTable::Service* service,
             ::grpc::ServerContext* ctx,
             ::grpc::ServerReader<::opi_api::security::firewall::v1::SessionRequest>* reader,
             ::opi_api::security::firewall::v1::AddSessionResponse* resp) {
               return service->AddSession(ctx, reader, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SessionTable_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SessionTable::Service, ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](SessionTable::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::firewall::v1::SessionId* req,
             ::opi_api::security::firewall::v1::SessionResponse* resp) {
               return service->GetSession(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SessionTable_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SessionTable::Service, ::opi_api::security::firewall::v1::SessionId, ::opi_api::security::firewall::v1::SessionResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](SessionTable::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::firewall::v1::SessionId* req,
             ::opi_api::security::firewall::v1::SessionResponse* resp) {
               return service->DeleteSession(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SessionTable_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SessionTable::Service, ::opi_api::security::firewall::v1::SessionRequestArgs, ::opi_api::security::firewall::v1::SessionResponses, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](SessionTable::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::security::firewall::v1::SessionRequestArgs* req,
             ::opi_api::security::firewall::v1::SessionResponses* resp) {
               return service->GetAllSession(ctx, req, resp);
             }, this)));
}

SessionTable::Service::~Service() {
}

::grpc::Status SessionTable::Service::AddSession(::grpc::ServerContext* context, ::grpc::ServerReader< ::opi_api::security::firewall::v1::SessionRequest>* reader, ::opi_api::security::firewall::v1::AddSessionResponse* response) {
  (void) context;
  (void) reader;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SessionTable::Service::GetSession(::grpc::ServerContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SessionTable::Service::DeleteSession(::grpc::ServerContext* context, const ::opi_api::security::firewall::v1::SessionId* request, ::opi_api::security::firewall::v1::SessionResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status SessionTable::Service::GetAllSession(::grpc::ServerContext* context, const ::opi_api::security::firewall::v1::SessionRequestArgs* request, ::opi_api::security::firewall::v1::SessionResponses* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace security
}  // namespace firewall
}  // namespace v1

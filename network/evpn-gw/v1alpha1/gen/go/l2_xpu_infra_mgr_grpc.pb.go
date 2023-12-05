// SPDX-License-Identifier: Apache-2.0
// Copyright (C) 2023 Nordix Foundation.

// (-- api-linter: core::0132::request-parent-required=disabled
//     aip.dev/not-precedent: All the resources are top level. --)
// (-- api-linter: core::0133::request-parent-required=disabled
//     aip.dev/not-precedent: All the resources are top level. --)
// (-- api-linter: core::0133::http-uri-parent=disabled
//     aip.dev/not-precedent: All resources are top-level. --)
// (-- api-linter: core::0216::synonyms=disabled
//     aip.dev/not-precedent: Word "Status" will be used instead of "State". --)

// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: l2_xpu_infra_mgr.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	LogicalBridgeService_CreateLogicalBridge_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService/CreateLogicalBridge"
	LogicalBridgeService_ListLogicalBridges_FullMethodName  = "/opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService/ListLogicalBridges"
	LogicalBridgeService_GetLogicalBridge_FullMethodName    = "/opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService/GetLogicalBridge"
	LogicalBridgeService_DeleteLogicalBridge_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService/DeleteLogicalBridge"
	LogicalBridgeService_UpdateLogicalBridge_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService/UpdateLogicalBridge"
)

// LogicalBridgeServiceClient is the client API for LogicalBridgeService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type LogicalBridgeServiceClient interface {
	// Create a Logical Bridge
	CreateLogicalBridge(ctx context.Context, in *CreateLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error)
	// List Logical Bridges
	ListLogicalBridges(ctx context.Context, in *ListLogicalBridgesRequest, opts ...grpc.CallOption) (*ListLogicalBridgesResponse, error)
	// Retrieve a Logical Bridge
	GetLogicalBridge(ctx context.Context, in *GetLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error)
	// Delete a Logical Bridge
	DeleteLogicalBridge(ctx context.Context, in *DeleteLogicalBridgeRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update a Logical Bridge
	UpdateLogicalBridge(ctx context.Context, in *UpdateLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error)
}

type logicalBridgeServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewLogicalBridgeServiceClient(cc grpc.ClientConnInterface) LogicalBridgeServiceClient {
	return &logicalBridgeServiceClient{cc}
}

func (c *logicalBridgeServiceClient) CreateLogicalBridge(ctx context.Context, in *CreateLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error) {
	out := new(LogicalBridge)
	err := c.cc.Invoke(ctx, LogicalBridgeService_CreateLogicalBridge_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *logicalBridgeServiceClient) ListLogicalBridges(ctx context.Context, in *ListLogicalBridgesRequest, opts ...grpc.CallOption) (*ListLogicalBridgesResponse, error) {
	out := new(ListLogicalBridgesResponse)
	err := c.cc.Invoke(ctx, LogicalBridgeService_ListLogicalBridges_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *logicalBridgeServiceClient) GetLogicalBridge(ctx context.Context, in *GetLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error) {
	out := new(LogicalBridge)
	err := c.cc.Invoke(ctx, LogicalBridgeService_GetLogicalBridge_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *logicalBridgeServiceClient) DeleteLogicalBridge(ctx context.Context, in *DeleteLogicalBridgeRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, LogicalBridgeService_DeleteLogicalBridge_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *logicalBridgeServiceClient) UpdateLogicalBridge(ctx context.Context, in *UpdateLogicalBridgeRequest, opts ...grpc.CallOption) (*LogicalBridge, error) {
	out := new(LogicalBridge)
	err := c.cc.Invoke(ctx, LogicalBridgeService_UpdateLogicalBridge_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// LogicalBridgeServiceServer is the server API for LogicalBridgeService service.
// All implementations must embed UnimplementedLogicalBridgeServiceServer
// for forward compatibility
type LogicalBridgeServiceServer interface {
	// Create a Logical Bridge
	CreateLogicalBridge(context.Context, *CreateLogicalBridgeRequest) (*LogicalBridge, error)
	// List Logical Bridges
	ListLogicalBridges(context.Context, *ListLogicalBridgesRequest) (*ListLogicalBridgesResponse, error)
	// Retrieve a Logical Bridge
	GetLogicalBridge(context.Context, *GetLogicalBridgeRequest) (*LogicalBridge, error)
	// Delete a Logical Bridge
	DeleteLogicalBridge(context.Context, *DeleteLogicalBridgeRequest) (*emptypb.Empty, error)
	// Update a Logical Bridge
	UpdateLogicalBridge(context.Context, *UpdateLogicalBridgeRequest) (*LogicalBridge, error)
	mustEmbedUnimplementedLogicalBridgeServiceServer()
}

// UnimplementedLogicalBridgeServiceServer must be embedded to have forward compatible implementations.
type UnimplementedLogicalBridgeServiceServer struct {
}

func (UnimplementedLogicalBridgeServiceServer) CreateLogicalBridge(context.Context, *CreateLogicalBridgeRequest) (*LogicalBridge, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateLogicalBridge not implemented")
}
func (UnimplementedLogicalBridgeServiceServer) ListLogicalBridges(context.Context, *ListLogicalBridgesRequest) (*ListLogicalBridgesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListLogicalBridges not implemented")
}
func (UnimplementedLogicalBridgeServiceServer) GetLogicalBridge(context.Context, *GetLogicalBridgeRequest) (*LogicalBridge, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetLogicalBridge not implemented")
}
func (UnimplementedLogicalBridgeServiceServer) DeleteLogicalBridge(context.Context, *DeleteLogicalBridgeRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteLogicalBridge not implemented")
}
func (UnimplementedLogicalBridgeServiceServer) UpdateLogicalBridge(context.Context, *UpdateLogicalBridgeRequest) (*LogicalBridge, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateLogicalBridge not implemented")
}
func (UnimplementedLogicalBridgeServiceServer) mustEmbedUnimplementedLogicalBridgeServiceServer() {}

// UnsafeLogicalBridgeServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to LogicalBridgeServiceServer will
// result in compilation errors.
type UnsafeLogicalBridgeServiceServer interface {
	mustEmbedUnimplementedLogicalBridgeServiceServer()
}

func RegisterLogicalBridgeServiceServer(s grpc.ServiceRegistrar, srv LogicalBridgeServiceServer) {
	s.RegisterService(&LogicalBridgeService_ServiceDesc, srv)
}

func _LogicalBridgeService_CreateLogicalBridge_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateLogicalBridgeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogicalBridgeServiceServer).CreateLogicalBridge(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: LogicalBridgeService_CreateLogicalBridge_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogicalBridgeServiceServer).CreateLogicalBridge(ctx, req.(*CreateLogicalBridgeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LogicalBridgeService_ListLogicalBridges_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListLogicalBridgesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogicalBridgeServiceServer).ListLogicalBridges(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: LogicalBridgeService_ListLogicalBridges_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogicalBridgeServiceServer).ListLogicalBridges(ctx, req.(*ListLogicalBridgesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LogicalBridgeService_GetLogicalBridge_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetLogicalBridgeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogicalBridgeServiceServer).GetLogicalBridge(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: LogicalBridgeService_GetLogicalBridge_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogicalBridgeServiceServer).GetLogicalBridge(ctx, req.(*GetLogicalBridgeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LogicalBridgeService_DeleteLogicalBridge_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteLogicalBridgeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogicalBridgeServiceServer).DeleteLogicalBridge(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: LogicalBridgeService_DeleteLogicalBridge_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogicalBridgeServiceServer).DeleteLogicalBridge(ctx, req.(*DeleteLogicalBridgeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LogicalBridgeService_UpdateLogicalBridge_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateLogicalBridgeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogicalBridgeServiceServer).UpdateLogicalBridge(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: LogicalBridgeService_UpdateLogicalBridge_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogicalBridgeServiceServer).UpdateLogicalBridge(ctx, req.(*UpdateLogicalBridgeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// LogicalBridgeService_ServiceDesc is the grpc.ServiceDesc for LogicalBridgeService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var LogicalBridgeService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService",
	HandlerType: (*LogicalBridgeServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateLogicalBridge",
			Handler:    _LogicalBridgeService_CreateLogicalBridge_Handler,
		},
		{
			MethodName: "ListLogicalBridges",
			Handler:    _LogicalBridgeService_ListLogicalBridges_Handler,
		},
		{
			MethodName: "GetLogicalBridge",
			Handler:    _LogicalBridgeService_GetLogicalBridge_Handler,
		},
		{
			MethodName: "DeleteLogicalBridge",
			Handler:    _LogicalBridgeService_DeleteLogicalBridge_Handler,
		},
		{
			MethodName: "UpdateLogicalBridge",
			Handler:    _LogicalBridgeService_UpdateLogicalBridge_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "l2_xpu_infra_mgr.proto",
}

const (
	BridgePortService_CreateBridgePort_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.BridgePortService/CreateBridgePort"
	BridgePortService_ListBridgePorts_FullMethodName  = "/opi_api.network.evpn_gw.v1alpha1.BridgePortService/ListBridgePorts"
	BridgePortService_GetBridgePort_FullMethodName    = "/opi_api.network.evpn_gw.v1alpha1.BridgePortService/GetBridgePort"
	BridgePortService_DeleteBridgePort_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.BridgePortService/DeleteBridgePort"
	BridgePortService_UpdateBridgePort_FullMethodName = "/opi_api.network.evpn_gw.v1alpha1.BridgePortService/UpdateBridgePort"
)

// BridgePortServiceClient is the client API for BridgePortService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type BridgePortServiceClient interface {
	// Create a Bridge Port
	CreateBridgePort(ctx context.Context, in *CreateBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error)
	// List Bridge Ports
	ListBridgePorts(ctx context.Context, in *ListBridgePortsRequest, opts ...grpc.CallOption) (*ListBridgePortsResponse, error)
	// Retrieve a Bridge Port
	GetBridgePort(ctx context.Context, in *GetBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error)
	// Delete a Bridge Port
	DeleteBridgePort(ctx context.Context, in *DeleteBridgePortRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update a Bridge Port
	UpdateBridgePort(ctx context.Context, in *UpdateBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error)
}

type bridgePortServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewBridgePortServiceClient(cc grpc.ClientConnInterface) BridgePortServiceClient {
	return &bridgePortServiceClient{cc}
}

func (c *bridgePortServiceClient) CreateBridgePort(ctx context.Context, in *CreateBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error) {
	out := new(BridgePort)
	err := c.cc.Invoke(ctx, BridgePortService_CreateBridgePort_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bridgePortServiceClient) ListBridgePorts(ctx context.Context, in *ListBridgePortsRequest, opts ...grpc.CallOption) (*ListBridgePortsResponse, error) {
	out := new(ListBridgePortsResponse)
	err := c.cc.Invoke(ctx, BridgePortService_ListBridgePorts_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bridgePortServiceClient) GetBridgePort(ctx context.Context, in *GetBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error) {
	out := new(BridgePort)
	err := c.cc.Invoke(ctx, BridgePortService_GetBridgePort_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bridgePortServiceClient) DeleteBridgePort(ctx context.Context, in *DeleteBridgePortRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, BridgePortService_DeleteBridgePort_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bridgePortServiceClient) UpdateBridgePort(ctx context.Context, in *UpdateBridgePortRequest, opts ...grpc.CallOption) (*BridgePort, error) {
	out := new(BridgePort)
	err := c.cc.Invoke(ctx, BridgePortService_UpdateBridgePort_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// BridgePortServiceServer is the server API for BridgePortService service.
// All implementations must embed UnimplementedBridgePortServiceServer
// for forward compatibility
type BridgePortServiceServer interface {
	// Create a Bridge Port
	CreateBridgePort(context.Context, *CreateBridgePortRequest) (*BridgePort, error)
	// List Bridge Ports
	ListBridgePorts(context.Context, *ListBridgePortsRequest) (*ListBridgePortsResponse, error)
	// Retrieve a Bridge Port
	GetBridgePort(context.Context, *GetBridgePortRequest) (*BridgePort, error)
	// Delete a Bridge Port
	DeleteBridgePort(context.Context, *DeleteBridgePortRequest) (*emptypb.Empty, error)
	// Update a Bridge Port
	UpdateBridgePort(context.Context, *UpdateBridgePortRequest) (*BridgePort, error)
	mustEmbedUnimplementedBridgePortServiceServer()
}

// UnimplementedBridgePortServiceServer must be embedded to have forward compatible implementations.
type UnimplementedBridgePortServiceServer struct {
}

func (UnimplementedBridgePortServiceServer) CreateBridgePort(context.Context, *CreateBridgePortRequest) (*BridgePort, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateBridgePort not implemented")
}
func (UnimplementedBridgePortServiceServer) ListBridgePorts(context.Context, *ListBridgePortsRequest) (*ListBridgePortsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListBridgePorts not implemented")
}
func (UnimplementedBridgePortServiceServer) GetBridgePort(context.Context, *GetBridgePortRequest) (*BridgePort, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetBridgePort not implemented")
}
func (UnimplementedBridgePortServiceServer) DeleteBridgePort(context.Context, *DeleteBridgePortRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteBridgePort not implemented")
}
func (UnimplementedBridgePortServiceServer) UpdateBridgePort(context.Context, *UpdateBridgePortRequest) (*BridgePort, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateBridgePort not implemented")
}
func (UnimplementedBridgePortServiceServer) mustEmbedUnimplementedBridgePortServiceServer() {}

// UnsafeBridgePortServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to BridgePortServiceServer will
// result in compilation errors.
type UnsafeBridgePortServiceServer interface {
	mustEmbedUnimplementedBridgePortServiceServer()
}

func RegisterBridgePortServiceServer(s grpc.ServiceRegistrar, srv BridgePortServiceServer) {
	s.RegisterService(&BridgePortService_ServiceDesc, srv)
}

func _BridgePortService_CreateBridgePort_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateBridgePortRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BridgePortServiceServer).CreateBridgePort(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: BridgePortService_CreateBridgePort_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BridgePortServiceServer).CreateBridgePort(ctx, req.(*CreateBridgePortRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BridgePortService_ListBridgePorts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListBridgePortsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BridgePortServiceServer).ListBridgePorts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: BridgePortService_ListBridgePorts_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BridgePortServiceServer).ListBridgePorts(ctx, req.(*ListBridgePortsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BridgePortService_GetBridgePort_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetBridgePortRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BridgePortServiceServer).GetBridgePort(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: BridgePortService_GetBridgePort_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BridgePortServiceServer).GetBridgePort(ctx, req.(*GetBridgePortRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BridgePortService_DeleteBridgePort_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteBridgePortRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BridgePortServiceServer).DeleteBridgePort(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: BridgePortService_DeleteBridgePort_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BridgePortServiceServer).DeleteBridgePort(ctx, req.(*DeleteBridgePortRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BridgePortService_UpdateBridgePort_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateBridgePortRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BridgePortServiceServer).UpdateBridgePort(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: BridgePortService_UpdateBridgePort_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BridgePortServiceServer).UpdateBridgePort(ctx, req.(*UpdateBridgePortRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// BridgePortService_ServiceDesc is the grpc.ServiceDesc for BridgePortService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var BridgePortService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.network.evpn_gw.v1alpha1.BridgePortService",
	HandlerType: (*BridgePortServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateBridgePort",
			Handler:    _BridgePortService_CreateBridgePort_Handler,
		},
		{
			MethodName: "ListBridgePorts",
			Handler:    _BridgePortService_ListBridgePorts_Handler,
		},
		{
			MethodName: "GetBridgePort",
			Handler:    _BridgePortService_GetBridgePort_Handler,
		},
		{
			MethodName: "DeleteBridgePort",
			Handler:    _BridgePortService_DeleteBridgePort_Handler,
		},
		{
			MethodName: "UpdateBridgePort",
			Handler:    _BridgePortService_UpdateBridgePort_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "l2_xpu_infra_mgr.proto",
}

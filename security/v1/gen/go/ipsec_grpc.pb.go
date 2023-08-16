// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: ipsec.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// IPsecClient is the client API for IPsec service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type IPsecClient interface {
	IPsecVersion(ctx context.Context, in *IPsecVersionReq, opts ...grpc.CallOption) (*IPsecVersionResp, error)
	IPsecStats(ctx context.Context, in *IPsecStatsReq, opts ...grpc.CallOption) (*IPsecStatsResp, error)
	IPsecInitiate(ctx context.Context, in *IPsecInitiateReq, opts ...grpc.CallOption) (*IPsecInitiateResp, error)
	IPsecTerminate(ctx context.Context, in *IPsecTerminateReq, opts ...grpc.CallOption) (*IPsecTerminateResp, error)
	IPsecRekey(ctx context.Context, in *IPsecRekeyReq, opts ...grpc.CallOption) (*IPsecRekeyResp, error)
	IPsecListSas(ctx context.Context, in *IPsecListSasReq, opts ...grpc.CallOption) (*IPsecListSasResp, error)
	IPsecListConns(ctx context.Context, in *IPsecListConnsReq, opts ...grpc.CallOption) (*IPsecListConnsResp, error)
	IPsecListCerts(ctx context.Context, in *IPsecListCertsReq, opts ...grpc.CallOption) (*IPsecListCertsResp, error)
	IPsecLoadConn(ctx context.Context, in *IPsecLoadConnReq, opts ...grpc.CallOption) (*IPsecLoadConnResp, error)
	IPsecUnloadConn(ctx context.Context, in *IPsecUnloadConnReq, opts ...grpc.CallOption) (*IPsecUnloadConnResp, error)
}

type iPsecClient struct {
	cc grpc.ClientConnInterface
}

func NewIPsecClient(cc grpc.ClientConnInterface) IPsecClient {
	return &iPsecClient{cc}
}

func (c *iPsecClient) IPsecVersion(ctx context.Context, in *IPsecVersionReq, opts ...grpc.CallOption) (*IPsecVersionResp, error) {
	out := new(IPsecVersionResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecVersion", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecStats(ctx context.Context, in *IPsecStatsReq, opts ...grpc.CallOption) (*IPsecStatsResp, error) {
	out := new(IPsecStatsResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecStats", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecInitiate(ctx context.Context, in *IPsecInitiateReq, opts ...grpc.CallOption) (*IPsecInitiateResp, error) {
	out := new(IPsecInitiateResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecInitiate", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecTerminate(ctx context.Context, in *IPsecTerminateReq, opts ...grpc.CallOption) (*IPsecTerminateResp, error) {
	out := new(IPsecTerminateResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecTerminate", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecRekey(ctx context.Context, in *IPsecRekeyReq, opts ...grpc.CallOption) (*IPsecRekeyResp, error) {
	out := new(IPsecRekeyResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecRekey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecListSas(ctx context.Context, in *IPsecListSasReq, opts ...grpc.CallOption) (*IPsecListSasResp, error) {
	out := new(IPsecListSasResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecListSas", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecListConns(ctx context.Context, in *IPsecListConnsReq, opts ...grpc.CallOption) (*IPsecListConnsResp, error) {
	out := new(IPsecListConnsResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecListConns", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecListCerts(ctx context.Context, in *IPsecListCertsReq, opts ...grpc.CallOption) (*IPsecListCertsResp, error) {
	out := new(IPsecListCertsResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecListCerts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecLoadConn(ctx context.Context, in *IPsecLoadConnReq, opts ...grpc.CallOption) (*IPsecLoadConnResp, error) {
	out := new(IPsecLoadConnResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecLoadConn", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iPsecClient) IPsecUnloadConn(ctx context.Context, in *IPsecUnloadConnReq, opts ...grpc.CallOption) (*IPsecUnloadConnResp, error) {
	out := new(IPsecUnloadConnResp)
	err := c.cc.Invoke(ctx, "/opi_api.security.v1.IPsec/IPsecUnloadConn", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// IPsecServer is the server API for IPsec service.
// All implementations should embed UnimplementedIPsecServer
// for forward compatibility
type IPsecServer interface {
	IPsecVersion(context.Context, *IPsecVersionReq) (*IPsecVersionResp, error)
	IPsecStats(context.Context, *IPsecStatsReq) (*IPsecStatsResp, error)
	IPsecInitiate(context.Context, *IPsecInitiateReq) (*IPsecInitiateResp, error)
	IPsecTerminate(context.Context, *IPsecTerminateReq) (*IPsecTerminateResp, error)
	IPsecRekey(context.Context, *IPsecRekeyReq) (*IPsecRekeyResp, error)
	IPsecListSas(context.Context, *IPsecListSasReq) (*IPsecListSasResp, error)
	IPsecListConns(context.Context, *IPsecListConnsReq) (*IPsecListConnsResp, error)
	IPsecListCerts(context.Context, *IPsecListCertsReq) (*IPsecListCertsResp, error)
	IPsecLoadConn(context.Context, *IPsecLoadConnReq) (*IPsecLoadConnResp, error)
	IPsecUnloadConn(context.Context, *IPsecUnloadConnReq) (*IPsecUnloadConnResp, error)
}

// UnimplementedIPsecServer should be embedded to have forward compatible implementations.
type UnimplementedIPsecServer struct {
}

func (UnimplementedIPsecServer) IPsecVersion(context.Context, *IPsecVersionReq) (*IPsecVersionResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecVersion not implemented")
}
func (UnimplementedIPsecServer) IPsecStats(context.Context, *IPsecStatsReq) (*IPsecStatsResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecStats not implemented")
}
func (UnimplementedIPsecServer) IPsecInitiate(context.Context, *IPsecInitiateReq) (*IPsecInitiateResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecInitiate not implemented")
}
func (UnimplementedIPsecServer) IPsecTerminate(context.Context, *IPsecTerminateReq) (*IPsecTerminateResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecTerminate not implemented")
}
func (UnimplementedIPsecServer) IPsecRekey(context.Context, *IPsecRekeyReq) (*IPsecRekeyResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecRekey not implemented")
}
func (UnimplementedIPsecServer) IPsecListSas(context.Context, *IPsecListSasReq) (*IPsecListSasResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecListSas not implemented")
}
func (UnimplementedIPsecServer) IPsecListConns(context.Context, *IPsecListConnsReq) (*IPsecListConnsResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecListConns not implemented")
}
func (UnimplementedIPsecServer) IPsecListCerts(context.Context, *IPsecListCertsReq) (*IPsecListCertsResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecListCerts not implemented")
}
func (UnimplementedIPsecServer) IPsecLoadConn(context.Context, *IPsecLoadConnReq) (*IPsecLoadConnResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecLoadConn not implemented")
}
func (UnimplementedIPsecServer) IPsecUnloadConn(context.Context, *IPsecUnloadConnReq) (*IPsecUnloadConnResp, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IPsecUnloadConn not implemented")
}

// UnsafeIPsecServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to IPsecServer will
// result in compilation errors.
type UnsafeIPsecServer interface {
	mustEmbedUnimplementedIPsecServer()
}

func RegisterIPsecServer(s grpc.ServiceRegistrar, srv IPsecServer) {
	s.RegisterService(&IPsec_ServiceDesc, srv)
}

func _IPsec_IPsecVersion_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecVersionReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecVersion(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecVersion",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecVersion(ctx, req.(*IPsecVersionReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecStats_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecStatsReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecStats(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecStats",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecStats(ctx, req.(*IPsecStatsReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecInitiate_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecInitiateReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecInitiate(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecInitiate",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecInitiate(ctx, req.(*IPsecInitiateReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecTerminate_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecTerminateReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecTerminate(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecTerminate",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecTerminate(ctx, req.(*IPsecTerminateReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecRekey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecRekeyReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecRekey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecRekey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecRekey(ctx, req.(*IPsecRekeyReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecListSas_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecListSasReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecListSas(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecListSas",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecListSas(ctx, req.(*IPsecListSasReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecListConns_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecListConnsReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecListConns(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecListConns",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecListConns(ctx, req.(*IPsecListConnsReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecListCerts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecListCertsReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecListCerts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecListCerts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecListCerts(ctx, req.(*IPsecListCertsReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecLoadConn_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecLoadConnReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecLoadConn(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecLoadConn",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecLoadConn(ctx, req.(*IPsecLoadConnReq))
	}
	return interceptor(ctx, in, info, handler)
}

func _IPsec_IPsecUnloadConn_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IPsecUnloadConnReq)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IPsecServer).IPsecUnloadConn(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.security.v1.IPsec/IPsecUnloadConn",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IPsecServer).IPsecUnloadConn(ctx, req.(*IPsecUnloadConnReq))
	}
	return interceptor(ctx, in, info, handler)
}

// IPsec_ServiceDesc is the grpc.ServiceDesc for IPsec service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var IPsec_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.security.v1.IPsec",
	HandlerType: (*IPsecServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "IPsecVersion",
			Handler:    _IPsec_IPsecVersion_Handler,
		},
		{
			MethodName: "IPsecStats",
			Handler:    _IPsec_IPsecStats_Handler,
		},
		{
			MethodName: "IPsecInitiate",
			Handler:    _IPsec_IPsecInitiate_Handler,
		},
		{
			MethodName: "IPsecTerminate",
			Handler:    _IPsec_IPsecTerminate_Handler,
		},
		{
			MethodName: "IPsecRekey",
			Handler:    _IPsec_IPsecRekey_Handler,
		},
		{
			MethodName: "IPsecListSas",
			Handler:    _IPsec_IPsecListSas_Handler,
		},
		{
			MethodName: "IPsecListConns",
			Handler:    _IPsec_IPsecListConns_Handler,
		},
		{
			MethodName: "IPsecListCerts",
			Handler:    _IPsec_IPsecListCerts_Handler,
		},
		{
			MethodName: "IPsecLoadConn",
			Handler:    _IPsec_IPsecLoadConn_Handler,
		},
		{
			MethodName: "IPsecUnloadConn",
			Handler:    _IPsec_IPsecUnloadConn_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ipsec.proto",
}
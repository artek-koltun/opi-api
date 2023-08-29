// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: uuid.proto

#include "uuid.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG

namespace _pb = ::PROTOBUF_NAMESPACE_ID;
namespace _pbi = _pb::internal;

namespace opi_api {
namespace common {
namespace v1 {
PROTOBUF_CONSTEXPR Uuid::Uuid(
    ::_pbi::ConstantInitialized): _impl_{
    /*decltype(_impl_.value_)*/{&::_pbi::fixed_address_empty_string, ::_pbi::ConstantInitialized{}}
  , /*decltype(_impl_._cached_size_)*/{}} {}
struct UuidDefaultTypeInternal {
  PROTOBUF_CONSTEXPR UuidDefaultTypeInternal()
      : _instance(::_pbi::ConstantInitialized{}) {}
  ~UuidDefaultTypeInternal() {}
  union {
    Uuid _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 UuidDefaultTypeInternal _Uuid_default_instance_;
}  // namespace v1
}  // namespace common
}  // namespace opi_api
static ::_pb::Metadata file_level_metadata_uuid_2eproto[1];
static constexpr ::_pb::EnumDescriptor const** file_level_enum_descriptors_uuid_2eproto = nullptr;
static constexpr ::_pb::ServiceDescriptor const** file_level_service_descriptors_uuid_2eproto = nullptr;

const uint32_t TableStruct_uuid_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::opi_api::common::v1::Uuid, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  ~0u,  // no _inlined_string_donated_
  PROTOBUF_FIELD_OFFSET(::opi_api::common::v1::Uuid, _impl_.value_),
};
static const ::_pbi::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, -1, sizeof(::opi_api::common::v1::Uuid)},
};

static const ::_pb::Message* const file_default_instances[] = {
  &::opi_api::common::v1::_Uuid_default_instance_._instance,
};

const char descriptor_table_protodef_uuid_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\nuuid.proto\022\021opi_api.common.v1\"\025\n\004Uuid\022"
  "\r\n\005value\030\001 \001(\tBP\n\021opi_api.common.v1B\tUui"
  "dProtoP\001Z.github.com/opiproject/opi-api/"
  "common/v1/gen/gob\006proto3"
  ;
static ::_pbi::once_flag descriptor_table_uuid_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_uuid_2eproto = {
    false, false, 144, descriptor_table_protodef_uuid_2eproto,
    "uuid.proto",
    &descriptor_table_uuid_2eproto_once, nullptr, 0, 1,
    schemas, file_default_instances, TableStruct_uuid_2eproto::offsets,
    file_level_metadata_uuid_2eproto, file_level_enum_descriptors_uuid_2eproto,
    file_level_service_descriptors_uuid_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_uuid_2eproto_getter() {
  return &descriptor_table_uuid_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2 static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_uuid_2eproto(&descriptor_table_uuid_2eproto);
namespace opi_api {
namespace common {
namespace v1 {

// ===================================================================

class Uuid::_Internal {
 public:
};

Uuid::Uuid(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                         bool is_message_owned)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena, is_message_owned) {
  SharedCtor(arena, is_message_owned);
  // @@protoc_insertion_point(arena_constructor:opi_api.common.v1.Uuid)
}
Uuid::Uuid(const Uuid& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  Uuid* const _this = this; (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_.value_){}
    , /*decltype(_impl_._cached_size_)*/{}};

  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  _impl_.value_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.value_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_value().empty()) {
    _this->_impl_.value_.Set(from._internal_value(), 
      _this->GetArenaForAllocation());
  }
  // @@protoc_insertion_point(copy_constructor:opi_api.common.v1.Uuid)
}

inline void Uuid::SharedCtor(
    ::_pb::Arena* arena, bool is_message_owned) {
  (void)arena;
  (void)is_message_owned;
  new (&_impl_) Impl_{
      decltype(_impl_.value_){}
    , /*decltype(_impl_._cached_size_)*/{}
  };
  _impl_.value_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.value_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
}

Uuid::~Uuid() {
  // @@protoc_insertion_point(destructor:opi_api.common.v1.Uuid)
  if (auto *arena = _internal_metadata_.DeleteReturnArena<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>()) {
  (void)arena;
    return;
  }
  SharedDtor();
}

inline void Uuid::SharedDtor() {
  GOOGLE_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.value_.Destroy();
}

void Uuid::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

void Uuid::Clear() {
// @@protoc_insertion_point(message_clear_start:opi_api.common.v1.Uuid)
  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.value_.ClearToEmpty();
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* Uuid::_InternalParse(const char* ptr, ::_pbi::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    uint32_t tag;
    ptr = ::_pbi::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // string value = 1;
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 10)) {
          auto str = _internal_mutable_value();
          ptr = ::_pbi::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
          CHK_(::_pbi::VerifyUTF8(str, "opi_api.common.v1.Uuid.value"));
        } else
          goto handle_unusual;
        continue;
      default:
        goto handle_unusual;
    }  // switch
  handle_unusual:
    if ((tag == 0) || ((tag & 7) == 4)) {
      CHK_(ptr);
      ctx->SetLastTag(tag);
      goto message_done;
    }
    ptr = UnknownFieldParse(
        tag,
        _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
        ptr, ctx);
    CHK_(ptr != nullptr);
  }  // while
message_done:
  return ptr;
failure:
  ptr = nullptr;
  goto message_done;
#undef CHK_
}

uint8_t* Uuid::_InternalSerialize(
    uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:opi_api.common.v1.Uuid)
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  // string value = 1;
  if (!this->_internal_value().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_value().data(), static_cast<int>(this->_internal_value().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "opi_api.common.v1.Uuid.value");
    target = stream->WriteStringMaybeAliased(
        1, this->_internal_value(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:opi_api.common.v1.Uuid)
  return target;
}

size_t Uuid::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:opi_api.common.v1.Uuid)
  size_t total_size = 0;

  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string value = 1;
  if (!this->_internal_value().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_value());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData Uuid::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSourceCheck,
    Uuid::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*Uuid::GetClassData() const { return &_class_data_; }


void Uuid::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg) {
  auto* const _this = static_cast<Uuid*>(&to_msg);
  auto& from = static_cast<const Uuid&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:opi_api.common.v1.Uuid)
  GOOGLE_DCHECK_NE(&from, _this);
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (!from._internal_value().empty()) {
    _this->_internal_set_value(from._internal_value());
  }
  _this->_internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void Uuid::CopyFrom(const Uuid& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:opi_api.common.v1.Uuid)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Uuid::IsInitialized() const {
  return true;
}

void Uuid::InternalSwap(Uuid* other) {
  using std::swap;
  auto* lhs_arena = GetArenaForAllocation();
  auto* rhs_arena = other->GetArenaForAllocation();
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &_impl_.value_, lhs_arena,
      &other->_impl_.value_, rhs_arena
  );
}

::PROTOBUF_NAMESPACE_ID::Metadata Uuid::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_uuid_2eproto_getter, &descriptor_table_uuid_2eproto_once,
      file_level_metadata_uuid_2eproto[0]);
}

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1
}  // namespace common
}  // namespace opi_api
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::opi_api::common::v1::Uuid*
Arena::CreateMaybeMessage< ::opi_api::common::v1::Uuid >(Arena* arena) {
  return Arena::CreateMessageInternal< ::opi_api::common::v1::Uuid >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>

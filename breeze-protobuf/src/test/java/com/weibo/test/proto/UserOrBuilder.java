// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.weibo.test.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 age = 2;</code>
   */
  int getAge();

  /**
   * <code>optional .proto.Gender gender = 3;</code>
   */
  int getGenderValue();
  /**
   * <code>optional .proto.Gender gender = 3;</code>
   */
  Gender getGender();

  /**
   * <code>repeated .proto.Address address = 4;</code>
   */
  java.util.List<Address>
      getAddressList();
  /**
   * <code>repeated .proto.Address address = 4;</code>
   */
  Address getAddress(int index);
  /**
   * <code>repeated .proto.Address address = 4;</code>
   */
  int getAddressCount();
  /**
   * <code>repeated .proto.Address address = 4;</code>
   */
  java.util.List<? extends AddressOrBuilder>
      getAddressOrBuilderList();
  /**
   * <code>repeated .proto.Address address = 4;</code>
   */
  AddressOrBuilder getAddressOrBuilder(
          int index);
}
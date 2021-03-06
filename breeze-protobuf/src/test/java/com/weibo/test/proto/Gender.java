// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.weibo.test.proto;

/**
 * Protobuf enum {@code proto.Gender}
 */
public enum Gender
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Man = 0;</code>
   */
  Man(0),
  /**
   * <code>Woman = 1;</code>
   */
  Woman(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Man = 0;</code>
   */
  public static final int Man_VALUE = 0;
  /**
   * <code>Woman = 1;</code>
   */
  public static final int Woman_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static Gender valueOf(int value) {
    return forNumber(value);
  }

  public static Gender forNumber(int value) {
    switch (value) {
      case 0: return Man;
      case 1: return Woman;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Gender>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Gender> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Gender>() {
          public Gender findValueByNumber(int number) {
            return Gender.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.weibo.test.proto.UserProto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final Gender[] VALUES = values();

  public static Gender valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Gender(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.Gender)
}


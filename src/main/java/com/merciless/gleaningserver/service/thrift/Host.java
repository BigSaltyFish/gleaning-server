/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.merciless.gleaningserver.service.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-12")
public class Host implements org.apache.thrift.TBase<Host, Host._Fields>, java.io.Serializable, Cloneable, Comparable<Host> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Host");

  private static final org.apache.thrift.protocol.TField HOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HostStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HostTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String hostName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String location; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST_NAME((short)1, "hostName"),
    LOCATION((short)2, "location");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HOST_NAME
          return HOST_NAME;
        case 2: // LOCATION
          return LOCATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("hostName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Host.class, metaDataMap);
  }

  public Host() {
  }

  public Host(
    java.lang.String hostName,
    java.lang.String location)
  {
    this();
    this.hostName = hostName;
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Host(Host other) {
    if (other.isSetHostName()) {
      this.hostName = other.hostName;
    }
    if (other.isSetLocation()) {
      this.location = other.location;
    }
  }

  public Host deepCopy() {
    return new Host(this);
  }

  @Override
  public void clear() {
    this.hostName = null;
    this.location = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getHostName() {
    return this.hostName;
  }

  public void setHostName(@org.apache.thrift.annotation.Nullable java.lang.String hostName) {
    this.hostName = hostName;
  }

  public void unsetHostName() {
    this.hostName = null;
  }

  /** Returns true if field hostName is set (has been assigned a value) and false otherwise */
  public boolean isSetHostName() {
    return this.hostName != null;
  }

  public void setHostNameIsSet(boolean value) {
    if (!value) {
      this.hostName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLocation() {
    return this.location;
  }

  public void setLocation(@org.apache.thrift.annotation.Nullable java.lang.String location) {
    this.location = location;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HOST_NAME:
      if (value == null) {
        unsetHostName();
      } else {
        setHostName((java.lang.String)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST_NAME:
      return getHostName();

    case LOCATION:
      return getLocation();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOST_NAME:
      return isSetHostName();
    case LOCATION:
      return isSetLocation();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Host)
      return this.equals((Host)that);
    return false;
  }

  public boolean equals(Host that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hostName = true && this.isSetHostName();
    boolean that_present_hostName = true && that.isSetHostName();
    if (this_present_hostName || that_present_hostName) {
      if (!(this_present_hostName && that_present_hostName))
        return false;
      if (!this.hostName.equals(that.hostName))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHostName()) ? 131071 : 524287);
    if (isSetHostName())
      hashCode = hashCode * 8191 + hostName.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocation()) ? 131071 : 524287);
    if (isSetLocation())
      hashCode = hashCode * 8191 + location.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Host other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHostName()).compareTo(other.isSetHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostName, other.hostName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Host(");
    boolean first = true;

    sb.append("hostName:");
    if (this.hostName == null) {
      sb.append("null");
    } else {
      sb.append(this.hostName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetHostName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hostName' is unset! Struct:" + toString());
    }

    if (!isSetLocation()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'location' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HostStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HostStandardScheme getScheme() {
      return new HostStandardScheme();
    }
  }

  private static class HostStandardScheme extends org.apache.thrift.scheme.StandardScheme<Host> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Host struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostName = iprot.readString();
              struct.setHostNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Host struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hostName != null) {
        oprot.writeFieldBegin(HOST_NAME_FIELD_DESC);
        oprot.writeString(struct.hostName);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.location);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HostTupleScheme getScheme() {
      return new HostTupleScheme();
    }
  }

  private static class HostTupleScheme extends org.apache.thrift.scheme.TupleScheme<Host> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Host struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.hostName);
      oprot.writeString(struct.location);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Host struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.hostName = iprot.readString();
      struct.setHostNameIsSet(true);
      struct.location = iprot.readString();
      struct.setLocationIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


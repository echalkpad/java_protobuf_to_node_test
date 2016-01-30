// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: instrument.proto

package instrument;

public final class InstrumentProtos {
  private InstrumentProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InstrumentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:instrument.Instrument)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string symbol = 1;</code>
     */
    boolean hasSymbol();
    /**
     * <code>required string symbol = 1;</code>
     */
    java.lang.String getSymbol();
    /**
     * <code>required string symbol = 1;</code>
     */
    com.google.protobuf.ByteString
        getSymbolBytes();

    /**
     * <code>required string company = 2;</code>
     */
    boolean hasCompany();
    /**
     * <code>required string company = 2;</code>
     */
    java.lang.String getCompany();
    /**
     * <code>required string company = 2;</code>
     */
    com.google.protobuf.ByteString
        getCompanyBytes();

    /**
     * <code>required float avgVolume = 3;</code>
     */
    boolean hasAvgVolume();
    /**
     * <code>required float avgVolume = 3;</code>
     */
    float getAvgVolume();

    /**
     * <code>required float lastClose = 4;</code>
     */
    boolean hasLastClose();
    /**
     * <code>required float lastClose = 4;</code>
     */
    float getLastClose();
  }
  /**
   * Protobuf type {@code instrument.Instrument}
   */
  public static final class Instrument extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:instrument.Instrument)
      InstrumentOrBuilder {
    // Use Instrument.newBuilder() to construct.
    private Instrument(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Instrument(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Instrument defaultInstance;
    public static Instrument getDefaultInstance() {
      return defaultInstance;
    }

    public Instrument getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Instrument(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              symbol_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              company_ = bs;
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              avgVolume_ = input.readFloat();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              lastClose_ = input.readFloat();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return instrument.InstrumentProtos.internal_static_instrument_Instrument_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return instrument.InstrumentProtos.internal_static_instrument_Instrument_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              instrument.InstrumentProtos.Instrument.class, instrument.InstrumentProtos.Instrument.Builder.class);
    }

    public static com.google.protobuf.Parser<Instrument> PARSER =
        new com.google.protobuf.AbstractParser<Instrument>() {
      public Instrument parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Instrument(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Instrument> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    private java.lang.Object symbol_;
    /**
     * <code>required string symbol = 1;</code>
     */
    public boolean hasSymbol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string symbol = 1;</code>
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          symbol_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string symbol = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMPANY_FIELD_NUMBER = 2;
    private java.lang.Object company_;
    /**
     * <code>required string company = 2;</code>
     */
    public boolean hasCompany() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string company = 2;</code>
     */
    public java.lang.String getCompany() {
      java.lang.Object ref = company_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          company_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string company = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCompanyBytes() {
      java.lang.Object ref = company_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        company_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AVGVOLUME_FIELD_NUMBER = 3;
    private float avgVolume_;
    /**
     * <code>required float avgVolume = 3;</code>
     */
    public boolean hasAvgVolume() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required float avgVolume = 3;</code>
     */
    public float getAvgVolume() {
      return avgVolume_;
    }

    public static final int LASTCLOSE_FIELD_NUMBER = 4;
    private float lastClose_;
    /**
     * <code>required float lastClose = 4;</code>
     */
    public boolean hasLastClose() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required float lastClose = 4;</code>
     */
    public float getLastClose() {
      return lastClose_;
    }

    private void initFields() {
      symbol_ = "";
      company_ = "";
      avgVolume_ = 0F;
      lastClose_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSymbol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCompany()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAvgVolume()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastClose()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSymbolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getCompanyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, avgVolume_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, lastClose_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSymbolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getCompanyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, avgVolume_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, lastClose_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static instrument.InstrumentProtos.Instrument parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static instrument.InstrumentProtos.Instrument parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static instrument.InstrumentProtos.Instrument parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static instrument.InstrumentProtos.Instrument parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(instrument.InstrumentProtos.Instrument prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code instrument.Instrument}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:instrument.Instrument)
        instrument.InstrumentProtos.InstrumentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return instrument.InstrumentProtos.internal_static_instrument_Instrument_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return instrument.InstrumentProtos.internal_static_instrument_Instrument_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                instrument.InstrumentProtos.Instrument.class, instrument.InstrumentProtos.Instrument.Builder.class);
      }

      // Construct using instrument.InstrumentProtos.Instrument.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        symbol_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        company_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        avgVolume_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        lastClose_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return instrument.InstrumentProtos.internal_static_instrument_Instrument_descriptor;
      }

      public instrument.InstrumentProtos.Instrument getDefaultInstanceForType() {
        return instrument.InstrumentProtos.Instrument.getDefaultInstance();
      }

      public instrument.InstrumentProtos.Instrument build() {
        instrument.InstrumentProtos.Instrument result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public instrument.InstrumentProtos.Instrument buildPartial() {
        instrument.InstrumentProtos.Instrument result = new instrument.InstrumentProtos.Instrument(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.symbol_ = symbol_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.company_ = company_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.avgVolume_ = avgVolume_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.lastClose_ = lastClose_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof instrument.InstrumentProtos.Instrument) {
          return mergeFrom((instrument.InstrumentProtos.Instrument)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(instrument.InstrumentProtos.Instrument other) {
        if (other == instrument.InstrumentProtos.Instrument.getDefaultInstance()) return this;
        if (other.hasSymbol()) {
          bitField0_ |= 0x00000001;
          symbol_ = other.symbol_;
          onChanged();
        }
        if (other.hasCompany()) {
          bitField0_ |= 0x00000002;
          company_ = other.company_;
          onChanged();
        }
        if (other.hasAvgVolume()) {
          setAvgVolume(other.getAvgVolume());
        }
        if (other.hasLastClose()) {
          setLastClose(other.getLastClose());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSymbol()) {
          
          return false;
        }
        if (!hasCompany()) {
          
          return false;
        }
        if (!hasAvgVolume()) {
          
          return false;
        }
        if (!hasLastClose()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        instrument.InstrumentProtos.Instrument parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (instrument.InstrumentProtos.Instrument) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object symbol_ = "";
      /**
       * <code>required string symbol = 1;</code>
       */
      public boolean hasSymbol() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string symbol = 1;</code>
       */
      public java.lang.String getSymbol() {
        java.lang.Object ref = symbol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            symbol_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string symbol = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSymbolBytes() {
        java.lang.Object ref = symbol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symbol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string symbol = 1;</code>
       */
      public Builder setSymbol(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string symbol = 1;</code>
       */
      public Builder clearSymbol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        symbol_ = getDefaultInstance().getSymbol();
        onChanged();
        return this;
      }
      /**
       * <code>required string symbol = 1;</code>
       */
      public Builder setSymbolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbol_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object company_ = "";
      /**
       * <code>required string company = 2;</code>
       */
      public boolean hasCompany() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string company = 2;</code>
       */
      public java.lang.String getCompany() {
        java.lang.Object ref = company_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            company_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string company = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCompanyBytes() {
        java.lang.Object ref = company_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          company_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string company = 2;</code>
       */
      public Builder setCompany(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        company_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string company = 2;</code>
       */
      public Builder clearCompany() {
        bitField0_ = (bitField0_ & ~0x00000002);
        company_ = getDefaultInstance().getCompany();
        onChanged();
        return this;
      }
      /**
       * <code>required string company = 2;</code>
       */
      public Builder setCompanyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        company_ = value;
        onChanged();
        return this;
      }

      private float avgVolume_ ;
      /**
       * <code>required float avgVolume = 3;</code>
       */
      public boolean hasAvgVolume() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required float avgVolume = 3;</code>
       */
      public float getAvgVolume() {
        return avgVolume_;
      }
      /**
       * <code>required float avgVolume = 3;</code>
       */
      public Builder setAvgVolume(float value) {
        bitField0_ |= 0x00000004;
        avgVolume_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float avgVolume = 3;</code>
       */
      public Builder clearAvgVolume() {
        bitField0_ = (bitField0_ & ~0x00000004);
        avgVolume_ = 0F;
        onChanged();
        return this;
      }

      private float lastClose_ ;
      /**
       * <code>required float lastClose = 4;</code>
       */
      public boolean hasLastClose() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required float lastClose = 4;</code>
       */
      public float getLastClose() {
        return lastClose_;
      }
      /**
       * <code>required float lastClose = 4;</code>
       */
      public Builder setLastClose(float value) {
        bitField0_ |= 0x00000008;
        lastClose_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float lastClose = 4;</code>
       */
      public Builder clearLastClose() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lastClose_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:instrument.Instrument)
    }

    static {
      defaultInstance = new Instrument(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:instrument.Instrument)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_instrument_Instrument_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_instrument_Instrument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020instrument.proto\022\ninstrument\"S\n\nInstru" +
      "ment\022\016\n\006symbol\030\001 \002(\t\022\017\n\007company\030\002 \002(\t\022\021\n" +
      "\tavgVolume\030\003 \002(\002\022\021\n\tlastClose\030\004 \002(\002B\022B\020I" +
      "nstrumentProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_instrument_Instrument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_instrument_Instrument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_instrument_Instrument_descriptor,
        new java.lang.String[] { "Symbol", "Company", "AvgVolume", "LastClose", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

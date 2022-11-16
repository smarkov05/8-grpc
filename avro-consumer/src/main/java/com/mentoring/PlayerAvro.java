/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mentoring;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PlayerAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3734231136311911216L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PlayerAvro\",\"namespace\":\"com.mentoring\",\"fields\":[{\"name\":\"fullName\",\"type\":\"string\"},{\"name\":\"rank\",\"type\":\"long\"},{\"name\":\"disqualified\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PlayerAvro> ENCODER =
      new BinaryMessageEncoder<PlayerAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PlayerAvro> DECODER =
      new BinaryMessageDecoder<PlayerAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PlayerAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PlayerAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PlayerAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PlayerAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PlayerAvro from a ByteBuffer. */
  public static PlayerAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence fullName;
  @Deprecated public long rank;
  @Deprecated public boolean disqualified;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PlayerAvro() {}

  /**
   * All-args constructor.
   * @param fullName The new value for fullName
   * @param rank The new value for rank
   * @param disqualified The new value for disqualified
   */
  public PlayerAvro(java.lang.CharSequence fullName, java.lang.Long rank, java.lang.Boolean disqualified) {
    this.fullName = fullName;
    this.rank = rank;
    this.disqualified = disqualified;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fullName;
    case 1: return rank;
    case 2: return disqualified;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fullName = (java.lang.CharSequence)value$; break;
    case 1: rank = (java.lang.Long)value$; break;
    case 2: disqualified = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fullName' field.
   * @return The value of the 'fullName' field.
   */
  public java.lang.CharSequence getFullName() {
    return fullName;
  }

  /**
   * Sets the value of the 'fullName' field.
   * @param value the value to set.
   */
  public void setFullName(java.lang.CharSequence value) {
    this.fullName = value;
  }

  /**
   * Gets the value of the 'rank' field.
   * @return The value of the 'rank' field.
   */
  public java.lang.Long getRank() {
    return rank;
  }

  /**
   * Sets the value of the 'rank' field.
   * @param value the value to set.
   */
  public void setRank(java.lang.Long value) {
    this.rank = value;
  }

  /**
   * Gets the value of the 'disqualified' field.
   * @return The value of the 'disqualified' field.
   */
  public java.lang.Boolean getDisqualified() {
    return disqualified;
  }

  /**
   * Sets the value of the 'disqualified' field.
   * @param value the value to set.
   */
  public void setDisqualified(java.lang.Boolean value) {
    this.disqualified = value;
  }

  /**
   * Creates a new PlayerAvro RecordBuilder.
   * @return A new PlayerAvro RecordBuilder
   */
  public static com.mentoring.PlayerAvro.Builder newBuilder() {
    return new com.mentoring.PlayerAvro.Builder();
  }

  /**
   * Creates a new PlayerAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PlayerAvro RecordBuilder
   */
  public static com.mentoring.PlayerAvro.Builder newBuilder(com.mentoring.PlayerAvro.Builder other) {
    return new com.mentoring.PlayerAvro.Builder(other);
  }

  /**
   * Creates a new PlayerAvro RecordBuilder by copying an existing PlayerAvro instance.
   * @param other The existing instance to copy.
   * @return A new PlayerAvro RecordBuilder
   */
  public static com.mentoring.PlayerAvro.Builder newBuilder(com.mentoring.PlayerAvro other) {
    return new com.mentoring.PlayerAvro.Builder(other);
  }

  /**
   * RecordBuilder for PlayerAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PlayerAvro>
    implements org.apache.avro.data.RecordBuilder<PlayerAvro> {

    private java.lang.CharSequence fullName;
    private long rank;
    private boolean disqualified;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mentoring.PlayerAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fullName)) {
        this.fullName = data().deepCopy(fields()[0].schema(), other.fullName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rank)) {
        this.rank = data().deepCopy(fields()[1].schema(), other.rank);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.disqualified)) {
        this.disqualified = data().deepCopy(fields()[2].schema(), other.disqualified);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PlayerAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mentoring.PlayerAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.fullName)) {
        this.fullName = data().deepCopy(fields()[0].schema(), other.fullName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rank)) {
        this.rank = data().deepCopy(fields()[1].schema(), other.rank);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.disqualified)) {
        this.disqualified = data().deepCopy(fields()[2].schema(), other.disqualified);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'fullName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFullName() {
      return fullName;
    }

    /**
      * Sets the value of the 'fullName' field.
      * @param value The value of 'fullName'.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder setFullName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.fullName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fullName' field has been set.
      * @return True if the 'fullName' field has been set, false otherwise.
      */
    public boolean hasFullName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fullName' field.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder clearFullName() {
      fullName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'rank' field.
      * @return The value.
      */
    public java.lang.Long getRank() {
      return rank;
    }

    /**
      * Sets the value of the 'rank' field.
      * @param value The value of 'rank'.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder setRank(long value) {
      validate(fields()[1], value);
      this.rank = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'rank' field has been set.
      * @return True if the 'rank' field has been set, false otherwise.
      */
    public boolean hasRank() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'rank' field.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder clearRank() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'disqualified' field.
      * @return The value.
      */
    public java.lang.Boolean getDisqualified() {
      return disqualified;
    }

    /**
      * Sets the value of the 'disqualified' field.
      * @param value The value of 'disqualified'.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder setDisqualified(boolean value) {
      validate(fields()[2], value);
      this.disqualified = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'disqualified' field has been set.
      * @return True if the 'disqualified' field has been set, false otherwise.
      */
    public boolean hasDisqualified() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'disqualified' field.
      * @return This builder.
      */
    public com.mentoring.PlayerAvro.Builder clearDisqualified() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PlayerAvro build() {
      try {
        PlayerAvro record = new PlayerAvro();
        record.fullName = fieldSetFlags()[0] ? this.fullName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.rank = fieldSetFlags()[1] ? this.rank : (java.lang.Long) defaultValue(fields()[1]);
        record.disqualified = fieldSetFlags()[2] ? this.disqualified : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PlayerAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<PlayerAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PlayerAvro>
    READER$ = (org.apache.avro.io.DatumReader<PlayerAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

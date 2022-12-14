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
public class GameStatisticAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5579907922726292057L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GameStatisticAvro\",\"namespace\":\"com.mentoring\",\"fields\":[{\"name\":\"gameDate\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"score\",\"type\":\"string\"},{\"name\":\"players\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PlayerAvro\",\"fields\":[{\"name\":\"fullName\",\"type\":\"string\"},{\"name\":\"rank\",\"type\":\"long\"},{\"name\":\"disqualified\",\"type\":\"boolean\"}]}}},{\"name\":\"gameStatus\",\"type\":{\"type\":\"enum\",\"name\":\"GameStatusAvro\",\"symbols\":[\"SCHEDULED\",\"IN_PROGRESS\",\"FINISHED\",\"NO_CONTESTED\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GameStatisticAvro> ENCODER =
      new BinaryMessageEncoder<GameStatisticAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GameStatisticAvro> DECODER =
      new BinaryMessageDecoder<GameStatisticAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<GameStatisticAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<GameStatisticAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GameStatisticAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this GameStatisticAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a GameStatisticAvro from a ByteBuffer. */
  public static GameStatisticAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public org.joda.time.LocalDate gameDate;
  @Deprecated public java.lang.CharSequence score;
  @Deprecated public java.util.List<com.mentoring.PlayerAvro> players;
  @Deprecated public com.mentoring.GameStatusAvro gameStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GameStatisticAvro() {}

  /**
   * All-args constructor.
   * @param gameDate The new value for gameDate
   * @param score The new value for score
   * @param players The new value for players
   * @param gameStatus The new value for gameStatus
   */
  public GameStatisticAvro(org.joda.time.LocalDate gameDate, java.lang.CharSequence score, java.util.List<com.mentoring.PlayerAvro> players, com.mentoring.GameStatusAvro gameStatus) {
    this.gameDate = gameDate;
    this.score = score;
    this.players = players;
    this.gameStatus = gameStatus;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return gameDate;
    case 1: return score;
    case 2: return players;
    case 3: return gameStatus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      DATE_CONVERSION,
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: gameDate = (org.joda.time.LocalDate)value$; break;
    case 1: score = (java.lang.CharSequence)value$; break;
    case 2: players = (java.util.List<com.mentoring.PlayerAvro>)value$; break;
    case 3: gameStatus = (com.mentoring.GameStatusAvro)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'gameDate' field.
   * @return The value of the 'gameDate' field.
   */
  public org.joda.time.LocalDate getGameDate() {
    return gameDate;
  }

  /**
   * Sets the value of the 'gameDate' field.
   * @param value the value to set.
   */
  public void setGameDate(org.joda.time.LocalDate value) {
    this.gameDate = value;
  }

  /**
   * Gets the value of the 'score' field.
   * @return The value of the 'score' field.
   */
  public java.lang.CharSequence getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * @param value the value to set.
   */
  public void setScore(java.lang.CharSequence value) {
    this.score = value;
  }

  /**
   * Gets the value of the 'players' field.
   * @return The value of the 'players' field.
   */
  public java.util.List<com.mentoring.PlayerAvro> getPlayers() {
    return players;
  }

  /**
   * Sets the value of the 'players' field.
   * @param value the value to set.
   */
  public void setPlayers(java.util.List<com.mentoring.PlayerAvro> value) {
    this.players = value;
  }

  /**
   * Gets the value of the 'gameStatus' field.
   * @return The value of the 'gameStatus' field.
   */
  public com.mentoring.GameStatusAvro getGameStatus() {
    return gameStatus;
  }

  /**
   * Sets the value of the 'gameStatus' field.
   * @param value the value to set.
   */
  public void setGameStatus(com.mentoring.GameStatusAvro value) {
    this.gameStatus = value;
  }

  /**
   * Creates a new GameStatisticAvro RecordBuilder.
   * @return A new GameStatisticAvro RecordBuilder
   */
  public static com.mentoring.GameStatisticAvro.Builder newBuilder() {
    return new com.mentoring.GameStatisticAvro.Builder();
  }

  /**
   * Creates a new GameStatisticAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GameStatisticAvro RecordBuilder
   */
  public static com.mentoring.GameStatisticAvro.Builder newBuilder(com.mentoring.GameStatisticAvro.Builder other) {
    return new com.mentoring.GameStatisticAvro.Builder(other);
  }

  /**
   * Creates a new GameStatisticAvro RecordBuilder by copying an existing GameStatisticAvro instance.
   * @param other The existing instance to copy.
   * @return A new GameStatisticAvro RecordBuilder
   */
  public static com.mentoring.GameStatisticAvro.Builder newBuilder(com.mentoring.GameStatisticAvro other) {
    return new com.mentoring.GameStatisticAvro.Builder(other);
  }

  /**
   * RecordBuilder for GameStatisticAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GameStatisticAvro>
    implements org.apache.avro.data.RecordBuilder<GameStatisticAvro> {

    private org.joda.time.LocalDate gameDate;
    private java.lang.CharSequence score;
    private java.util.List<com.mentoring.PlayerAvro> players;
    private com.mentoring.GameStatusAvro gameStatus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mentoring.GameStatisticAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.gameDate)) {
        this.gameDate = data().deepCopy(fields()[0].schema(), other.gameDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.players)) {
        this.players = data().deepCopy(fields()[2].schema(), other.players);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gameStatus)) {
        this.gameStatus = data().deepCopy(fields()[3].schema(), other.gameStatus);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GameStatisticAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mentoring.GameStatisticAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.gameDate)) {
        this.gameDate = data().deepCopy(fields()[0].schema(), other.gameDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.players)) {
        this.players = data().deepCopy(fields()[2].schema(), other.players);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gameStatus)) {
        this.gameStatus = data().deepCopy(fields()[3].schema(), other.gameStatus);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'gameDate' field.
      * @return The value.
      */
    public org.joda.time.LocalDate getGameDate() {
      return gameDate;
    }

    /**
      * Sets the value of the 'gameDate' field.
      * @param value The value of 'gameDate'.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder setGameDate(org.joda.time.LocalDate value) {
      validate(fields()[0], value);
      this.gameDate = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'gameDate' field has been set.
      * @return True if the 'gameDate' field has been set, false otherwise.
      */
    public boolean hasGameDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'gameDate' field.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder clearGameDate() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'score' field.
      * @return The value.
      */
    public java.lang.CharSequence getScore() {
      return score;
    }

    /**
      * Sets the value of the 'score' field.
      * @param value The value of 'score'.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder setScore(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.score = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'score' field has been set.
      * @return True if the 'score' field has been set, false otherwise.
      */
    public boolean hasScore() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'score' field.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder clearScore() {
      score = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'players' field.
      * @return The value.
      */
    public java.util.List<com.mentoring.PlayerAvro> getPlayers() {
      return players;
    }

    /**
      * Sets the value of the 'players' field.
      * @param value The value of 'players'.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder setPlayers(java.util.List<com.mentoring.PlayerAvro> value) {
      validate(fields()[2], value);
      this.players = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'players' field has been set.
      * @return True if the 'players' field has been set, false otherwise.
      */
    public boolean hasPlayers() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'players' field.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder clearPlayers() {
      players = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'gameStatus' field.
      * @return The value.
      */
    public com.mentoring.GameStatusAvro getGameStatus() {
      return gameStatus;
    }

    /**
      * Sets the value of the 'gameStatus' field.
      * @param value The value of 'gameStatus'.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder setGameStatus(com.mentoring.GameStatusAvro value) {
      validate(fields()[3], value);
      this.gameStatus = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'gameStatus' field has been set.
      * @return True if the 'gameStatus' field has been set, false otherwise.
      */
    public boolean hasGameStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'gameStatus' field.
      * @return This builder.
      */
    public com.mentoring.GameStatisticAvro.Builder clearGameStatus() {
      gameStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GameStatisticAvro build() {
      try {
        GameStatisticAvro record = new GameStatisticAvro();
        record.gameDate = fieldSetFlags()[0] ? this.gameDate : (org.joda.time.LocalDate) defaultValue(fields()[0], record.getConversion(0));
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.CharSequence) defaultValue(fields()[1], record.getConversion(1));
        record.players = fieldSetFlags()[2] ? this.players : (java.util.List<com.mentoring.PlayerAvro>) defaultValue(fields()[2], record.getConversion(2));
        record.gameStatus = fieldSetFlags()[3] ? this.gameStatus : (com.mentoring.GameStatusAvro) defaultValue(fields()[3], record.getConversion(3));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GameStatisticAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<GameStatisticAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GameStatisticAvro>
    READER$ = (org.apache.avro.io.DatumReader<GameStatisticAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mentoring;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum GameStatusAvro {
  SCHEDULED, IN_PROGRESS, FINISHED, NO_CONTESTED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"GameStatusAvro\",\"namespace\":\"com.mentoring\",\"symbols\":[\"SCHEDULED\",\"IN_PROGRESS\",\"FINISHED\",\"NO_CONTESTED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
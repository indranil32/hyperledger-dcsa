/*
 * DCSA OpenAPI specification for Track & Trace
 * API specification issued by DCSA.org
 *
 * OpenAPI spec version: 2.0.1
 * Contact: info@dcsa.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.dcsa.tnt.common;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Code to denote whether the equipment is empty or laden.
 */
@JsonAdapter(EmptyIndicatorCode.Adapter.class)
public enum EmptyIndicatorCode {
  EMPTY("EMPTY"),
  LADEN("LADEN");

  private String value;

  EmptyIndicatorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmptyIndicatorCode fromValue(String text) {
    for (EmptyIndicatorCode b : EmptyIndicatorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmptyIndicatorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmptyIndicatorCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmptyIndicatorCode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmptyIndicatorCode.fromValue(String.valueOf(value));
    }
  }
}
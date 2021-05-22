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
 * The Transport Document Type is used to identify which type of document, the value of \&quot;transportDocumentID\&quot; represents. The values available are: - BOL (Bill of Lading) - SWB (Sea Waybill) 
 */
@JsonAdapter(TransportDocumentType.Adapter.class)
public enum TransportDocumentType {
  BOL("BOL"),
  SWB("SWB");

  private String value;

  TransportDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransportDocumentType fromValue(String text) {
    for (TransportDocumentType b : TransportDocumentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransportDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransportDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransportDocumentType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TransportDocumentType.fromValue(String.valueOf(value));
    }
  }
}

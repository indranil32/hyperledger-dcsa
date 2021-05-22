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

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;

/**
 * The transport event entity is a specialization of the event entity to support specification of data that only applies to a transport event.
 */
@Schema(description = "The transport event entity is a specialization of the event entity to support specification of data that only applies to a transport event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-22T05:06:30.605Z[GMT]")
public class TransportEvent extends Event implements AnyOfeventsItems, OneOfinlineResponse200 {
  /**
   * Gets or Sets transportEventEventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    TRANSPORT("TRANSPORT");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EventTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("eventType")
  private EventTypeEnum transportEventEventType = null;

  /**
   * Unique identifier for Event Type Code, for transport events this is either ARRI (Arrival) or DEPA (Departure).
   */
  @JsonAdapter(EventTypeCodeEnum.Adapter.class)
  public enum EventTypeCodeEnum {
    ARRI("ARRI"),
    DEPA("DEPA");

    private String value;

    EventTypeCodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EventTypeCodeEnum fromValue(String text) {
      for (EventTypeCodeEnum b : EventTypeCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EventTypeCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeCodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EventTypeCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("eventTypeCode")
  private EventTypeCodeEnum eventTypeCode = null;

  @SerializedName("delayReasonCode")
  private String delayReasonCode = null;

  @SerializedName("vesselScheduleChangeRemark")
  private String vesselScheduleChangeRemark = null;

  @SerializedName("transportCallID")
  private UUID transportCallID = null;

  public TransportEvent transportEventEventType(EventTypeEnum transportEventEventType) {
    this.transportEventEventType = transportEventEventType;
    return this;
  }

   /**
   * Get transportEventEventType
   * @return transportEventEventType
  **/
  @Schema(example = "TRANSPORT", description = "")
  public EventTypeEnum getTransportEventEventType() {
    return transportEventEventType;
  }

  public void getTransportEventEventType(EventTypeEnum transportEventEventType) {
    this.transportEventEventType = transportEventEventType;
  }

  public TransportEvent eventTypeCode(EventTypeCodeEnum eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
    return this;
  }

   /**
   * Unique identifier for Event Type Code, for transport events this is either ARRI (Arrival) or DEPA (Departure).
   * @return eventTypeCode
  **/
  @Schema(example = "ARRI", description = "Unique identifier for Event Type Code, for transport events this is either ARRI (Arrival) or DEPA (Departure).")
  public String getEventTypeCode() {
    return eventTypeCode.getValue();
  }

  public void setEventTypeCode(EventTypeCodeEnum eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
  }

  public TransportEvent delayReasonCode(String delayReasonCode) {
    this.delayReasonCode = delayReasonCode;
    return this;
  }

   /**
   * Get delayReasonCode
   * @return delayReasonCode
  **/
  @Schema(description = "")
  public String getDelayReasonCode() {
    return delayReasonCode;
  }

  public void setDelayReasonCode(String delayReasonCode) {
    this.delayReasonCode = delayReasonCode;
  }

  public TransportEvent vesselScheduleChangeRemark(String vesselScheduleChangeRemark) {
    this.vesselScheduleChangeRemark = vesselScheduleChangeRemark;
    return this;
  }

   /**
   * Get vesselScheduleChangeRemark
   * @return vesselScheduleChangeRemark
  **/
  @Schema(description = "")
  public String getVesselScheduleChangeRemark() {
    return vesselScheduleChangeRemark;
  }

  public void setVesselScheduleChangeRemark(String vesselScheduleChangeRemark) {
    this.vesselScheduleChangeRemark = vesselScheduleChangeRemark;
  }

  public TransportEvent transportCallID(UUID transportCallID) {
    this.transportCallID = transportCallID;
    return this;
  }

   /**
   * Get transportCallID
   * @return transportCallID
  **/
  @Schema(required = true, description = "")
  public UUID getTransportCallID() {
    return transportCallID;
  }

  public void setTransportCallID(UUID transportCallID) {
    this.transportCallID = transportCallID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportEvent transportEvent = (TransportEvent) o;
    return Objects.equals(this.transportEventEventType, transportEvent.transportEventEventType) &&
        Objects.equals(this.eventTypeCode, transportEvent.eventTypeCode) &&
        Objects.equals(this.delayReasonCode, transportEvent.delayReasonCode) &&
        Objects.equals(this.vesselScheduleChangeRemark, transportEvent.vesselScheduleChangeRemark) &&
        Objects.equals(this.transportCallID, transportEvent.transportCallID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportEventEventType, eventTypeCode, delayReasonCode, vesselScheduleChangeRemark, transportCallID, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transportEventEventType: ").append(toIndentedString(transportEventEventType)).append("\n");
    sb.append("    eventTypeCode: ").append(toIndentedString(eventTypeCode)).append("\n");
    sb.append("    delayReasonCode: ").append(toIndentedString(delayReasonCode)).append("\n");
    sb.append("    vesselScheduleChangeRemark: ").append(toIndentedString(vesselScheduleChangeRemark)).append("\n");
    sb.append("    transportCallID: ").append(toIndentedString(transportCallID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
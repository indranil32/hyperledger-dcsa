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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * The event entity is described as a generalization of all the specific event categories. An event always takes place in relation to a shipment and can additionally be linked to a transport or an equipment
 */
@Schema(description = "The event entity is described as a generalization of all the specific event categories. An event always takes place in relation to a shipment and can additionally be linked to a transport or an equipment")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-22T05:06:30.605Z[GMT]")
public class Event {
  @SerializedName("eventID")
  private UUID eventID = null;

  @SerializedName("eventType")
  private EventType eventType = null;

  @SerializedName("eventDateTime")
  private OffsetDateTime eventDateTime = null;

  @SerializedName("eventClassifierCode")
  private EventClassifierCode eventClassifierCode = null;

  @SerializedName("eventTypeCode")
  private String eventTypeCode = null;

  public Event eventID(UUID eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @Schema(required = true, description = "")
  public UUID getEventID() {
    return eventID;
  }

  public void setEventID(UUID eventID) {
    this.eventID = eventID;
  }

  public Event eventType(EventType eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(required = true, description = "")
  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public Event eventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

   /**
   * Get eventDateTime
   * @return eventDateTime
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  public Event eventClassifierCode(EventClassifierCode eventClassifierCode) {
    this.eventClassifierCode = eventClassifierCode;
    return this;
  }

   /**
   * Get eventClassifierCode
   * @return eventClassifierCode
  **/
  @Schema(required = true, description = "")
  public EventClassifierCode getEventClassifierCode() {
    return eventClassifierCode;
  }

  public void setEventClassifierCode(EventClassifierCode eventClassifierCode) {
    this.eventClassifierCode = eventClassifierCode;
  }

  public Event eventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
    return this;
  }

   /**
   * Get eventTypeCode
   * @return eventTypeCode
  **/
  @Schema(required = true, description = "")
  public String getEventTypeCode() {
    return eventTypeCode;
  }

  public void setEventTypeCode(String eventTypeCode) {
    this.eventTypeCode = eventTypeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventID, event.eventID) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.eventDateTime, event.eventDateTime) &&
        Objects.equals(this.eventClassifierCode, event.eventClassifierCode) &&
        Objects.equals(this.eventTypeCode, event.eventTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventID, eventType, eventDateTime, eventClassifierCode, eventTypeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    eventClassifierCode: ").append(toIndentedString(eventClassifierCode)).append("\n");
    sb.append("    eventTypeCode: ").append(toIndentedString(eventTypeCode)).append("\n");
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

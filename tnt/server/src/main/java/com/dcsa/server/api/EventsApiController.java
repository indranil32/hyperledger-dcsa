package com.dcsa.server.api;

import java.util.UUID;

import com.dcsa.tnt.common.EventTypeList;
import com.dcsa.tnt.common.Events;
import com.dcsa.tnt.common.InlineResponse200;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-22T05:06:51.764Z[GMT]")
@RestController
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> eventsEventIDGet(@Parameter(in = ParameterIn.PATH, description = "The ID of the event to receive", required=true, schema=@Schema()) @PathVariable("eventID") String eventID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"eventID\" : \"84db923d-2a19-4eb0-beb5-446c1ec57d34\",\n  \"eventType\" : \"SHIPMENT\",\n  \"eventDateTime\" : \"2019-11-12T07:41:00+08:30\",\n  \"eventClassifierCode\" : \"ACT\",\n  \"eventTypeCode\" : \"ARRI\",\n  \"shipmentID\" : \"123e4567-e89b-12d3-a456-426614174000\",\n  \"shipmentInformationTypeCode\" : \"SRM\"\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Events> eventsGet(@Parameter(in = ParameterIn.QUERY, description = "The type of event(s) to filter by." ,schema=@Schema()) @Valid @RequestParam(value = "eventType", required = false) EventTypeList eventType, @Parameter(in = ParameterIn.QUERY, description = "The identifier for a shipment, which is issued by and unique within each of the carriers." ,schema=@Schema()) @Valid @RequestParam(value = "bookingReference", required = false) String bookingReference, @Parameter(in = ParameterIn.QUERY, description = "The Transport Document ID number is an identifier that links to a shipment, i.e. a Bill of Lading or a Sea Waybill. A bill of lading is the document of title to the goods issued to the customer which confirms the carrier's receipt of the cargo from the customer, acknowledging goods being shipped and specifying the terms of delivery. The Sea Waybill is a simpler document, the main difference being that it is non-negotiable." ,schema=@Schema()) @Valid @RequestParam(value = "transportDocumentID", required = false) String transportDocumentID, @Parameter(in = ParameterIn.QUERY, description = "The unique identifier for the equipment, which should follow the BIC ISO Container Identification Number where possible." ,schema=@Schema()) @Valid @RequestParam(value = "equipmentReference", required = false) String equipmentReference, @Parameter(in = ParameterIn.QUERY, description = "ID uniquely identifying a schedule, to filter events by." ,schema=@Schema()) @Valid @RequestParam(value = "scheduleID", required = false) UUID scheduleID, @Parameter(in = ParameterIn.QUERY, description = "ID uniquely identifying a transport call, to filter events by." ,schema=@Schema()) @Valid @RequestParam(value = "transportCallID", required = false) UUID transportCallID, @Parameter(in = ParameterIn.QUERY, description = "Maximum number of items to return." ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Object limit, @Parameter(in = ParameterIn.QUERY, description = "A server generated value to specify a specific point in a collection result, used for pagination." ,schema=@Schema()) @Valid @RequestParam(value = "cursor", required = false) Object cursor) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Events>(objectMapper.readValue("[ \"\", \"\" ]", Events.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Events>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Events>(HttpStatus.NOT_IMPLEMENTED);
    }

}

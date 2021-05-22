# EventsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventIDGet**](EventsApi.md#eventsEventIDGet) | **GET** /events/{eventID} | Find events by eventID.
[**eventsGet**](EventsApi.md#eventsGet) | **GET** /events | Find events.

<a name="eventsEventIDGet"></a>
# **eventsEventIDGet**
> InlineResponse200 eventsEventIDGet(eventID)

Find events by eventID.

Returns event with the specified eventID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
String eventID = "eventID_example"; // String | The ID of the event to receive
try {
    InlineResponse200 result = apiInstance.eventsEventIDGet(eventID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsEventIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventID** | **String**| The ID of the event to receive |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventsGet"></a>
# **eventsGet**
> Events eventsGet(eventType, bookingReference, transportDocumentID, equipmentReference, scheduleID, transportCallID, limit, cursor)

Find events.

Returns all events filtered by the parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventsApi;


EventsApi apiInstance = new EventsApi();
EventTypeList eventType = new EventTypeList(); // EventTypeList | The type of event(s) to filter by.
String bookingReference = "bookingReference_example"; // String | The identifier for a shipment, which is issued by and unique within each of the carriers.
String transportDocumentID = "transportDocumentID_example"; // String | The Transport Document ID number is an identifier that links to a shipment, i.e. a Bill of Lading or a Sea Waybill. A bill of lading is the document of title to the goods issued to the customer which confirms the carrier's receipt of the cargo from the customer, acknowledging goods being shipped and specifying the terms of delivery. The Sea Waybill is a simpler document, the main difference being that it is non-negotiable.
String equipmentReference = "equipmentReference_example"; // String | The unique identifier for the equipment, which should follow the BIC ISO Container Identification Number where possible.
UUID scheduleID = new UUID(); // UUID | ID uniquely identifying a schedule, to filter events by.
UUID transportCallID = new UUID(); // UUID | ID uniquely identifying a transport call, to filter events by.
ComponentsparameterslimitParam limit = new ComponentsparameterslimitParam(); // ComponentsparameterslimitParam | Maximum number of items to return.
ComponentsparameterscursorParam cursor = new ComponentsparameterscursorParam(); // ComponentsparameterscursorParam | A server generated value to specify a specific point in a collection result, used for pagination.
try {
    Events result = apiInstance.eventsGet(eventType, bookingReference, transportDocumentID, equipmentReference, scheduleID, transportCallID, limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#eventsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | [**EventTypeList**](.md)| The type of event(s) to filter by. | [optional]
 **bookingReference** | [**String**](.md)| The identifier for a shipment, which is issued by and unique within each of the carriers. | [optional]
 **transportDocumentID** | [**String**](.md)| The Transport Document ID number is an identifier that links to a shipment, i.e. a Bill of Lading or a Sea Waybill. A bill of lading is the document of title to the goods issued to the customer which confirms the carrier&#x27;s receipt of the cargo from the customer, acknowledging goods being shipped and specifying the terms of delivery. The Sea Waybill is a simpler document, the main difference being that it is non-negotiable. | [optional]
 **equipmentReference** | [**String**](.md)| The unique identifier for the equipment, which should follow the BIC ISO Container Identification Number where possible. | [optional]
 **scheduleID** | [**UUID**](.md)| ID uniquely identifying a schedule, to filter events by. | [optional]
 **transportCallID** | [**UUID**](.md)| ID uniquely identifying a transport call, to filter events by. | [optional]
 **limit** | [**ComponentsparameterslimitParam**](.md)| Maximum number of items to return. | [optional]
 **cursor** | [**ComponentsparameterscursorParam**](.md)| A server generated value to specify a specific point in a collection result, used for pagination. | [optional]

### Return type

[**Events**](Events.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


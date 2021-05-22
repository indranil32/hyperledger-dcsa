# swagger-java-client

DCSA OpenAPI specification for Track &amp; Trace
- API version: 2.0.1
  - Build date: 2021-05-22T05:06:30.605Z[GMT]

API specification issued by DCSA.org

  For more information, please visit [https://dcsa.org](https://dcsa.org)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.dcsa.smartcontract.tnt.ApiException;import com.dcsa.smartcontract.tnt.model.EventTypeList;import com.dcsa.smartcontract.tnt.model.Events;import com.dcsa.smartcontract.tnt.model.InlineResponse200;import io.swagger.client.*;
import com.dcsa.smartcontract.tnt.api.EventsApi;

import java.util.*;

public class EventsApiExample {

    public static void main(String[] args) {
        
        EventsApi apiInstance = new EventsApi();
        String eventID = "eventID_example"; // String | The ID of the event to receive
        try {
            InlineResponse200 result = apiInstance.eventsEventIDGet(eventID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#eventsEventIDGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EventsApi;

import java.io.File;
import java.util.*;

public class EventsApiExample {

    public static void main(String[] args) {
        
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**eventsEventIDGet**](docs/EventsApi.md#eventsEventIDGet) | **GET** /events/{eventID} | Find events by eventID.
*EventsApi* | [**eventsGet**](docs/EventsApi.md#eventsGet) | **GET** /events | Find events.
*SubscriptionsApi* | [**eventSubscriptionsGet**](docs/SubscriptionsApi.md#eventSubscriptionsGet) | **GET** /event-subscriptions | Receive a list of your active event subscriptions
*SubscriptionsApi* | [**eventSubscriptionsPost**](docs/SubscriptionsApi.md#eventSubscriptionsPost) | **POST** /event-subscriptions | Create an event subscription
*SubscriptionsApi* | [**eventSubscriptionsSubscriptionIDDelete**](docs/SubscriptionsApi.md#eventSubscriptionsSubscriptionIDDelete) | **DELETE** /event-subscriptions/{subscriptionID} | Stop an event subscription, using the subscription ID
*SubscriptionsApi* | [**eventSubscriptionsSubscriptionIDGet**](docs/SubscriptionsApi.md#eventSubscriptionsSubscriptionIDGet) | **GET** /event-subscriptions/{subscriptionID} | Find event subscription by subscription ID
*SubscriptionsApi* | [**eventSubscriptionsSubscriptionIDPut**](docs/SubscriptionsApi.md#eventSubscriptionsSubscriptionIDPut) | **PUT** /event-subscriptions/{subscriptionID} | Alter an event subscription

## Documentation for Models

 - [AnyOfeventsItems](docs/AnyOfeventsItems.md)
 - [EmptyIndicatorCode](docs/EmptyIndicatorCode.md)
 - [EquipmentEvent](docs/EquipmentEvent.md)
 - [Error](docs/Error.md)
 - [Errors](docs/Errors.md)
 - [ErrorsInner](docs/ErrorsInner.md)
 - [Event](docs/Event.md)
 - [EventClassifierCode](docs/EventClassifierCode.md)
 - [EventSubscription](docs/EventSubscription.md)
 - [EventSubscriptionBody](docs/EventSubscriptionBody.md)
 - [EventType](docs/EventType.md)
 - [EventTypeList](docs/EventTypeList.md)
 - [Events](docs/Events.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [OneOfinlineResponse200](docs/OneOfinlineResponse200.md)
 - [ShipmentEvent](docs/ShipmentEvent.md)
 - [ShipmentInformationTypeCode](docs/ShipmentInformationTypeCode.md)
 - [SubscriptionID](docs/SubscriptionID.md)
 - [TransportDocumentType](docs/TransportDocumentType.md)
 - [TransportEvent](docs/TransportEvent.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@dcsa.org
# SubscriptionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventSubscriptionsGet**](SubscriptionsApi.md#eventSubscriptionsGet) | **GET** /event-subscriptions | Receive a list of your active event subscriptions
[**eventSubscriptionsPost**](SubscriptionsApi.md#eventSubscriptionsPost) | **POST** /event-subscriptions | Create an event subscription
[**eventSubscriptionsSubscriptionIDDelete**](SubscriptionsApi.md#eventSubscriptionsSubscriptionIDDelete) | **DELETE** /event-subscriptions/{subscriptionID} | Stop an event subscription, using the subscription ID
[**eventSubscriptionsSubscriptionIDGet**](SubscriptionsApi.md#eventSubscriptionsSubscriptionIDGet) | **GET** /event-subscriptions/{subscriptionID} | Find event subscription by subscription ID
[**eventSubscriptionsSubscriptionIDPut**](SubscriptionsApi.md#eventSubscriptionsSubscriptionIDPut) | **PUT** /event-subscriptions/{subscriptionID} | Alter an event subscription

<a name="eventSubscriptionsGet"></a>
# **eventSubscriptionsGet**
> List&lt;EventSubscription&gt; eventSubscriptionsGet()

Receive a list of your active event subscriptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    List<EventSubscription> result = apiInstance.eventSubscriptionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#eventSubscriptionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventSubscription&gt;**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventSubscriptionsPost"></a>
# **eventSubscriptionsPost**
> EventSubscription eventSubscriptionsPost(body)

Create an event subscription

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
EventSubscriptionBody body = new EventSubscriptionBody(); // EventSubscriptionBody | Parameters used to configure the subscription
try {
    EventSubscription result = apiInstance.eventSubscriptionsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#eventSubscriptionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventSubscriptionBody**](EventSubscriptionBody.md)| Parameters used to configure the subscription |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventSubscriptionsSubscriptionIDDelete"></a>
# **eventSubscriptionsSubscriptionIDDelete**
> eventSubscriptionsSubscriptionIDDelete(subscriptionID)

Stop an event subscription, using the subscription ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
ComponentsparameterssubscriptionIDPathParam subscriptionID = new ComponentsparameterssubscriptionIDPathParam(); // ComponentsparameterssubscriptionIDPathParam | 
try {
    apiInstance.eventSubscriptionsSubscriptionIDDelete(subscriptionID);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#eventSubscriptionsSubscriptionIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionID** | [**ComponentsparameterssubscriptionIDPathParam**](.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventSubscriptionsSubscriptionIDGet"></a>
# **eventSubscriptionsSubscriptionIDGet**
> EventSubscription eventSubscriptionsSubscriptionIDGet(subscriptionID)

Find event subscription by subscription ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
ComponentsparameterssubscriptionIDPathParam subscriptionID = new ComponentsparameterssubscriptionIDPathParam(); // ComponentsparameterssubscriptionIDPathParam | The universal unique ID of the subscription to receive.
try {
    EventSubscription result = apiInstance.eventSubscriptionsSubscriptionIDGet(subscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#eventSubscriptionsSubscriptionIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionID** | [**ComponentsparameterssubscriptionIDPathParam**](.md)| The universal unique ID of the subscription to receive. |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventSubscriptionsSubscriptionIDPut"></a>
# **eventSubscriptionsSubscriptionIDPut**
> EventSubscription eventSubscriptionsSubscriptionIDPut(body, subscriptionID)

Alter an event subscription

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
EventSubscription body = new EventSubscription(); // EventSubscription | Parameters used to configure the subscription
ComponentsparameterssubscriptionIDPathParam subscriptionID = new ComponentsparameterssubscriptionIDPathParam(); // ComponentsparameterssubscriptionIDPathParam | 
try {
    EventSubscription result = apiInstance.eventSubscriptionsSubscriptionIDPut(body, subscriptionID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#eventSubscriptionsSubscriptionIDPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventSubscription**](EventSubscription.md)| Parameters used to configure the subscription |
 **subscriptionID** | [**ComponentsparameterssubscriptionIDPathParam**](.md)|  |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# TransportEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transportEventEventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**eventTypeCode** | [**EventTypeCodeEnum**](#EventTypeCodeEnum) | Unique identifier for Event Type Code, for transport events this is either ARRI (Arrival) or DEPA (Departure). |  [optional]
**delayReasonCode** | **String** |  |  [optional]
**vesselScheduleChangeRemark** | **String** |  |  [optional]
**transportCallID** | [**UUID**](UUID.md) |  | 

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
TRANSPORT | &quot;TRANSPORT&quot;

<a name="EventTypeCodeEnum"></a>
## Enum: EventTypeCodeEnum
Name | Value
---- | -----
ARRI | &quot;ARRI&quot;
DEPA | &quot;DEPA&quot;

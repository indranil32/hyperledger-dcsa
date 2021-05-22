# ShipmentEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipmentEventEventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**eventTypeCode** | [**EventTypeCodeEnum**](#EventTypeCodeEnum) | Unique identifier for Event Type Code. For shipment events this can be: - RECE (Received) - CONF (Confirmed) - ISSU (Issued) - APPR (Approved) - SUBM (Submitted) - SURR (Surrendered) - REJE (Rejected) - PENA (Pending approval)  |  [optional]
**shipmentInformationTypeCode** | [**ShipmentInformationTypeCode**](ShipmentInformationTypeCode.md) |  | 
**shipmentID** | [**UUID**](UUID.md) |  |  [optional]

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
SHIPMENT | &quot;SHIPMENT&quot;

<a name="EventTypeCodeEnum"></a>
## Enum: EventTypeCodeEnum
Name | Value
---- | -----
RECE | &quot;RECE&quot;
CONF | &quot;CONF&quot;
ISSU | &quot;ISSU&quot;
APPR | &quot;APPR&quot;
SUBM | &quot;SUBM&quot;
SURR | &quot;SURR&quot;
REJE | &quot;REJE&quot;
PENA | &quot;PENA&quot;

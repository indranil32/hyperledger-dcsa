# EquipmentEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**equipmentEventEventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**eventTypeCode** | [**EventTypeCodeEnum**](#EventTypeCodeEnum) | Unique identifier for Event Type Code. For equipment events this can be: - LOAD (Load) - DISC (Discharge) - GTIN (Gate in) - GTOT (Gate out) - STUF (Stuffing) - STRP (Stripping)  |  [optional]
**equipmentReference** | **String** |  |  [optional]
**emptyIndicatorCode** | [**EmptyIndicatorCode**](EmptyIndicatorCode.md) |  | 
**transportCallID** | [**UUID**](UUID.md) |  | 

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
EQUIPMENT | &quot;EQUIPMENT&quot;

<a name="EventTypeCodeEnum"></a>
## Enum: EventTypeCodeEnum
Name | Value
---- | -----
LOAD | &quot;LOAD&quot;
DISC | &quot;DISC&quot;
GTIN | &quot;GTIN&quot;
GTOT | &quot;GTOT&quot;
STUF | &quot;STUF&quot;
STRP | &quot;STRP&quot;

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

package com.dcsa.smartcontract.tnt.auth;

import com.dcsa.smartcontract.tnt.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
public class CheckNameAvailabilityParameters {
    /**
     * The name of the service instance to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The fully qualified resource type which includes provider namespace.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the name of the service instance to check.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the service instance to check.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the fully qualified resource type which includes provider namespace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the fully qualified resource type which includes provider namespace.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

}

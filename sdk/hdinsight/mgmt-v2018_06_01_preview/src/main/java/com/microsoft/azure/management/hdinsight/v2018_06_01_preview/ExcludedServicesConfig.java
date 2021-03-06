/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration that services will be excluded when creating cluster.
 */
public class ExcludedServicesConfig {
    /**
     * The config id of excluded services.
     */
    @JsonProperty(value = "excludedServicesConfigId")
    private String excludedServicesConfigId;

    /**
     * The list of excluded services.
     */
    @JsonProperty(value = "excludedServicesList")
    private String excludedServicesList;

    /**
     * Get the config id of excluded services.
     *
     * @return the excludedServicesConfigId value
     */
    public String excludedServicesConfigId() {
        return this.excludedServicesConfigId;
    }

    /**
     * Set the config id of excluded services.
     *
     * @param excludedServicesConfigId the excludedServicesConfigId value to set
     * @return the ExcludedServicesConfig object itself.
     */
    public ExcludedServicesConfig withExcludedServicesConfigId(String excludedServicesConfigId) {
        this.excludedServicesConfigId = excludedServicesConfigId;
        return this;
    }

    /**
     * Get the list of excluded services.
     *
     * @return the excludedServicesList value
     */
    public String excludedServicesList() {
        return this.excludedServicesList;
    }

    /**
     * Set the list of excluded services.
     *
     * @param excludedServicesList the excludedServicesList value to set
     * @return the ExcludedServicesConfig object itself.
     */
    public ExcludedServicesConfig withExcludedServicesList(String excludedServicesList) {
        this.excludedServicesList = excludedServicesList;
        return this;
    }

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Symmetric key for authentication.
 */
public class SymmetricKey {
    /**
     * Connection string based on the symmetric key.
     */
    @JsonProperty(value = "connectionString")
    private AsymmetricEncryptedSecret connectionString;

    /**
     * Get connection string based on the symmetric key.
     *
     * @return the connectionString value
     */
    public AsymmetricEncryptedSecret connectionString() {
        return this.connectionString;
    }

    /**
     * Set connection string based on the symmetric key.
     *
     * @param connectionString the connectionString value to set
     * @return the SymmetricKey object itself.
     */
    public SymmetricKey withConnectionString(AsymmetricEncryptedSecret connectionString) {
        this.connectionString = connectionString;
        return this;
    }

}

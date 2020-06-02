// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry.client.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.util.UUID;

/** The GetSchemaByIdHeaders model. */
@Fluent
public final class GetSchemaByIdHeaders {
    /*
     * The X-Schema-Version property.
     */
    @JsonProperty(value = "X-Schema-Version")
    private Integer xSchemaVersion;

    /*
     * The X-Schema-Type property.
     */
    @JsonProperty(value = "X-Schema-Type")
    private String xSchemaType;

    /*
     * The X-Schema-Id property.
     */
    @JsonProperty(value = "X-Schema-Id")
    private UUID xSchemaId;

    /*
     * The X-Schema-Id-Location property.
     */
    @JsonProperty(value = "X-Schema-Id-Location")
    private URL xSchemaIdLocation;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the xSchemaVersion property: The X-Schema-Version property.
     *
     * @return the xSchemaVersion value.
     */
    public Integer getXSchemaVersion() {
        return this.xSchemaVersion;
    }

    /**
     * Set the xSchemaVersion property: The X-Schema-Version property.
     *
     * @param xSchemaVersion the xSchemaVersion value to set.
     * @return the GetSchemaByIdHeaders object itself.
     */
    public GetSchemaByIdHeaders setXSchemaVersion(Integer xSchemaVersion) {
        this.xSchemaVersion = xSchemaVersion;
        return this;
    }

    /**
     * Get the xSchemaType property: The X-Schema-Type property.
     *
     * @return the xSchemaType value.
     */
    public String getXSchemaType() {
        return this.xSchemaType;
    }

    /**
     * Set the xSchemaType property: The X-Schema-Type property.
     *
     * @param xSchemaType the xSchemaType value to set.
     * @return the GetSchemaByIdHeaders object itself.
     */
    public GetSchemaByIdHeaders setXSchemaType(String xSchemaType) {
        this.xSchemaType = xSchemaType;
        return this;
    }

    /**
     * Get the xSchemaId property: The X-Schema-Id property.
     *
     * @return the xSchemaId value.
     */
    public UUID getXSchemaId() {
        return this.xSchemaId;
    }

    /**
     * Set the xSchemaId property: The X-Schema-Id property.
     *
     * @param xSchemaId the xSchemaId value to set.
     * @return the GetSchemaByIdHeaders object itself.
     */
    public GetSchemaByIdHeaders setXSchemaId(UUID xSchemaId) {
        this.xSchemaId = xSchemaId;
        return this;
    }

    /**
     * Get the xSchemaIdLocation property: The X-Schema-Id-Location property.
     *
     * @return the xSchemaIdLocation value.
     */
    public URL getXSchemaIdLocation() {
        return this.xSchemaIdLocation;
    }

    /**
     * Set the xSchemaIdLocation property: The X-Schema-Id-Location property.
     *
     * @param xSchemaIdLocation the xSchemaIdLocation value to set.
     * @return the GetSchemaByIdHeaders object itself.
     */
    public GetSchemaByIdHeaders setXSchemaIdLocation(URL xSchemaIdLocation) {
        this.xSchemaIdLocation = xSchemaIdLocation;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the GetSchemaByIdHeaders object itself.
     */
    public GetSchemaByIdHeaders setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() { }
}
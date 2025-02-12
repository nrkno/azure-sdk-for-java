// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that represents the operation. */
@Fluent
public final class ApiOperationDisplay {
    /*
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Service provider: Microsoft.StorageCache
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed: Cache, etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The description of the operation
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of ApiOperationDisplay class. */
    public ApiOperationDisplay() {
    }

    /**
     * Get the operation property: Operation type: Read, write, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the provider property: Service provider: Microsoft.StorageCache.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider: Microsoft.StorageCache.
     *
     * @param provider the provider value to set.
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed: Cache, etc.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed: Cache, etc.
     *
     * @param resource the resource value to set.
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the description property: The description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the operation.
     *
     * @param description the description value to set.
     * @return the ApiOperationDisplay object itself.
     */
    public ApiOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

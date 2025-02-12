// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Validate messages of the configuration service git repositories. */
@Fluent
public final class ValidationMessages {
    /*
     * The name of the configuration service git repository.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Detailed validation messages.
     */
    @JsonProperty(value = "messages")
    private List<String> messages;

    /**
     * Get the name property: The name of the configuration service git repository.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the configuration service git repository.
     *
     * @param name the name value to set.
     * @return the ValidationMessages object itself.
     */
    public ValidationMessages withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the messages property: Detailed validation messages.
     *
     * @return the messages value.
     */
    public List<String> messages() {
        return this.messages;
    }

    /**
     * Set the messages property: Detailed validation messages.
     *
     * @param messages the messages value to set.
     * @return the ValidationMessages object itself.
     */
    public ValidationMessages withMessages(List<String> messages) {
        this.messages = messages;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkFeatures resource specific properties. */
@Immutable
public final class NetworkFeaturesProperties {
    /*
     * The Virtual Network name.
     */
    @JsonProperty(value = "virtualNetworkName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualNetworkName;

    /*
     * The Virtual Network summary view.
     */
    @JsonProperty(value = "virtualNetworkConnection", access = JsonProperty.Access.WRITE_ONLY)
    private VnetInfo virtualNetworkConnection;

    /*
     * The Hybrid Connections summary view.
     */
    @JsonProperty(value = "hybridConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<RelayServiceConnectionEntityInner> hybridConnections;

    /*
     * The Hybrid Connection V2 (Service Bus) view.
     */
    @JsonProperty(value = "hybridConnectionsV2", access = JsonProperty.Access.WRITE_ONLY)
    private List<HybridConnectionInner> hybridConnectionsV2;

    /** Creates an instance of NetworkFeaturesProperties class. */
    public NetworkFeaturesProperties() {
    }

    /**
     * Get the virtualNetworkName property: The Virtual Network name.
     *
     * @return the virtualNetworkName value.
     */
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * Get the virtualNetworkConnection property: The Virtual Network summary view.
     *
     * @return the virtualNetworkConnection value.
     */
    public VnetInfo virtualNetworkConnection() {
        return this.virtualNetworkConnection;
    }

    /**
     * Get the hybridConnections property: The Hybrid Connections summary view.
     *
     * @return the hybridConnections value.
     */
    public List<RelayServiceConnectionEntityInner> hybridConnections() {
        return this.hybridConnections;
    }

    /**
     * Get the hybridConnectionsV2 property: The Hybrid Connection V2 (Service Bus) view.
     *
     * @return the hybridConnectionsV2 value.
     */
    public List<HybridConnectionInner> hybridConnectionsV2() {
        return this.hybridConnectionsV2;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkConnection() != null) {
            virtualNetworkConnection().validate();
        }
        if (hybridConnections() != null) {
            hybridConnections().forEach(e -> e.validate());
        }
        if (hybridConnectionsV2() != null) {
            hybridConnectionsV2().forEach(e -> e.validate());
        }
    }
}

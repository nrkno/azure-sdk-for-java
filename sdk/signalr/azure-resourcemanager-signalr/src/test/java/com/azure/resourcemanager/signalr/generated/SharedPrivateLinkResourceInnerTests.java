// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceInner;
import org.junit.jupiter.api.Assertions;

public final class SharedPrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedPrivateLinkResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"ofmxagkvtmelmqkr\",\"privateLinkResourceId\":\"ahvljuaha\",\"provisioningState\":\"Creating\",\"requestMessage\":\"dhmdua\",\"status\":\"Disconnected\"},\"id\":\"xqpvfadmw\",\"name\":\"rcrgvx\",\"type\":\"vgomz\"}")
                .toObject(SharedPrivateLinkResourceInner.class);
        Assertions.assertEquals("ofmxagkvtmelmqkr", model.groupId());
        Assertions.assertEquals("ahvljuaha", model.privateLinkResourceId());
        Assertions.assertEquals("dhmdua", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedPrivateLinkResourceInner model =
            new SharedPrivateLinkResourceInner()
                .withGroupId("ofmxagkvtmelmqkr")
                .withPrivateLinkResourceId("ahvljuaha")
                .withRequestMessage("dhmdua");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceInner.class);
        Assertions.assertEquals("ofmxagkvtmelmqkr", model.groupId());
        Assertions.assertEquals("ahvljuaha", model.privateLinkResourceId());
        Assertions.assertEquals("dhmdua", model.requestMessage());
    }
}

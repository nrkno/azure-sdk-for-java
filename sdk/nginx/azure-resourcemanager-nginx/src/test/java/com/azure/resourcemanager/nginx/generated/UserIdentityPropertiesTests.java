// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.UserIdentityProperties;
import org.junit.jupiter.api.Test;

public final class UserIdentityPropertiesTests {
    @Test
    public void testDeserialize() {
        UserIdentityProperties model =
            BinaryData
                .fromString("{\"principalId\":\"wrlyxwjkcprb\",\"clientId\":\"b\"}")
                .toObject(UserIdentityProperties.class);
    }

    @Test
    public void testSerialize() {
        UserIdentityProperties model = new UserIdentityProperties();
        model = BinaryData.fromObject(model).toObject(UserIdentityProperties.class);
    }
}

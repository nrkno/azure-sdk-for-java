// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabricFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ServiceFabricFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceFabricFragment model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"jeokbzefezrxccz\":\"vkzqk\",\"pqxbkwvzgnzvdf\":\"rtle\",\"mqpnoda\":\"zdix\",\"sbostzel\":\"opqhewjptmc\"}}")
                .toObject(ServiceFabricFragment.class);
        Assertions.assertEquals("vkzqk", model.tags().get("jeokbzefezrxccz"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceFabricFragment model =
            new ServiceFabricFragment()
                .withTags(
                    mapOf(
                        "jeokbzefezrxccz",
                        "vkzqk",
                        "pqxbkwvzgnzvdf",
                        "rtle",
                        "mqpnoda",
                        "zdix",
                        "sbostzel",
                        "opqhewjptmc"));
        model = BinaryData.fromObject(model).toObject(ServiceFabricFragment.class);
        Assertions.assertEquals("vkzqk", model.tags().get("jeokbzefezrxccz"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

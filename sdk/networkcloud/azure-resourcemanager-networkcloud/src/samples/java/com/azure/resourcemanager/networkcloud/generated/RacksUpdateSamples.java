// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.Rack;
import java.util.HashMap;
import java.util.Map;

/** Samples for Racks Update. */
public final class RacksUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/Racks_Patch.json
     */
    /**
     * Sample code: Patch rack.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void patchRack(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        Rack resource =
            manager
                .racks()
                .getByResourceGroupWithResponse("resourceGroupName", "rackName", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withRackLocation("Rack 2B")
            .withRackSerialNumber("RACK_SERIAL_NUMBER")
            .apply();
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

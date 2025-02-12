// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.Identity;
import com.azure.resourcemanager.hybridcompute.models.LocationData;
import com.azure.resourcemanager.hybridcompute.models.MachineUpdate;
import com.azure.resourcemanager.hybridcompute.models.MachineUpdateProperties;
import com.azure.resourcemanager.hybridcompute.models.ResourceIdentityType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineUpdate model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"lbbovplw\",\"tenantId\":\"hvgyuguosvmk\",\"type\":\"SystemAssigned\"},\"properties\":{\"locationData\":{\"name\":\"ukkfplgmgs\",\"city\":\"kjz\",\"district\":\"es\",\"countryOrRegion\":\"vlopwiyighx\"},\"parentClusterResourceId\":\"dwzbaiue\",\"privateLinkScopeResourceId\":\"a\"},\"tags\":{\"mtxpsiebtfh\":\"yqupedeojnabckh\",\"htldwk\":\"pesapskrdqmhjj\",\"otogtwrupqs\":\"zxuutkncwscwsvl\",\"cykvceo\":\"vnm\"}}")
                .toObject(MachineUpdate.class);
        Assertions.assertEquals("yqupedeojnabckh", model.tags().get("mtxpsiebtfh"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ukkfplgmgs", model.properties().locationData().name());
        Assertions.assertEquals("kjz", model.properties().locationData().city());
        Assertions.assertEquals("es", model.properties().locationData().district());
        Assertions.assertEquals("vlopwiyighx", model.properties().locationData().countryOrRegion());
        Assertions.assertEquals("dwzbaiue", model.properties().parentClusterResourceId());
        Assertions.assertEquals("a", model.properties().privateLinkScopeResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineUpdate model =
            new MachineUpdate()
                .withTags(
                    mapOf(
                        "mtxpsiebtfh",
                        "yqupedeojnabckh",
                        "htldwk",
                        "pesapskrdqmhjj",
                        "otogtwrupqs",
                        "zxuutkncwscwsvl",
                        "cykvceo",
                        "vnm"))
                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withProperties(
                    new MachineUpdateProperties()
                        .withLocationData(
                            new LocationData()
                                .withName("ukkfplgmgs")
                                .withCity("kjz")
                                .withDistrict("es")
                                .withCountryOrRegion("vlopwiyighx"))
                        .withParentClusterResourceId("dwzbaiue")
                        .withPrivateLinkScopeResourceId("a"));
        model = BinaryData.fromObject(model).toObject(MachineUpdate.class);
        Assertions.assertEquals("yqupedeojnabckh", model.tags().get("mtxpsiebtfh"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ukkfplgmgs", model.properties().locationData().name());
        Assertions.assertEquals("kjz", model.properties().locationData().city());
        Assertions.assertEquals("es", model.properties().locationData().district());
        Assertions.assertEquals("vlopwiyighx", model.properties().locationData().countryOrRegion());
        Assertions.assertEquals("dwzbaiue", model.properties().parentClusterResourceId());
        Assertions.assertEquals("a", model.properties().privateLinkScopeResourceId());
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

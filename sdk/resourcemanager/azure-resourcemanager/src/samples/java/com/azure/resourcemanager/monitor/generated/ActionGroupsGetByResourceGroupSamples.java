// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for ActionGroups GetByResourceGroup. */
public final class ActionGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-06-01/examples/getActionGroup.json
     */
    /**
     * Sample code: Get an action group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnActionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getActionGroups()
            .getByResourceGroupWithResponse("Default-NotificationRules", "SampleActionGroup", Context.NONE);
    }
}

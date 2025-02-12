// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of KubernetesCluster. */
public interface KubernetesCluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the aadConfiguration property: AadConfiguration represents the Azure Active Directory Integration
     * properties.
     *
     * <p>The Azure Active Directory Integration properties.
     *
     * @return the aadConfiguration value.
     */
    AadConfiguration aadConfiguration();

    /**
     * Gets the administratorConfiguration property: AdministratorConfiguration represents the administrative
     * credentials that will be applied to the control plane and agent pool nodes in Kubernetes clusters.
     *
     * <p>The administrative credentials that will be applied to the control plane and agent pool nodes that do not
     * specify their own values.
     *
     * @return the administratorConfiguration value.
     */
    AdministratorConfiguration administratorConfiguration();

    /**
     * Gets the attachedNetworkIds property: The full list of network resource IDs that are attached to this cluster,
     * including those attached only to specific agent pools.
     *
     * @return the attachedNetworkIds value.
     */
    List<String> attachedNetworkIds();

    /**
     * Gets the availableUpgrades property: The list of versions that this Kubernetes cluster can be upgraded to.
     *
     * @return the availableUpgrades value.
     */
    List<AvailableUpgrade> availableUpgrades();

    /**
     * Gets the clusterId property: The resource ID of the Network Cloud cluster.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the connectedClusterId property: The resource ID of the connected cluster set up when this Kubernetes
     * cluster is created.
     *
     * @return the connectedClusterId value.
     */
    String connectedClusterId();

    /**
     * Gets the controlPlaneKubernetesVersion property: The current running version of Kubernetes on the control plane.
     *
     * @return the controlPlaneKubernetesVersion value.
     */
    String controlPlaneKubernetesVersion();

    /**
     * Gets the controlPlaneNodeConfiguration property: ControlPlaneNodeConfiguration represents the selection of
     * virtual machines and size of the control plane for a Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane for this Kubernetes Cluster.
     *
     * @return the controlPlaneNodeConfiguration value.
     */
    ControlPlaneNodeConfiguration controlPlaneNodeConfiguration();

    /**
     * Gets the detailedStatus property: The current status of the Kubernetes cluster.
     *
     * @return the detailedStatus value.
     */
    KubernetesClusterDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the featureStatuses property: The current feature settings.
     *
     * @return the featureStatuses value.
     */
    List<FeatureStatus> featureStatuses();

    /**
     * Gets the initialAgentPoolConfigurations property: The agent pools that are created with this Kubernetes cluster
     * for running critical system services and workloads. This data in this field is only used during creation, and the
     * field will be empty following the creation of the Kubernetes Cluster. After creation, the management of agent
     * pools is done using the agentPools sub-resource.
     *
     * @return the initialAgentPoolConfigurations value.
     */
    List<InitialAgentPoolConfiguration> initialAgentPoolConfigurations();

    /**
     * Gets the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @return the kubernetesVersion value.
     */
    String kubernetesVersion();

    /**
     * Gets the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents the
     * configuration of the resource group managed by Azure.
     *
     * <p>The configuration of the managed resource group associated with the resource.
     *
     * @return the managedResourceGroupConfiguration value.
     */
    ManagedResourceGroupConfiguration managedResourceGroupConfiguration();

    /**
     * Gets the networkConfiguration property: NetworkConfiguration specifies the Kubernetes cluster network related
     * configuration.
     *
     * <p>The configuration of the Kubernetes cluster networking, including the attachment of networks that span the
     * cluster.
     *
     * @return the networkConfiguration value.
     */
    NetworkConfiguration networkConfiguration();

    /**
     * Gets the nodes property: The details of the nodes in this cluster.
     *
     * @return the nodes value.
     */
    List<KubernetesClusterNode> nodes();

    /**
     * Gets the provisioningState property: The provisioning state of the Kubernetes cluster resource.
     *
     * @return the provisioningState value.
     */
    KubernetesClusterProvisioningState provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterInner object.
     *
     * @return the inner object.
     */
    KubernetesClusterInner innerModel();

    /** The entirety of the KubernetesCluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithExtendedLocation,
            DefinitionStages.WithControlPlaneNodeConfiguration,
            DefinitionStages.WithInitialAgentPoolConfigurations,
            DefinitionStages.WithKubernetesVersion,
            DefinitionStages.WithNetworkConfiguration,
            DefinitionStages.WithCreate {
    }
    /** The KubernetesCluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the KubernetesCluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the KubernetesCluster definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the KubernetesCluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the KubernetesCluster definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: ExtendedLocation represents the Azure custom location where the
             * resource will be created.
             *
             * <p>The extended location of the cluster associated with the resource..
             *
             * @param extendedLocation ExtendedLocation represents the Azure custom location where the resource will be
             *     created.
             *     <p>The extended location of the cluster associated with the resource.
             * @return the next definition stage.
             */
            WithControlPlaneNodeConfiguration withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the KubernetesCluster definition allowing to specify controlPlaneNodeConfiguration. */
        interface WithControlPlaneNodeConfiguration {
            /**
             * Specifies the controlPlaneNodeConfiguration property: ControlPlaneNodeConfiguration represents the
             * selection of virtual machines and size of the control plane for a Kubernetes cluster.
             *
             * <p>The defining characteristics of the control plane for this Kubernetes Cluster..
             *
             * @param controlPlaneNodeConfiguration ControlPlaneNodeConfiguration represents the selection of virtual
             *     machines and size of the control plane for a Kubernetes cluster.
             *     <p>The defining characteristics of the control plane for this Kubernetes Cluster.
             * @return the next definition stage.
             */
            WithInitialAgentPoolConfigurations withControlPlaneNodeConfiguration(
                ControlPlaneNodeConfiguration controlPlaneNodeConfiguration);
        }
        /** The stage of the KubernetesCluster definition allowing to specify initialAgentPoolConfigurations. */
        interface WithInitialAgentPoolConfigurations {
            /**
             * Specifies the initialAgentPoolConfigurations property: The agent pools that are created with this
             * Kubernetes cluster for running critical system services and workloads. This data in this field is only
             * used during creation, and the field will be empty following the creation of the Kubernetes Cluster. After
             * creation, the management of agent pools is done using the agentPools sub-resource..
             *
             * @param initialAgentPoolConfigurations The agent pools that are created with this Kubernetes cluster for
             *     running critical system services and workloads. This data in this field is only used during creation,
             *     and the field will be empty following the creation of the Kubernetes Cluster. After creation, the
             *     management of agent pools is done using the agentPools sub-resource.
             * @return the next definition stage.
             */
            WithKubernetesVersion withInitialAgentPoolConfigurations(
                List<InitialAgentPoolConfiguration> initialAgentPoolConfigurations);
        }
        /** The stage of the KubernetesCluster definition allowing to specify kubernetesVersion. */
        interface WithKubernetesVersion {
            /**
             * Specifies the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n,
             * and n.n.n-n format. The interpreted version used will be resolved into this field after creation or
             * update..
             *
             * @param kubernetesVersion The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n format.
             *     The interpreted version used will be resolved into this field after creation or update.
             * @return the next definition stage.
             */
            WithNetworkConfiguration withKubernetesVersion(String kubernetesVersion);
        }
        /** The stage of the KubernetesCluster definition allowing to specify networkConfiguration. */
        interface WithNetworkConfiguration {
            /**
             * Specifies the networkConfiguration property: NetworkConfiguration specifies the Kubernetes cluster
             * network related configuration.
             *
             * <p>The configuration of the Kubernetes cluster networking, including the attachment of networks that span
             * the cluster..
             *
             * @param networkConfiguration NetworkConfiguration specifies the Kubernetes cluster network related
             *     configuration.
             *     <p>The configuration of the Kubernetes cluster networking, including the attachment of networks that
             *     span the cluster.
             * @return the next definition stage.
             */
            WithCreate withNetworkConfiguration(NetworkConfiguration networkConfiguration);
        }
        /**
         * The stage of the KubernetesCluster definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithAadConfiguration,
                DefinitionStages.WithAdministratorConfiguration,
                DefinitionStages.WithManagedResourceGroupConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            KubernetesCluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            KubernetesCluster create(Context context);
        }
        /** The stage of the KubernetesCluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the KubernetesCluster definition allowing to specify aadConfiguration. */
        interface WithAadConfiguration {
            /**
             * Specifies the aadConfiguration property: AadConfiguration represents the Azure Active Directory
             * Integration properties.
             *
             * <p>The Azure Active Directory Integration properties..
             *
             * @param aadConfiguration AadConfiguration represents the Azure Active Directory Integration properties.
             *     <p>The Azure Active Directory Integration properties.
             * @return the next definition stage.
             */
            WithCreate withAadConfiguration(AadConfiguration aadConfiguration);
        }
        /** The stage of the KubernetesCluster definition allowing to specify administratorConfiguration. */
        interface WithAdministratorConfiguration {
            /**
             * Specifies the administratorConfiguration property: AdministratorConfiguration represents the
             * administrative credentials that will be applied to the control plane and agent pool nodes in Kubernetes
             * clusters.
             *
             * <p>The administrative credentials that will be applied to the control plane and agent pool nodes that do
             * not specify their own values..
             *
             * @param administratorConfiguration AdministratorConfiguration represents the administrative credentials
             *     that will be applied to the control plane and agent pool nodes in Kubernetes clusters.
             *     <p>The administrative credentials that will be applied to the control plane and agent pool nodes that
             *     do not specify their own values.
             * @return the next definition stage.
             */
            WithCreate withAdministratorConfiguration(AdministratorConfiguration administratorConfiguration);
        }
        /** The stage of the KubernetesCluster definition allowing to specify managedResourceGroupConfiguration. */
        interface WithManagedResourceGroupConfiguration {
            /**
             * Specifies the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents
             * the configuration of the resource group managed by Azure.
             *
             * <p>The configuration of the managed resource group associated with the resource..
             *
             * @param managedResourceGroupConfiguration ManagedResourceGroupConfiguration represents the configuration
             *     of the resource group managed by Azure.
             *     <p>The configuration of the managed resource group associated with the resource.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupConfiguration(
                ManagedResourceGroupConfiguration managedResourceGroupConfiguration);
        }
    }
    /**
     * Begins update for the KubernetesCluster resource.
     *
     * @return the stage of resource update.
     */
    KubernetesCluster.Update update();

    /** The template for KubernetesCluster update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithControlPlaneNodeConfiguration,
            UpdateStages.WithKubernetesVersion {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        KubernetesCluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        KubernetesCluster apply(Context context);
    }
    /** The KubernetesCluster update stages. */
    interface UpdateStages {
        /** The stage of the KubernetesCluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             *
             * @param tags The Azure resource tags that will replace the existing ones.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the KubernetesCluster update allowing to specify controlPlaneNodeConfiguration. */
        interface WithControlPlaneNodeConfiguration {
            /**
             * Specifies the controlPlaneNodeConfiguration property: ControlPlaneNodePatchConfiguration represents the
             * properties of the control plane that can be patched for this Kubernetes cluster.
             *
             * <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster..
             *
             * @param controlPlaneNodeConfiguration ControlPlaneNodePatchConfiguration represents the properties of the
             *     control plane that can be patched for this Kubernetes cluster.
             *     <p>The defining characteristics of the control plane that can be patched for this Kubernetes cluster.
             * @return the next definition stage.
             */
            Update withControlPlaneNodeConfiguration(ControlPlaneNodePatchConfiguration controlPlaneNodeConfiguration);
        }
        /** The stage of the KubernetesCluster update allowing to specify kubernetesVersion. */
        interface WithKubernetesVersion {
            /**
             * Specifies the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n,
             * and n.n.n-n format. The interpreted version used will be resolved into this field after creation or
             * update..
             *
             * @param kubernetesVersion The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n format.
             *     The interpreted version used will be resolved into this field after creation or update.
             * @return the next definition stage.
             */
            Update withKubernetesVersion(String kubernetesVersion);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    KubernetesCluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    KubernetesCluster refresh(Context context);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restartNode(KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restartNode(KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters, Context context);
}

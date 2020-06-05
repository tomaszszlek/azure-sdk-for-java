// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.ContainerServiceAgentPoolProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceCustomProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceDiagnosticsProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceLinuxProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceMasterProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceOrchestratorProfile;
import com.azure.resourcemanager.containerservice.ContainerServicePrincipalProfile;
import com.azure.resourcemanager.containerservice.ContainerServiceWindowsProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ContainerService model. */
@JsonFlatten
@Fluent
public class ContainerServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceInner.class);

    /*
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Profile for the container service orchestrator.
     */
    @JsonProperty(value = "properties.orchestratorProfile")
    private ContainerServiceOrchestratorProfile orchestratorProfile;

    /*
     * Properties to configure a custom container service cluster.
     */
    @JsonProperty(value = "properties.customProfile")
    private ContainerServiceCustomProfile customProfile;

    /*
     * Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef
     * need to be specified.
     */
    @JsonProperty(value = "properties.servicePrincipalProfile")
    private ContainerServicePrincipalProfile servicePrincipalProfile;

    /*
     * Profile for the container service master.
     */
    @JsonProperty(value = "properties.masterProfile")
    private ContainerServiceMasterProfile masterProfile;

    /*
     * Properties of the agent pool.
     */
    @JsonProperty(value = "properties.agentPoolProfiles")
    private List<ContainerServiceAgentPoolProfile> agentPoolProfiles;

    /*
     * Profile for Windows VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.windowsProfile")
    private ContainerServiceWindowsProfile windowsProfile;

    /*
     * Profile for Linux VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.linuxProfile")
    private ContainerServiceLinuxProfile linuxProfile;

    /*
     * Profile for diagnostics in the container service cluster.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private ContainerServiceDiagnosticsProfile diagnosticsProfile;

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the orchestratorProfile property: Profile for the container service orchestrator.
     *
     * @return the orchestratorProfile value.
     */
    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.orchestratorProfile;
    }

    /**
     * Set the orchestratorProfile property: Profile for the container service orchestrator.
     *
     * @param orchestratorProfile the orchestratorProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        this.orchestratorProfile = orchestratorProfile;
        return this;
    }

    /**
     * Get the customProfile property: Properties to configure a custom container service cluster.
     *
     * @return the customProfile value.
     */
    public ContainerServiceCustomProfile customProfile() {
        return this.customProfile;
    }

    /**
     * Set the customProfile property: Properties to configure a custom container service cluster.
     *
     * @param customProfile the customProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withCustomProfile(ContainerServiceCustomProfile customProfile) {
        this.customProfile = customProfile;
        return this;
    }

    /**
     * Get the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @return the servicePrincipalProfile value.
     */
    public ContainerServicePrincipalProfile servicePrincipalProfile() {
        return this.servicePrincipalProfile;
    }

    /**
     * Set the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withServicePrincipalProfile(ContainerServicePrincipalProfile servicePrincipalProfile) {
        this.servicePrincipalProfile = servicePrincipalProfile;
        return this;
    }

    /**
     * Get the masterProfile property: Profile for the container service master.
     *
     * @return the masterProfile value.
     */
    public ContainerServiceMasterProfile masterProfile() {
        return this.masterProfile;
    }

    /**
     * Set the masterProfile property: Profile for the container service master.
     *
     * @param masterProfile the masterProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        this.masterProfile = masterProfile;
        return this;
    }

    /**
     * Get the agentPoolProfiles property: Properties of the agent pool.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the agentPoolProfiles property: Properties of the agent pool.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Get the windowsProfile property: Profile for Windows VMs in the container service cluster.
     *
     * @return the windowsProfile value.
     */
    public ContainerServiceWindowsProfile windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set the windowsProfile property: Profile for Windows VMs in the container service cluster.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value.
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.linuxProfile;
    }

    /**
     * Set the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @param linuxProfile the linuxProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.linuxProfile = linuxProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Profile for diagnostics in the container service cluster.
     *
     * @return the diagnosticsProfile value.
     */
    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Profile for diagnostics in the container service cluster.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorProfile() != null) {
            orchestratorProfile().validate();
        }
        if (customProfile() != null) {
            customProfile().validate();
        }
        if (servicePrincipalProfile() != null) {
            servicePrincipalProfile().validate();
        }
        if (masterProfile() != null) {
            masterProfile().validate();
        }
        if (agentPoolProfiles() != null) {
            agentPoolProfiles().forEach(e -> e.validate());
        }
        if (windowsProfile() != null) {
            windowsProfile().validate();
        }
        if (linuxProfile() != null) {
            linuxProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
    }
}
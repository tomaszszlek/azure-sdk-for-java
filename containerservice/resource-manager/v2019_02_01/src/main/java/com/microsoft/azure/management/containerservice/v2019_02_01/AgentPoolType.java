/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_02_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AgentPoolType.
 */
public final class AgentPoolType extends ExpandableStringEnum<AgentPoolType> {
    /** Static value VirtualMachineScaleSets for AgentPoolType. */
    public static final AgentPoolType VIRTUAL_MACHINE_SCALE_SETS = fromString("VirtualMachineScaleSets");

    /** Static value AvailabilitySet for AgentPoolType. */
    public static final AgentPoolType AVAILABILITY_SET = fromString("AvailabilitySet");

    /**
     * Creates or finds a AgentPoolType from its string representation.
     * @param name a name to look for
     * @return the corresponding AgentPoolType
     */
    @JsonCreator
    public static AgentPoolType fromString(String name) {
        return fromString(name, AgentPoolType.class);
    }

    /**
     * @return known AgentPoolType values
     */
    public static Collection<AgentPoolType> values() {
        return values(AgentPoolType.class);
    }
}

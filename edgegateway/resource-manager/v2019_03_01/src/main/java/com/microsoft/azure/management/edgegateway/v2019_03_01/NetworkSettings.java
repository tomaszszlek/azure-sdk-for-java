/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.DataBoxEdgeManager;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.NetworkSettingsInner;
import java.util.List;

/**
 * Type representing NetworkSettings.
 */
public interface NetworkSettings extends HasInner<NetworkSettingsInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the networkAdapters value.
     */
    List<NetworkAdapter> networkAdapters();

    /**
     * @return the type value.
     */
    String type();

}

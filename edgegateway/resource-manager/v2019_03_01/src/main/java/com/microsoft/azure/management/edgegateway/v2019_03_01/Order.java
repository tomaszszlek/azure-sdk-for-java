/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.OrderInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.DataBoxEdgeManager;
import java.util.List;

/**
 * Type representing Order.
 */
public interface Order extends HasInner<OrderInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the contactInformation value.
     */
    ContactDetails contactInformation();

    /**
     * @return the currentStatus value.
     */
    OrderStatus currentStatus();

    /**
     * @return the deliveryTrackingInfo value.
     */
    List<TrackingInfo> deliveryTrackingInfo();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the orderHistory value.
     */
    List<OrderStatus> orderHistory();

    /**
     * @return the returnTrackingInfo value.
     */
    List<TrackingInfo> returnTrackingInfo();

    /**
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * @return the shippingAddress value.
     */
    Address shippingAddress();

    /**
     * @return the type value.
     */
    String type();

}

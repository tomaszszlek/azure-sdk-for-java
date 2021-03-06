/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.management.servicebus.v2015_08_01.TopicResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2015_08_01.TopicCreateOrUpdateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2015_08_01.MessageCountDetails;
import com.microsoft.azure.management.servicebus.v2015_08_01.EntityAvailabilityStatus;
import com.microsoft.azure.management.servicebus.v2015_08_01.EntityStatus;
import rx.functions.Func1;

class TopicResourceImpl extends CreatableUpdatableImpl<TopicResource, TopicResourceInner, TopicResourceImpl> implements TopicResource, TopicResource.Definition, TopicResource.Update {
    private final ServiceBusManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String topicName;
    private TopicCreateOrUpdateParameters createOrUpdateParameter;

    TopicResourceImpl(String name, ServiceBusManager manager) {
        super(name, new TopicResourceInner());
        this.manager = manager;
        // Set resource name
        this.topicName = name;
        //
        this.createOrUpdateParameter = new TopicCreateOrUpdateParameters();
    }

    TopicResourceImpl(TopicResourceInner inner, ServiceBusManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.topicName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.topicName = IdParsingUtils.getValueFromIdByName(inner.id(), "topics");
        //
        this.createOrUpdateParameter = new TopicCreateOrUpdateParameters();
    }

    @Override
    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TopicResource> createResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.createOrUpdateParameter)
            .map(new Func1<TopicResourceInner, TopicResourceInner>() {
               @Override
               public TopicResourceInner call(TopicResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TopicResource> updateResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.createOrUpdateParameter)
            .map(new Func1<TopicResourceInner, TopicResourceInner>() {
               @Override
               public TopicResourceInner call(TopicResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TopicResourceInner> getInnerAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.topicName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new TopicCreateOrUpdateParameters();
    }

    @Override
    public DateTime accessedAt() {
        return this.inner().accessedAt();
    }

    @Override
    public String autoDeleteOnIdle() {
        return this.inner().autoDeleteOnIdle();
    }

    @Override
    public MessageCountDetails countDetails() {
        return this.inner().countDetails();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String defaultMessageTimeToLive() {
        return this.inner().defaultMessageTimeToLive();
    }

    @Override
    public String duplicateDetectionHistoryTimeWindow() {
        return this.inner().duplicateDetectionHistoryTimeWindow();
    }

    @Override
    public Boolean enableBatchedOperations() {
        return this.inner().enableBatchedOperations();
    }

    @Override
    public Boolean enableExpress() {
        return this.inner().enableExpress();
    }

    @Override
    public Boolean enablePartitioning() {
        return this.inner().enablePartitioning();
    }

    @Override
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.inner().entityAvailabilityStatus();
    }

    @Override
    public Boolean filteringMessagesBeforePublishing() {
        return this.inner().filteringMessagesBeforePublishing();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAnonymousAccessible() {
        return this.inner().isAnonymousAccessible();
    }

    @Override
    public Boolean isExpress() {
        return this.inner().isExpress();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Long maxSizeInMegabytes() {
        return this.inner().maxSizeInMegabytes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean requiresDuplicateDetection() {
        return this.inner().requiresDuplicateDetection();
    }

    @Override
    public Long sizeInBytes() {
        return this.inner().sizeInBytes();
    }

    @Override
    public EntityStatus status() {
        return this.inner().status();
    }

    @Override
    public Integer subscriptionCount() {
        return this.inner().subscriptionCount();
    }

    @Override
    public Boolean supportOrdering() {
        return this.inner().supportOrdering();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public TopicResourceImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public TopicResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public TopicResourceImpl withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.createOrUpdateParameter.withAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    @Override
    public TopicResourceImpl withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.createOrUpdateParameter.withDefaultMessageTimeToLive(defaultMessageTimeToLive);
        return this;
    }

    @Override
    public TopicResourceImpl withDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
        this.createOrUpdateParameter.withDuplicateDetectionHistoryTimeWindow(duplicateDetectionHistoryTimeWindow);
        return this;
    }

    @Override
    public TopicResourceImpl withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.createOrUpdateParameter.withEnableBatchedOperations(enableBatchedOperations);
        return this;
    }

    @Override
    public TopicResourceImpl withEnableExpress(Boolean enableExpress) {
        this.createOrUpdateParameter.withEnableExpress(enableExpress);
        return this;
    }

    @Override
    public TopicResourceImpl withEnablePartitioning(Boolean enablePartitioning) {
        this.createOrUpdateParameter.withEnablePartitioning(enablePartitioning);
        return this;
    }

    @Override
    public TopicResourceImpl withEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.createOrUpdateParameter.withEntityAvailabilityStatus(entityAvailabilityStatus);
        return this;
    }

    @Override
    public TopicResourceImpl withFilteringMessagesBeforePublishing(Boolean filteringMessagesBeforePublishing) {
        this.createOrUpdateParameter.withFilteringMessagesBeforePublishing(filteringMessagesBeforePublishing);
        return this;
    }

    @Override
    public TopicResourceImpl withIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.createOrUpdateParameter.withIsAnonymousAccessible(isAnonymousAccessible);
        return this;
    }

    @Override
    public TopicResourceImpl withIsExpress(Boolean isExpress) {
        this.createOrUpdateParameter.withIsExpress(isExpress);
        return this;
    }

    @Override
    public TopicResourceImpl withMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.createOrUpdateParameter.withMaxSizeInMegabytes(maxSizeInMegabytes);
        return this;
    }

    @Override
    public TopicResourceImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

    @Override
    public TopicResourceImpl withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.createOrUpdateParameter.withRequiresDuplicateDetection(requiresDuplicateDetection);
        return this;
    }

    @Override
    public TopicResourceImpl withStatus(EntityStatus status) {
        this.createOrUpdateParameter.withStatus(status);
        return this;
    }

    @Override
    public TopicResourceImpl withSupportOrdering(Boolean supportOrdering) {
        this.createOrUpdateParameter.withSupportOrdering(supportOrdering);
        return this;
    }

}

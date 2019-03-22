/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01.implementation;

import com.microsoft.azure.management.storage.v2018_11_01.LegalHold;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class LegalHoldImpl extends WrapperImpl<LegalHoldInner> implements LegalHold {
    private final StorageManager manager;
    LegalHoldImpl(LegalHoldInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Boolean hasLegalHold() {
        return this.inner().hasLegalHold();
    }

    @Override
    public List<String> tags() {
        return this.inner().tags();
    }

}

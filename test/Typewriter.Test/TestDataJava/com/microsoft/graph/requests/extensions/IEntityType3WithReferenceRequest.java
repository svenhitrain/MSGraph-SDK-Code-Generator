// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity Type3With Reference Request.
 */
public interface IEntityType3WithReferenceRequest extends IHttpRequest {

    void post(final EntityType3 newEntityType3, final IJsonBackedObject payload, final ICallback<EntityType3> callback);

    EntityType3 post(final EntityType3 newEntityType3, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<EntityType3> callback);

    EntityType3 get() throws ClientException;

	void delete(final ICallback<EntityType3> callback);

	void delete() throws ClientException;

	void patch(final EntityType3 sourceEntityType3, final ICallback<EntityType3> callback);

	EntityType3 patch(final EntityType3 sourceEntityType3) throws ClientException;

    IEntityType3WithReferenceRequest select(final String value);

    IEntityType3WithReferenceRequest expand(final String value);

}
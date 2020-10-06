// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SingletonEntity2;
import com.microsoft.graph.requests.extensions.EntityType3RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Singleton Entity2Request Builder.
 */
public class SingletonEntity2RequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the SingletonEntity2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SingletonEntity2RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SingletonEntity2Request instance
     */
    public SingletonEntity2Request buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SingletonEntity2Request instance
     */
    public SingletonEntity2Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SingletonEntity2Request(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for EntityType3
     *
     * @return the EntityType3RequestBuilder instance
     */
    public EntityType3RequestBuilder testSingleNav2() {
        return new EntityType3RequestBuilder(getRequestUrlWithAdditionalSegment("testSingleNav2"), getClient(), null);
    }
}

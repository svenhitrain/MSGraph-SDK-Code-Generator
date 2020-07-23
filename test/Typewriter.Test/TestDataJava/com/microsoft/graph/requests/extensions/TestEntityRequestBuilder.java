// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITestEntityRequest;
import com.microsoft.graph.requests.extensions.TestEntityRequest;
import com.microsoft.graph.requests.extensions.ITestTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TestTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType2WithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2WithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3WithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3WithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Entity Request Builder.
 */
public class TestEntityRequestBuilder extends BaseRequestBuilder implements ITestEntityRequestBuilder {

    /**
     * The request builder for the TestEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestEntityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITestEntityRequest instance
     */
    public ITestEntityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITestEntityRequest instance
     */
    public ITestEntityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TestEntityRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for TestType
     *
     * @return the ITestTypeWithReferenceRequestBuilder instance
     */
    public ITestTypeWithReferenceRequestBuilder testNav() {
        return new TestTypeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("testNav"), getClient(), null);
    }

    /**
     * Gets the request builder for EntityType2
     *
     * @return the IEntityType2WithReferenceRequestBuilder instance
     */
    public IEntityType2WithReferenceRequestBuilder testInvalidNav() {
        return new EntityType2WithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("testInvalidNav"), getClient(), null);
    }

    /**
     * Gets the request builder for EntityType3
     *
     * @return the IEntityType3WithReferenceRequestBuilder instance
     */
    public IEntityType3WithReferenceRequestBuilder testExplicitNav() {
        return new EntityType3WithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("testExplicitNav"), getClient(), null);
    }
}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type With Reference Request.
 */
public class TestTypeWithReferenceRequest extends BaseRequest {

    /**
     * The request for the TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestTypeWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TestType.class);
    }

    public void post(final TestType newTestType, final IJsonBackedObject payload, final ICallback<? super TestType> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public TestType post(final TestType newTestType, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTestType;
        }
        return null;
    }

    public void get(final ICallback<? super TestType> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public TestType get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super TestType> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final TestType sourceTestType, final ICallback<? super TestType> callback) {
		send(HttpMethod.PATCH, callback, sourceTestType);
	}

	public TestType patch(final TestType sourceTestType) throws ClientException {
		return send(HttpMethod.PATCH, sourceTestType);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public TestTypeWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TestTypeWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public TestTypeWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TestTypeWithReferenceRequest)this;
    }
}

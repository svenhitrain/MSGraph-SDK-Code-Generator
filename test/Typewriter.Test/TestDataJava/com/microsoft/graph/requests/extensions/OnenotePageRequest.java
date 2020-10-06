// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.Recipient;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Request.
 */
public class OnenotePageRequest extends BaseRequest {
	
    /**
     * The request for the OnenotePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenotePageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenotePage.class);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @return the OnenotePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenotePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OnenotePage sourceOnenotePage, final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenotePage);
    }

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @return the updated OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenotePage patch(final OnenotePage sourceOnenotePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final byte[] newOnenotePage, final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.POST, callback, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenotePage post(final byte[] newOnenotePage) throws ClientException {
        return send(HttpMethod.POST, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OnenotePage newOnenotePage, final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.PUT, callback, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenotePage put(final OnenotePage newOnenotePage) throws ClientException {
        return send(HttpMethod.PUT, newOnenotePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public OnenotePageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OnenotePageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public OnenotePageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OnenotePageRequest)this;
     }

}


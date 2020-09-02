// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.TimeOffRequest;import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.TimeOffRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Request Collection Request.
 */
public class TimeOffRequestCollectionRequest extends BaseCollectionRequest<TimeOffRequestCollectionResponse, ITimeOffRequestCollectionPage> implements ITimeOffRequestCollectionRequest {

    /**
     * The request builder for this collection of TimeOffRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffRequestCollectionResponse.class, ITimeOffRequestCollectionPage.class);
    }

    public void get(final ICallback<ITimeOffRequestCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITimeOffRequestCollectionPage get() throws ClientException {
        final TimeOffRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TimeOffRequest newTimeOffRequest, final ICallback<TimeOffRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TimeOffRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTimeOffRequest, callback);
    }

    public TimeOffRequest post(final TimeOffRequest newTimeOffRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TimeOffRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTimeOffRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITimeOffRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TimeOffRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITimeOffRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TimeOffRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITimeOffRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TimeOffRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITimeOffRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TimeOffRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITimeOffRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITimeOffRequestCollectionRequest)this;
    }
    public ITimeOffRequestCollectionPage buildFromResponse(final TimeOffRequestCollectionResponse response) {
        final ITimeOffRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TimeOffRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TimeOffRequestCollectionPage page = new TimeOffRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

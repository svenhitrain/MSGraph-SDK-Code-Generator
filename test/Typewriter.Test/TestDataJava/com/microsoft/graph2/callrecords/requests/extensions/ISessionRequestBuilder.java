// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.requests.extensions.ISegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISegmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Session Request Builder.
 */
public interface ISessionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISessionRequest instance
     */
    ISessionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISessionRequest instance
     */
    ISessionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISegmentCollectionRequestBuilder segments();

    ISegmentRequestBuilder segments(final String id);

}
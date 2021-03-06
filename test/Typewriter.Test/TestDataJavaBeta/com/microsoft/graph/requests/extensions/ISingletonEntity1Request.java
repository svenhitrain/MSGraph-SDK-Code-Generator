// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SingletonEntity1;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Singleton Entity1Request.
 */
public interface ISingletonEntity1Request extends IHttpRequest {

    /**
     * Gets the SingletonEntity1 from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SingletonEntity1> callback);

    /**
     * Gets the SingletonEntity1 from the service
     *
     * @return the SingletonEntity1 from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingletonEntity1 get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SingletonEntity1> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SingletonEntity1 with a source
     *
     * @param sourceSingletonEntity1 the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SingletonEntity1 sourceSingletonEntity1, final ICallback<? super SingletonEntity1> callback);

    /**
     * Patches this SingletonEntity1 with a source
     *
     * @param sourceSingletonEntity1 the source object with updates
     * @return the updated SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingletonEntity1 patch(final SingletonEntity1 sourceSingletonEntity1) throws ClientException;

    /**
     * Posts a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SingletonEntity1 newSingletonEntity1, final ICallback<? super SingletonEntity1> callback);

    /**
     * Posts a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the new object to create
     * @return the created SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingletonEntity1 post(final SingletonEntity1 newSingletonEntity1) throws ClientException;

    /**
     * Posts a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SingletonEntity1 newSingletonEntity1, final ICallback<? super SingletonEntity1> callback);

    /**
     * Posts a SingletonEntity1 with a new object
     *
     * @param newSingletonEntity1 the object to create/update
     * @return the created SingletonEntity1
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SingletonEntity1 put(final SingletonEntity1 newSingletonEntity1) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISingletonEntity1Request select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISingletonEntity1Request expand(final String value);

}


// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TestType;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Test Type Request.
 */
public interface ITestTypeRequest extends IHttpRequest {

    /**
     * Gets the TestType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TestType> callback);

    /**
     * Gets the TestType from the service
     *
     * @return the TestType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TestType get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TestType> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TestType with a source
     *
     * @param sourceTestType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TestType sourceTestType, final ICallback<? super TestType> callback);

    /**
     * Patches this TestType with a source
     *
     * @param sourceTestType the source object with updates
     * @return the updated TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TestType patch(final TestType sourceTestType) throws ClientException;

    /**
     * Posts a TestType with a new object
     *
     * @param newTestType the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TestType newTestType, final ICallback<? super TestType> callback);

    /**
     * Posts a TestType with a new object
     *
     * @param newTestType the new object to create
     * @return the created TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TestType post(final TestType newTestType) throws ClientException;

    /**
     * Posts a TestType with a new object
     *
     * @param newTestType the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TestType newTestType, final ICallback<? super TestType> callback);

    /**
     * Posts a TestType with a new object
     *
     * @param newTestType the object to create/update
     * @return the created TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TestType put(final TestType newTestType) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITestTypeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITestTypeRequest expand(final String value);

}

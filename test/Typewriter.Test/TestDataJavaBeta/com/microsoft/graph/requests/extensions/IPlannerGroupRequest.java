// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Group Request.
 */
public interface IPlannerGroupRequest extends IHttpRequest {

    /**
     * Gets the PlannerGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerGroup> callback);

    /**
     * Gets the PlannerGroup from the service
     *
     * @return the PlannerGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerGroup get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerGroup> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerGroup sourcePlannerGroup, final ICallback<? super PlannerGroup> callback);

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @return the updated PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerGroup patch(final PlannerGroup sourcePlannerGroup) throws ClientException;

    /**
     * Posts a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerGroup newPlannerGroup, final ICallback<? super PlannerGroup> callback);

    /**
     * Posts a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @return the created PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerGroup post(final PlannerGroup newPlannerGroup) throws ClientException;

    /**
     * Posts a PlannerGroup with a new object
     *
     * @param newPlannerGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerGroup newPlannerGroup, final ICallback<? super PlannerGroup> callback);

    /**
     * Posts a PlannerGroup with a new object
     *
     * @param newPlannerGroup the object to create/update
     * @return the created PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerGroup put(final PlannerGroup newPlannerGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerGroupRequest expand(final String value);

}


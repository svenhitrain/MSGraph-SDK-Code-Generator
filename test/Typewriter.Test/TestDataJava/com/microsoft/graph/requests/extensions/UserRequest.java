// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request.
 */
public class UserRequest extends BaseRequest {
	
    /**
     * The request for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
    }

    /**
     * Gets the User from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super User> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the User from the service
     *
     * @return the User from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super User> callback) {
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
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final User sourceUser, @Nonnull final ICallback<? super User> callback) {
        send(HttpMethod.PATCH, callback, sourceUser);
    }

    /**
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @return the updated User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User patch(@Nonnull final User sourceUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final User newUser, @Nonnull final ICallback<? super User> callback) {
        send(HttpMethod.POST, callback, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @return the created User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User post(@Nonnull final User newUser) throws ClientException {
        return send(HttpMethod.POST, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final User newUser, @Nonnull final ICallback<? super User> callback) {
        send(HttpMethod.PUT, callback, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the object to create/update
     * @return the created User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User put(@Nonnull final User newUser) throws ClientException {
        return send(HttpMethod.PUT, newUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public UserRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.extensions.Endpoint;
import com.microsoft.graph2.callrecords.models.extensions.FailureInfo;
import com.microsoft.graph2.callrecords.models.extensions.Media;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.models.extensions.Photo;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EntityType3CollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment.
 */
public class Segment extends Entity implements IJsonBackedObject {


    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar endDateTime;

    /**
     * The Caller.
     * 
     */
    @SerializedName(value = "caller", alternate = {"Caller"})
    @Expose
	@Nullable
    public Endpoint caller;

    /**
     * The Callee.
     * 
     */
    @SerializedName(value = "callee", alternate = {"Callee"})
    @Expose
	@Nullable
    public Endpoint callee;

    /**
     * The Failure Info.
     * 
     */
    @SerializedName(value = "failureInfo", alternate = {"FailureInfo"})
    @Expose
	@Nullable
    public FailureInfo failureInfo;

    /**
     * The Media.
     * 
     */
    @SerializedName(value = "media", alternate = {"Media"})
    @Expose
	@Nullable
    public java.util.List<Media> media;

    /**
     * The Ref Types.
     * 
     */
	@Nullable
    public EntityType3CollectionPage refTypes;

    /**
     * The Ref Type.
     * 
     */
    @SerializedName(value = "refType", alternate = {"RefType"})
    @Expose
	@Nullable
    public Call refType;

    /**
     * The Session Ref.
     * 
     */
    @SerializedName(value = "sessionRef", alternate = {"SessionRef"})
    @Expose
	@Nullable
    public Session sessionRef;

    /**
     * The Photo.
     * 
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public Photo photo;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("refTypes")) {
            refTypes = serializer.deserializeObject(json.get("refTypes").toString(), EntityType3CollectionPage.class);
        }
    }
}

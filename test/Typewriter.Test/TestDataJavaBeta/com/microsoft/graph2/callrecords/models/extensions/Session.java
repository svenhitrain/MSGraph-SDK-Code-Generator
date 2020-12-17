// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.generated.Modality;
import com.microsoft.graph2.callrecords.models.extensions.Endpoint;
import com.microsoft.graph2.callrecords.models.extensions.FailureInfo;
import com.microsoft.graph2.callrecords.models.extensions.Segment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session.
 */
public class Session extends Entity implements IJsonBackedObject {


    /**
     * The Modalities.
     * 
     */
    @SerializedName(value = "modalities", alternate = {"Modalities"})
    @Expose
    public java.util.List<Modality> modalities;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Caller.
     * 
     */
    @SerializedName(value = "caller", alternate = {"Caller"})
    @Expose
    public Endpoint caller;

    /**
     * The Callee.
     * 
     */
    @SerializedName(value = "callee", alternate = {"Callee"})
    @Expose
    public Endpoint callee;

    /**
     * The Failure Info.
     * 
     */
    @SerializedName(value = "failureInfo", alternate = {"FailureInfo"})
    @Expose
    public FailureInfo failureInfo;

    /**
     * The Segments.
     * 
     */
    @SerializedName(value = "segments", alternate = {"Segments"})
    @Expose
    public SegmentCollectionPage segments;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("segments")) {
            segments = serializer.deserializeObject(json.get("segments").toString(), SegmentCollectionPage.class);
        }
    }
}
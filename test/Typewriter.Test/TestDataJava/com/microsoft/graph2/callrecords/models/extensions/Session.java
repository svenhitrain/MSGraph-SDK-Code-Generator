// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.generated.Modality;
import com.microsoft.graph2.callrecords.models.extensions.Endpoint;
import com.microsoft.graph2.callrecords.models.extensions.FailureInfo;
import com.microsoft.graph2.callrecords.models.extensions.Segment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionResponse;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session.
 */
public class Session extends Entity implements IJsonBackedObject {


    /**
     * The Modalities.
     * 
     */
    @SerializedName("modalities")
    @Expose
    public java.util.List<Modality> modalities;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Caller.
     * 
     */
    @SerializedName("caller")
    @Expose
    public Endpoint caller;

    /**
     * The Callee.
     * 
     */
    @SerializedName("callee")
    @Expose
    public Endpoint callee;

    /**
     * The Failure Info.
     * 
     */
    @SerializedName("failureInfo")
    @Expose
    public FailureInfo failureInfo;

    /**
     * The Segments.
     * 
     */
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
            final SegmentCollectionResponse response = new SegmentCollectionResponse();
            if (json.has("segments@odata.nextLink")) {
                response.nextLink = json.get("segments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("segments").toString(), JsonObject[].class);
            final Segment[] array = new Segment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Segment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            segments = new SegmentCollectionPage(response, null);
        }
    }
}

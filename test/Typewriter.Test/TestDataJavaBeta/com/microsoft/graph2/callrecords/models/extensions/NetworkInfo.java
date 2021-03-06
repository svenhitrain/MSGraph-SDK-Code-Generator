// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.generated.NetworkConnectionType;
import com.microsoft.graph2.callrecords.models.generated.WifiBand;
import com.microsoft.graph2.callrecords.models.generated.WifiRadioType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network Info.
 */
public class NetworkInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Connection Type.
     * 
     */
    @SerializedName(value = "connectionType", alternate = {"ConnectionType"})
    @Expose
    public NetworkConnectionType connectionType;

    /**
     * The Wifi Band.
     * 
     */
    @SerializedName(value = "wifiBand", alternate = {"WifiBand"})
    @Expose
    public WifiBand wifiBand;

    /**
     * The Basic Service Set Identifier.
     * 
     */
    @SerializedName(value = "basicServiceSetIdentifier", alternate = {"BasicServiceSetIdentifier"})
    @Expose
    public String basicServiceSetIdentifier;

    /**
     * The Wifi Radio Type.
     * 
     */
    @SerializedName(value = "wifiRadioType", alternate = {"WifiRadioType"})
    @Expose
    public WifiRadioType wifiRadioType;

    /**
     * The Wifi Signal Strength.
     * 
     */
    @SerializedName(value = "wifiSignalStrength", alternate = {"WifiSignalStrength"})
    @Expose
    public Integer wifiSignalStrength;

    /**
     * The Bandwidth Low Event Ratio.
     * 
     */
    @SerializedName(value = "bandwidthLowEventRatio", alternate = {"BandwidthLowEventRatio"})
    @Expose
    public float bandwidthLowEventRatio;


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

    }
}

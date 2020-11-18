// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Enum1;
import com.microsoft.graph.models.extensions.EmptyBaseComplexTypeRequest;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Derived Complex Type Request.
 */
public class DerivedComplexTypeRequest extends EmptyBaseComplexTypeRequest implements IJsonBackedObject {


    /**
     * The Property1.
     * 
     */
    @SerializedName(value = "property1", alternate = {"Property1"})
    @Expose
	@Nullable
    public String property1;

    /**
     * The Property2.
     * 
     */
    @SerializedName(value = "property2", alternate = {"Property2"})
    @Expose
	@Nullable
    public String property2;

    /**
     * The Enum Property.
     * 
     */
    @SerializedName(value = "enumProperty", alternate = {"EnumProperty"})
    @Expose
	@Nullable
    public Enum1 enumProperty;


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

    }
}

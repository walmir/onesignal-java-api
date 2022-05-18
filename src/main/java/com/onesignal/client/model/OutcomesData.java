/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onesignal.client.model.OutcomeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * OutcomesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-18T21:16:00.973Z[Etc/UTC]")
public class OutcomesData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private List<OutcomeData> outcomes = null;

  public OutcomesData() { 
  }

  public OutcomesData outcomes(List<OutcomeData> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public OutcomesData addOutcomesItem(OutcomeData outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Get outcomes
   * @return outcomes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OutcomeData> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(List<OutcomeData> outcomes) {
    this.outcomes = outcomes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomesData outcomesData = (OutcomesData) o;
    return Objects.equals(this.outcomes, outcomesData.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomesData {\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("outcomes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutcomesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutcomesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutcomesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutcomesData.class));

       return (TypeAdapter<T>) new TypeAdapter<OutcomesData>() {
           @Override
           public void write(JsonWriter out, OutcomesData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutcomesData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutcomesData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutcomesData
  * @throws IOException if the JSON string is invalid with respect to OutcomesData
  */
  public static OutcomesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutcomesData.class);
  }

 /**
  * Convert an instance of OutcomesData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


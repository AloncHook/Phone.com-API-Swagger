/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MediaSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * The Full Trunk Object is identical to the Trunk Summary Object, along with the following:
 */
@ApiModel(description = "The Full Trunk Object is identical to the Trunk Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-13T08:15:06.119Z")
public class TrunkFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("max_concurrent_calls")
  private Integer maxConcurrentCalls = null;

  @SerializedName("max_minutes_per_month")
  private Integer maxMinutesPerMonth = null;

  @SerializedName("greeting")
  private MediaSummary greeting = null;

  @SerializedName("error_message")
  private MediaSummary errorMessage = null;

  @SerializedName("codecs")
  private List<String> codecs = new ArrayList<String>();

  public TrunkFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer Trunk ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Integer Trunk ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TrunkFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name. Required.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name. Required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrunkFull uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Fully-qualified SIP URI. Required.
   * @return uri
  **/
  @ApiModelProperty(example = "null", required = true, value = "Fully-qualified SIP URI. Required.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public TrunkFull maxConcurrentCalls(Integer maxConcurrentCalls) {
    this.maxConcurrentCalls = maxConcurrentCalls;
    return this;
  }

   /**
   * Max concurrent calls. Default is 10.
   * @return maxConcurrentCalls
  **/
  @ApiModelProperty(example = "null", required = true, value = "Max concurrent calls. Default is 10.")
  public Integer getMaxConcurrentCalls() {
    return maxConcurrentCalls;
  }

  public void setMaxConcurrentCalls(Integer maxConcurrentCalls) {
    this.maxConcurrentCalls = maxConcurrentCalls;
  }

  public TrunkFull maxMinutesPerMonth(Integer maxMinutesPerMonth) {
    this.maxMinutesPerMonth = maxMinutesPerMonth;
    return this;
  }

   /**
   * Max minutes per month. Default is 750.
   * @return maxMinutesPerMonth
  **/
  @ApiModelProperty(example = "null", required = true, value = "Max minutes per month. Default is 750.")
  public Integer getMaxMinutesPerMonth() {
    return maxMinutesPerMonth;
  }

  public void setMaxMinutesPerMonth(Integer maxMinutesPerMonth) {
    this.maxMinutesPerMonth = maxMinutesPerMonth;
  }

  public TrunkFull greeting(MediaSummary greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Greeting. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
   * @return greeting
  **/
  @ApiModelProperty(example = "null", required = true, value = "Greeting. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.")
  public MediaSummary getGreeting() {
    return greeting;
  }

  public void setGreeting(MediaSummary greeting) {
    this.greeting = greeting;
  }

  public TrunkFull errorMessage(MediaSummary errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error Message. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", required = true, value = "Error Message. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.")
  public MediaSummary getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(MediaSummary errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TrunkFull codecs(List<String> codecs) {
    this.codecs = codecs;
    return this;
  }

  public TrunkFull addCodecsItem(String codecsItem) {
    this.codecs.add(codecsItem);
    return this;
  }

   /**
   * Custom audio codec configuration, if any is needed. If provided, must be a simple array containing the prioritized list of desired codecs. Supported codecs are: g711u 64k, g711u 56k, g711a 64k, g711a 56k, g7231, g728, g729, g729A, g729B, g729AB, gms full, rfc2833, t38, ilbc, h263, g722, g722_1, g729D, g729E, amr, amr_wb, efr, evrc, h264, mpeg4, red, cng, SIP Info to 2833
   * @return codecs
  **/
  @ApiModelProperty(example = "null", required = true, value = "Custom audio codec configuration, if any is needed. If provided, must be a simple array containing the prioritized list of desired codecs. Supported codecs are: g711u 64k, g711u 56k, g711a 64k, g711a 56k, g7231, g728, g729, g729A, g729B, g729AB, gms full, rfc2833, t38, ilbc, h263, g722, g722_1, g729D, g729E, amr, amr_wb, efr, evrc, h264, mpeg4, red, cng, SIP Info to 2833")
  public List<String> getCodecs() {
    return codecs;
  }

  public void setCodecs(List<String> codecs) {
    this.codecs = codecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkFull trunkFull = (TrunkFull) o;
    return Objects.equals(this.id, trunkFull.id) &&
        Objects.equals(this.name, trunkFull.name) &&
        Objects.equals(this.uri, trunkFull.uri) &&
        Objects.equals(this.maxConcurrentCalls, trunkFull.maxConcurrentCalls) &&
        Objects.equals(this.maxMinutesPerMonth, trunkFull.maxMinutesPerMonth) &&
        Objects.equals(this.greeting, trunkFull.greeting) &&
        Objects.equals(this.errorMessage, trunkFull.errorMessage) &&
        Objects.equals(this.codecs, trunkFull.codecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uri, maxConcurrentCalls, maxMinutesPerMonth, greeting, errorMessage, codecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    maxConcurrentCalls: ").append(toIndentedString(maxConcurrentCalls)).append("\n");
    sb.append("    maxMinutesPerMonth: ").append(toIndentedString(maxMinutesPerMonth)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    codecs: ").append(toIndentedString(codecs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

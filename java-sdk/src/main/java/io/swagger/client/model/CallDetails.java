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

/**
 * Each item in the &#39;details&#39; record may contain the following properties:
 */
@ApiModel(description = "Each item in the 'details' record may contain the following properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T10:24:24.257Z")
public class CallDetails {
  @SerializedName("start_time")
  private Integer startTime = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("id_value")
  private Integer idValue = null;

  @SerializedName("voip_id")
  private Integer voipId = null;

  @SerializedName("voip_phone_id")
  private Integer voipPhoneId = null;

  public CallDetails startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * UNIX time stamp representing the UTC time that this call item starts
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "UNIX time stamp representing the UTC time that this call item starts")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public CallDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CallDetails idValue(Integer idValue) {
    this.idValue = idValue;
    return this;
  }

   /**
   * ID associated with this call item endpoint (type)
   * @return idValue
  **/
  @ApiModelProperty(example = "null", value = "ID associated with this call item endpoint (type)")
  public Integer getIdValue() {
    return idValue;
  }

  public void setIdValue(Integer idValue) {
    this.idValue = idValue;
  }

  public CallDetails voipId(Integer voipId) {
    this.voipId = voipId;
    return this;
  }

   /**
   * Same as account id
   * @return voipId
  **/
  @ApiModelProperty(example = "null", value = "Same as account id")
  public Integer getVoipId() {
    return voipId;
  }

  public void setVoipId(Integer voipId) {
    this.voipId = voipId;
  }

  public CallDetails voipPhoneId(Integer voipPhoneId) {
    this.voipPhoneId = voipPhoneId;
    return this;
  }

   /**
   * Same as account extension id
   * @return voipPhoneId
  **/
  @ApiModelProperty(example = "null", value = "Same as account extension id")
  public Integer getVoipPhoneId() {
    return voipPhoneId;
  }

  public void setVoipPhoneId(Integer voipPhoneId) {
    this.voipPhoneId = voipPhoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallDetails callDetails = (CallDetails) o;
    return Objects.equals(this.startTime, callDetails.startTime) &&
        Objects.equals(this.type, callDetails.type) &&
        Objects.equals(this.idValue, callDetails.idValue) &&
        Objects.equals(this.voipId, callDetails.voipId) &&
        Objects.equals(this.voipPhoneId, callDetails.voipPhoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, type, idValue, voipId, voipPhoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallDetails {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
    sb.append("    voipId: ").append(toIndentedString(voipId)).append("\n");
    sb.append("    voipPhoneId: ").append(toIndentedString(voipPhoneId)).append("\n");
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

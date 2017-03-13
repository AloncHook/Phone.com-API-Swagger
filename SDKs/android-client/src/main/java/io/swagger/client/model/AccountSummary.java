/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Account Summary Object is used to briefly represent an account. It can occur in several places throughout this API. Here are the properties:
 **/
@ApiModel(description = "The Account Summary Object is used to briefly represent an account. It can occur in several places throughout this API. Here are the properties:")
public class AccountSummary {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * Account ID. Sometimes referred to as \"Voip ID\" or \"voip_id\".
   **/
  @ApiModelProperty(value = "Account ID. Sometimes referred to as \"Voip ID\" or \"voip_id\".")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Name on the account. Read-only.
   **/
  @ApiModelProperty(value = "Name on the account. Read-only.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSummary accountSummary = (AccountSummary) o;
    return (this.id == null ? accountSummary.id == null : this.id.equals(accountSummary.id)) &&
        (this.name == null ? accountSummary.name == null : this.name.equals(accountSummary.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSummary {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
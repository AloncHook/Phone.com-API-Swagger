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

import io.swagger.client.model.ContactFull;
import io.swagger.client.model.FilterIdGroupIdUpdatedAtArray;
import io.swagger.client.model.SortIdUpdatedAt;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListContacts {
  
  @SerializedName("filters")
  private FilterIdGroupIdUpdatedAtArray filters = null;
  @SerializedName("sort")
  private SortIdUpdatedAt sort = null;
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("limit")
  private Integer limit = null;
  @SerializedName("items")
  private List<ContactFull> items = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FilterIdGroupIdUpdatedAtArray getFilters() {
    return filters;
  }
  public void setFilters(FilterIdGroupIdUpdatedAtArray filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SortIdUpdatedAt getSort() {
    return sort;
  }
  public void setSort(SortIdUpdatedAt sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContactFull> getItems() {
    return items;
  }
  public void setItems(List<ContactFull> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListContacts listContacts = (ListContacts) o;
    return (this.filters == null ? listContacts.filters == null : this.filters.equals(listContacts.filters)) &&
        (this.sort == null ? listContacts.sort == null : this.sort.equals(listContacts.sort)) &&
        (this.total == null ? listContacts.total == null : this.total.equals(listContacts.total)) &&
        (this.offset == null ? listContacts.offset == null : this.offset.equals(listContacts.offset)) &&
        (this.limit == null ? listContacts.limit == null : this.limit.equals(listContacts.limit)) &&
        (this.items == null ? listContacts.items == null : this.items.equals(listContacts.items));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.offset == null ? 0: this.offset.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListContacts {\n");
    
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
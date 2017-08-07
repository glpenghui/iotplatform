package org.iotp.infomgt.data;

import org.iotp.infomgt.data.common.NamingThing;
import org.iotp.infomgt.data.id.CustomerId;
import org.iotp.infomgt.data.id.DeviceTypeId;
import org.iotp.infomgt.data.id.TenantId;

import com.fasterxml.jackson.databind.JsonNode;

public class DeviceType extends SearchTextBased<DeviceTypeId> implements NamingThing {

  private static final long serialVersionUID = 2807343040519543363L;

  private TenantId tenantId;
  private CustomerId customerId;
  private String name;
  private JsonNode additionalInfo;

  public DeviceType() {
    super();
  }

  public DeviceType(DeviceTypeId id) {
    super(id);
  }

  public DeviceType(DeviceType deviceType) {
    super(deviceType);
    this.tenantId = deviceType.getTenantId();
    this.customerId = deviceType.getCustomerId();
    this.name = deviceType.getName();
    this.additionalInfo = deviceType.getAdditionalInfo();
  }

  public TenantId getTenantId() {
    return tenantId;
  }

  public void setTenantId(TenantId tenantId) {
    this.tenantId = tenantId;
  }

  public CustomerId getCustomerId() {
    return customerId;
  }

  public void setCustomerId(CustomerId customerId) {
    this.customerId = customerId;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonNode getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public String getSearchText() {
    return name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((additionalInfo == null) ? 0 : additionalInfo.hashCode());
    result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    DeviceType other = (DeviceType) obj;
    if (additionalInfo == null) {
      if (other.additionalInfo != null)
        return false;
    } else if (!additionalInfo.equals(other.additionalInfo))
      return false;
    if (customerId == null) {
      if (other.customerId != null)
        return false;
    } else if (!customerId.equals(other.customerId))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (tenantId == null) {
      if (other.tenantId != null)
        return false;
    } else if (!tenantId.equals(other.tenantId))
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Device [tenantId=");
    builder.append(tenantId);
    builder.append(", customerId=");
    builder.append(customerId);
    builder.append(", name=");
    builder.append(name);
    builder.append(", additionalInfo=");
    builder.append(additionalInfo);
    builder.append(", createdTime=");
    builder.append(createdTime);
    builder.append(", id=");
    builder.append(id);
    builder.append("]");
    return builder.toString();
  }

}

package com.dubbo.test.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String UserAddress;
	private String userId;
	private String consignee;//收货人
	private String phoneNum;
	private String isDefault;//是否默认地址
	
	public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum,
			String isDefault) {
		super();
		this.id = id;
		UserAddress = userAddress;
		this.userId = userId;
		this.consignee = consignee;
		this.phoneNum = phoneNum;
		this.isDefault = isDefault;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", UserAddress=" + UserAddress + ", userId=" + userId + ", consignee="
				+ consignee + ", phoneNum=" + phoneNum + ", isDefault=" + isDefault + "]";
	}
}

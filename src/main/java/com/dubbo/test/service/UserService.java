package com.dubbo.test.service;

import java.util.List;

import com.dubbo.test.bean.UserAddress;

public interface UserService {
	
	public List<UserAddress> getUserAddressList(String userId);
}

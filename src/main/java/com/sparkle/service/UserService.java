package com.sparkle.service;

import com.sparkle.entity.ResponseBean;

public interface UserService {

	ResponseBean login(String phone, String password);

}

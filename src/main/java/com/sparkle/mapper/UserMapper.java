package com.sparkle.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
	
	@Select("SELECT id,username,phone,address,password FROM t_user WHERE phone=#{phone}")
	public Map<String, Object> getUserInfo(String phone);
	
	public Map<String,Object> getBalance(String phone);
	
	public int updateAccount(String phone, String balance, String updatetime);
	
	@Select("SELECT num FROM websitevisit WHERE website=#{website}")
	public int getVisitNum(String website);
	
	@Update("UPDATE websitevisit SET num = #{num} WHERE website='index'")
	public void updateVisitNum(int num);
}

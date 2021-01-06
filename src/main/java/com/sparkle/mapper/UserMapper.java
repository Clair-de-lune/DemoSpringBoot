package com.sparkle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("SELECT username,phone,address,password FROM t_user WHERE phone=#{phone}")
    Map<String, Object> getUserInfo(String phone);

    @Select("SELECT num FROM websitevisit WHERE website=#{website}")
    int getVisitNum(String website);

    @Update("UPDATE websitevisit SET num = #{num} WHERE website='index'")
    void updateVisitNum(int num);
}

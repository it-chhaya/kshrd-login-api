package com.chhaya.loginapi.repository;

import com.chhaya.loginapi.repository.provider.UserProvider;
import com.chhaya.loginapi.shared.dto.UserDto;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    @SelectProvider(type = UserProvider.class, method = "selectUserSql")
    @Results(id = "userResultMapper", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "fullName", column = "full_name")
    })
    List<UserDto> select();

    @SelectProvider(type = UserProvider.class, method = "selectUserByEmail")
    @ResultMap("userResultMapper")
    UserDto selectByEmail(String email);

}

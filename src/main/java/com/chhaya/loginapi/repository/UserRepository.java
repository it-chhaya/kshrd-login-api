package com.chhaya.loginapi.repository;

import com.chhaya.loginapi.repository.provider.UserProvider;
import com.chhaya.loginapi.shared.dto.UserDto;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    @SelectProvider(type = UserProvider.class, method = "selectUserSql")
    List<UserDto> select();

    @SelectProvider(type = UserProvider.class, method = "selectUserByEmail")
    UserDto selectByEmail(String email);

}

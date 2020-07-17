package com.chhaya.loginapi.service;

import com.chhaya.loginapi.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserDto> select();

}

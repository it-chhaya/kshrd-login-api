package com.chhaya.loginapi.service.impl;

import com.chhaya.loginapi.repository.UserRepository;
import com.chhaya.loginapi.service.UserService;
import com.chhaya.loginapi.shared.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> select() {
        return userRepository.select();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserDto userDto = userRepository.selectByEmail(email);

        System.out.println(userDto);

        return new User(userDto.getEmail(), userDto.getPassword(), new ArrayList<>());

    }

}

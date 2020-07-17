package com.chhaya.loginapi.api.restcontroller;

import com.chhaya.loginapi.api.model.response.SuccessResponse;
import com.chhaya.loginapi.api.model.response.UserResponse;
import com.chhaya.loginapi.service.impl.UserServiceImpl;
import com.chhaya.loginapi.shared.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private UserServiceImpl userService;

    @Autowired
    public UserRestController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<SuccessResponse<List<UserResponse>>> selectAllUsers() {

        ModelMapper mapper = new ModelMapper();

        List<UserDto> userDtoList = userService.select();

        List<UserResponse> userResponses = new ArrayList<>();

        for (UserDto userDto : userDtoList) {
            userResponses.add(mapper.map(userDto, UserResponse.class));
        }

        SuccessResponse<List<UserResponse>> response = new SuccessResponse<>();
        response.setMessage("User found successfully!");
        response.setStatus(HttpStatus.OK);
        response.setData(userResponses);
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return ResponseEntity.ok(response);

    }

}

package com.sise.oj.service;


import com.sise.oj.domain.dto.JwtUserDto;
import com.sise.oj.domain.dto.OnlineUserDto;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cijee
 * @version 1.0
 */
public interface OnlineUserService {

    void save(JwtUserDto jwtUserDto, String token, HttpServletRequest request);

    void logout(String token);

    OnlineUserDto getOne(String key);
}

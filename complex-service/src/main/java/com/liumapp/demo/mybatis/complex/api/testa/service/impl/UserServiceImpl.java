package com.liumapp.demo.mybatis.complex.api.testa.service.impl;

import com.liumapp.demo.mybatis.complex.api.testa.domain.User;
import com.liumapp.demo.mybatis.complex.api.testa.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file UserServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public int insert(User user) {
        return 0;
    }

}
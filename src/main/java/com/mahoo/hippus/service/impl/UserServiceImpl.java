package com.mahoo.hippus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mahoo.hippus.model.User;
import com.mahoo.hippus.service.UserService;
import com.mahoo.hippus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Mahoo12138
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2022-12-06 16:53:41
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





package com.mahoo.hippus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mahoo.hippus.model.Role;
import com.mahoo.hippus.service.RoleService;
import com.mahoo.hippus.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author Mahoo12138
* @description 针对表【role】的数据库操作Service实现
* @createDate 2022-12-13 21:13:02
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}





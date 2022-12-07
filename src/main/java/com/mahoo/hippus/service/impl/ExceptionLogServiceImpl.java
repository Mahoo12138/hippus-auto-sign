package com.mahoo.hippus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mahoo.hippus.model.ExceptionLog;
import com.mahoo.hippus.service.ExceptionLogService;
import com.mahoo.hippus.mapper.ExceptionLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Mahoo12138
* @description 针对表【exception_log(接口异常记录表)】的数据库操作Service实现
* @createDate 2022-12-07 23:49:50
*/
@Service
public class ExceptionLogServiceImpl extends ServiceImpl<ExceptionLogMapper, ExceptionLog>
    implements ExceptionLogService{

}





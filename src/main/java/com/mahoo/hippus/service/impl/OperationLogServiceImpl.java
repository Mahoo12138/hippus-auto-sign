package com.mahoo.hippus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mahoo.hippus.model.OperationLog;
import com.mahoo.hippus.service.OperationLogService;
import com.mahoo.hippus.mapper.OperationLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Mahoo12138
* @description 针对表【operation_log(接口操作记录表)】的数据库操作Service实现
* @createDate 2022-12-07 23:17:28
*/
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog>
    implements OperationLogService{

}





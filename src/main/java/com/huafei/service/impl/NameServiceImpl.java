package com.huafei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huafei.entity.Name;
import com.huafei.mapper.NameMapper;
import com.huafei.service.NameService;
import org.springframework.stereotype.Service;

/**
* @author fengzhaowang
* @description 针对表【name】的数据库操作Service实现
* @createDate 2022-06-19 14:57:24
*/
@Service
public class NameServiceImpl extends ServiceImpl<NameMapper, Name> implements NameService {

}

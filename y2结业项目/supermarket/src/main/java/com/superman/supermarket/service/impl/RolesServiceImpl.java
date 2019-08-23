package com.superman.supermarket.service.impl;

import com.alibaba.fastjson.JSON;
import com.superman.supermarket.entity.Roles;
import com.superman.supermarket.dao.RolesMapper;
import com.superman.supermarket.service.RolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author superman
 * @since 2019-07-12
 */
@Transactional
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements RolesService {
    @Resource
    private RolesMapper rolesMapper;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public String findAll() {
        List<Roles> rolesList =  rolesMapper.findAll();
        return JSON.toJSONString(rolesList);
    }
}

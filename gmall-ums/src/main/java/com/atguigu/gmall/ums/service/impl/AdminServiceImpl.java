package com.atguigu.gmall.ums.service.impl;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.mapper.AdminMapper;
import com.atguigu.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author afei
 * @since 2020-05-08
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {

        //密码进行MD5解析

        String s = DigestUtils.md5DigestAsHex(password.getBytes());

        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username).eq("password",s);

        Admin admin = adminMapper.selectOne(wrapper);



        return admin;
    }
}

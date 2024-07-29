package com.employee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.employee.entity.User;
import com.employee.entity.vo.UserVo;
import com.employee.mapper.UserMapper;
import com.employee.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.employee.utils.JwtUtils;
import com.employee.utils.MD5;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public String login(UserVo userVo) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if (userVo.getUsername() != null) {
            userQueryWrapper.eq("username",userVo.getUsername());
            User user = baseMapper.selectOne(userQueryWrapper);
            if (user == null){
                return null;
            } else {
                if (user.getPassword().equals(MD5.encrypt(userVo.getPassword()))) {
                    String token = JwtUtils.getJwtToken(user.getId(), user.getUsername());
                    return token;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
}

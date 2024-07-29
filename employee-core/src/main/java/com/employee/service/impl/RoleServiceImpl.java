package com.employee.service.impl;

import com.employee.entity.Role;
import com.employee.mapper.RoleMapper;
import com.employee.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-06
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}

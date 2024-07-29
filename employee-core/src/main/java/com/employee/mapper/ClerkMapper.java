package com.employee.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.employee.entity.Clerk;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.employee.entity.vo.ClerkQueryVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 职员表 Mapper 接口
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface ClerkMapper extends BaseMapper<Clerk> {
    //员工分页查询
    IPage<Clerk> pageListQuery(Page<Clerk> clerkPage,@Param("clerkQueryVo")ClerkQueryVo clerkQueryVo);
}

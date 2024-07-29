package com.employee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.employee.entity.Contract;
import com.baomidou.mybatisplus.extension.service.IService;
import com.employee.entity.vo.ContractQueryVo;

/**
 * <p>
 * 合同表 服务类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface ContractService extends IService<Contract> {

    IPage<Contract> pageListQuery(Page<Contract> clerkPage, ContractQueryVo contractQueryVo);
}

package com.employee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.employee.entity.RewardsPunishments;
import com.employee.entity.vo.RPQueryVo;
import com.employee.mapper.RewardsPunishmentsMapper;
import com.employee.service.RewardsPunishmentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 奖惩表 服务实现类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
@Service
public class RewardsPunishmentsServiceImpl extends ServiceImpl<RewardsPunishmentsMapper, RewardsPunishments> implements RewardsPunishmentsService {

    @Override
    public IPage<RewardsPunishments> pageListQuery(Page<RewardsPunishments> clerkPage, RPQueryVo rpQueryVo) {
        IPage<RewardsPunishments> rewardsPunishmentsIPage = baseMapper.pageListQuery(clerkPage,rpQueryVo);
        return rewardsPunishmentsIPage;
    }
}

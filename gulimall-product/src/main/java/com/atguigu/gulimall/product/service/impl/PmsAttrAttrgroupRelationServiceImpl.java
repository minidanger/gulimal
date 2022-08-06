package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.Query;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.dao.PmsAttrAttrgroupRelationDao;
import com.atguigu.gulimall.product.entity.PmsAttrAttrgroupRelationEntity;
import com.atguigu.gulimall.product.service.PmsAttrAttrgroupRelationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl extends ServiceImpl<PmsAttrAttrgroupRelationDao, PmsAttrAttrgroupRelationEntity> implements PmsAttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrAttrgroupRelationEntity> page = this.page(
                new Query<PmsAttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<PmsAttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}
package com.fanlm.cloudzuul.dao;

import com.fanlm.cloudzuul.entity.CommonGrayRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonGrayRuleDaoCustom extends CommonGrayRuleDao {

    CommonGrayRule selectByUserId(Integer userId);
}

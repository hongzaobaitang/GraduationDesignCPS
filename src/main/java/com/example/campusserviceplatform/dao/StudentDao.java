package com.example.campusserviceplatform.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.campusserviceplatform.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zousir
 * @email SloooFish@163.com
 * @date 2022-09-24 16:41:07
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
	
}

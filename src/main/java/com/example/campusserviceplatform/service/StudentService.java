package com.example.campusserviceplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.campusserviceplatform.common.utils.PageUtils;
import com.example.campusserviceplatform.entity.StudentEntity;


import java.util.Map;

/**
 * 
 *
 * @author zousir
 * @email SloooFish@163.com
 * @date 2022-09-24 16:41:07
 */
public interface StudentService extends IService<StudentEntity> {

    PageUtils queryPage(Map<String, Object> params);

}


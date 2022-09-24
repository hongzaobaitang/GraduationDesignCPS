package com.example.campusserviceplatform.service.Impl;

import com.example.campusserviceplatform.common.utils.PageUtils;
import com.example.campusserviceplatform.common.utils.Query;
import com.example.campusserviceplatform.dao.StudentDao;
import com.example.campusserviceplatform.entity.StudentEntity;
import com.example.campusserviceplatform.service.StudentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, StudentEntity> implements StudentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String) params.get("key");
        QueryWrapper<StudentEntity> eq = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(key)) {
            eq.eq("stu_id", key).or().like("stu_name", key);
        }
        IPage<StudentEntity> page = this.page(
                new Query<StudentEntity>().getPage(params),
                eq
        );

        return new PageUtils(page);
    }

}
package com.example.campusserviceplatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zousir
 * @email SloooFish@163.com
 * @date 2022-09-24 16:41:07
 */
@Data
@TableName("csp_student")
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Integer id;
	/**
	 * 学号
	 */
	private String stuId;
	/**
	 * 姓名
	 */
	private String stuName;
	/**
	 * 性别
	 */
	private String stuGeneder;
	/**
	 * 出生日期
	 */
	private Date stuBirthday;
	/**
	 * 年级
	 */
	private String stuGrade;
	/**
	 * 专业
	 */
	private String stuMajor;
	/**
	 * 手机号
	 */
	private String stuPhone;
	/**
	 * 头像
	 */
	private String stuHeadImg;
	/**
	 * 得分
	 */
	private Integer stuScore;
	/**
	 * 创建时间
	 */
	private Date stuCreatetime;
	/**
	 * 最后修改时间
	 */
	private Date stuUpdatetime;
	/**
	 * 删除状态 1代表没有删除 0代表已经被删除
	 */
	private Integer stuDelete;
	/**
	 * 密码
	 */
	private String stuPassword;

}

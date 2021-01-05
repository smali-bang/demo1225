package com.demo.entity;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:05
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("t_user")
public class Tuser implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户编号
     */
    private String userCode;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 注册时间
     */
    private String regTime;

}

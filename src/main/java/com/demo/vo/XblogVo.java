package com.demo.vo;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:29
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
public class XblogVo implements Serializable {
    /**
     * 主键
     */
    private Integer bid;
    /**
     * 标题
     */
    private String btitle;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 阅读量
     */
    private Integer readNumber;
    /**
     * 回复时间
     */
    private String replyTime;
    /**
     * 回复数
     */
    private Integer counts;
    /**
     * 回复内容
     */
    private String detailed;
}

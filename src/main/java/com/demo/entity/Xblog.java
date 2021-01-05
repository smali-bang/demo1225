package com.demo.entity;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:08
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("xblog")
public class Xblog implements Serializable {
    /**
     * 主键
     */
    private Integer bid;
    /**
     * 标题
     */
    private String btitle;
    /**
     * 内容
     */
    private String content;
    /**
     * 发布时间
     */
    private String publishTime;
    /**
     * 发布人
     */
    private Integer authorId;
    /**
     * 最近时间
     */
    private String replyTime;
    /**
     * 阅读量
     */
    private Integer readNumber;


}

package com.demo.entity;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:12
 */

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("reply_detailed")
public class ReplyDetailed implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 帖子id
     */
    private Integer bId;
    /**
     * 回复人id
     */
    private Integer uId;
    /**
     * 回复内容
     */
    private String detailed;
    /**
     * 回复时间
     */
    private String replyTime;

}

package com.demo.service;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:39
 */

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.entity.ReplyDetailed;
import com.demo.entity.Xblog;
import com.demo.vo.XblogVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IXblogService extends IService<Xblog> {
    /**
     * 初始化查询数据
     * @return
     */
    List<XblogVo> findsXblog(Page page,Integer xin,Integer re);
    /**
     * 根据id查询名称内容
     */
    Xblog  findsXb(@Param("id") Integer id);
    /**
     * 查询回复内容信息
     */
    List<XblogVo> findDetails(@Param("id") Integer id);
    /**
     * 登录
     */
    Integer findsLogin(@Param("name") String name,@Param("pwd") String pwd);
    /**
     * 发布帖
     */
    Integer addReplys(ReplyDetailed replyDetailed);
}

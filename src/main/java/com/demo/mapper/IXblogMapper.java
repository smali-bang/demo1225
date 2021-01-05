package com.demo.mapper;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:28
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.entity.ReplyDetailed;
import com.demo.entity.Xblog;
import com.demo.vo.XblogVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IXblogMapper extends BaseMapper<Xblog> {
    /**
     * 初始化查询数据
     * @return
     */
    List<XblogVo> findsXblog(Page page, @Param("xin") Integer xin,@Param("re") Integer re);
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

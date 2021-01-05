package com.demo.service.impl;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:39
 */

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.ReplyDetailed;
import com.demo.entity.Xblog;
import com.demo.mapper.IXblogMapper;
import com.demo.service.IXblogService;
import com.demo.vo.XblogVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XblogServiceImpl extends ServiceImpl<IXblogMapper, Xblog> implements IXblogService {
    @Resource
    private IXblogMapper xblogMapper;

    /**
     * 初始化查询列表数据
     * @param page
     * @return
     */
    @Override
    public List<XblogVo> findsXblog(Page page,Integer xin,Integer re) {
        return xblogMapper.findsXblog(page,xin, re);
    }

    /**
     * 查询标题和内容
     * @param id
     * @return
     */
    @Override
    public Xblog findsXb(Integer id) {
        return xblogMapper.findsXb(id);
    }

    /**
     * 查询回复信息
     * @param id
     * @return
     */
    @Override
    public List<XblogVo> findDetails(Integer id) {
        return xblogMapper.findDetails(id);
    }

    @Override
    public Integer findsLogin(String name, String pwd) {
        return xblogMapper.findsLogin(name, pwd);
    }

    @Override
    public Integer addReplys(ReplyDetailed replyDetailed) {
        return xblogMapper.addReplys(replyDetailed);
    }
}

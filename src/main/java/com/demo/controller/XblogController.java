package com.demo.controller;/*
 * User:龙婷杰
 * Date:2020/12/25
 * Time:10:41
 */

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.entity.ReplyDetailed;
import com.demo.entity.Xblog;
import com.demo.service.IXblogService;
import com.demo.util.Result;
import com.demo.vo.XblogVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class XblogController {
    @Resource
    private IXblogService xblogService;

    /**
     * 初始化查询列表数据
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    private Result<List<XblogVo>> findsList(@RequestParam(value = "curr",defaultValue = "1") Integer curr,
                                            @RequestParam(value = "size",defaultValue = "3")Integer size,Integer xin,Integer re){
        Result<List<XblogVo>> result=new Result<>();
        Page page=new Page(curr,size);
        List<XblogVo> list=xblogService.findsXblog(page,xin,re);
        result.setResult(list);
        return result;
    }

    /**
     * 查询标题和内容
     */
    @RequestMapping(value = "title",method = RequestMethod.GET)
    public Result<Xblog> findTitle(Integer id){
        Result<Xblog> result=new Result<>();
        Xblog xblog=xblogService.findsXb(id);
        result.setResult(xblog);
        return result;
    }

    /**
     * 查询回复信息
     */
    @RequestMapping(value = "detai",method = RequestMethod.GET)
    public Result<List<XblogVo>> findDetail(Integer id){
        Result<List<XblogVo>> result=new Result<>();
        List<XblogVo> list=xblogService.findDetails(id);
        result.setResult(list);
        return result;
    }

    /**
     * 登录
     */
    @RequestMapping(value = "login")
    public Result log(String userName, String pwd, HttpSession session){
        Result result=new Result();
        Integer i=xblogService.findsLogin(userName, pwd);
        if(i>0){
            result.setMessage("登陆成功");
            session.setAttribute("name",userName);
            session.setAttribute("id",i);
        }else {
            result.setMessage("登陆失败");
            result.setSuccess(false);
        }

        return result;
    }

    /**
     * 发布帖
     */
    @RequestMapping(value = "add")
    public Result log(ReplyDetailed replyDetailed,HttpSession session){
        Result result=new Result();
        String name=(String) session.getAttribute("name");
        if(name==null){
            result.setMessage("请先登录");
        }else {
            Integer a=(Integer)session.getAttribute("id");
            replyDetailed.setUId(a);
            Integer i=xblogService.addReplys(replyDetailed);
            if(i>0){
                result.setMessage("发布成功");
            }else {
                result.setMessage("发布失败");
                result.setSuccess(false);
            }
        }
        return result;
    }

}

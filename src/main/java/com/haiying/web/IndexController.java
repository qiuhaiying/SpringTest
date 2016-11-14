package com.haiying.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qiuhaiying on 16/11/13.
 */
//表明是spring的控制器
@Controller
@RequestMapping("/ugc")
public class IndexController {
    /**
     * 1.使用RequestMapping注解来映射请求的URL
     * 2.返回值会通过视图解析器解析为实际的物理视图,对于InternalResourceViewResolver视图解析器,会做如下解析
     * 通过prifix+returnVal+suffix 这样的方式得到实际的物理视图,然后会转发操作
     * "WEB-INF/success.jsp"
     * @ return
     */
    //匹配请求的路径
    @RequestMapping("/b")
    public String hello(){
        System.out.println("hello world");
        return "success";

    }
}

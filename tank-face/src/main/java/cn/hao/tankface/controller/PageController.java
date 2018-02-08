package cn.hao.tankface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tianbohao on 2018/2/6.
 */
@Controller
public class PageController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String mainPage(){
        return "index";
    }

    @RequestMapping("/archive")
    public String archivePage(){
        return "archive";
    }

    @RequestMapping("/single")
    public String singlePage(){
        return "single";
    }

    @RequestMapping("/contact")
    public String contactPage(){
        return "contact-us";
    }
}

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
    @RequestMapping("/")
    public String mainPage(){
        return "index";
    }
}

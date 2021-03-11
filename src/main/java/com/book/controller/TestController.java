package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test/t1")
    public ModelAndView test(){
        return new ModelAndView("/test");
    }

    @GetMapping("test/t2")
    @ResponseBody
    public Map test2(){
        Map m = new HashMap();
        m.put("test","测试");
        return m;
    }
}

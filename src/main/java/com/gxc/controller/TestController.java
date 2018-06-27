package com.gxc.controller;

import com.gxc.bean.Test;
import com.gxc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("getList")
    public ModelAndView getList(Map<String, Object> map){
        List<Test> list = testService.getList();
        map.put("list", list);
        return new ModelAndView("list", map);
    }

    @RequestMapping("index")
    public ModelAndView index(Map<String, Object> map){
        return new ModelAndView("index", map);
    }
}

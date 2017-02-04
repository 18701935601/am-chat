package com.am.chat.springmvc.controller;

import com.am.chat.common.util.JedisUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhangpeng12 on 2017/2/4.
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
    private static Logger logger = LogManager.getLogger(HelloWorldController.class);

    // 跳转到聊天室页面
    @RequestMapping(value = "/testJedis", method = RequestMethod.GET)
    public String testJedis(@RequestParam(value="id")Integer id,@RequestParam(value="id")Integer score) {
       return JedisUtil.set(String.valueOf(id),100,String.valueOf(score));
    }
}

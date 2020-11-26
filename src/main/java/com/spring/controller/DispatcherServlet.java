package com.spring.controller;

import com.spring.controller.frontend.MainPageController;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1.拦截所有请求
 * 2.解析请求
 * 3.派发给对应的Controller里面的方法进行处理
 */
@Slf4j
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("拦截所有请求");
        if ("/frontend/getmainpageinfo".equals(req.getServletPath()) && "GET".equals(req.getMethod())) {
            log.debug("/frontend/getmainpageinfo请求");
            new MainPageController().getMainPageInfo(req, resp);
        }
    }
}

package com.atguigu.cloud.controller;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyRequestOriginParser
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/19 - 15:44
 * @Version: v1.0
 */

@Component
public class MyRequestOriginParser implements RequestOriginParser {

    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getParameter("serverName");
    }
}

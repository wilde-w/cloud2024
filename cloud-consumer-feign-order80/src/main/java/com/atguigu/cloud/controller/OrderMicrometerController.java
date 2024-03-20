package com.atguigu.cloud.controller;

import com.atguigu.cloud.api.PayFeignApi;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OrderMicrometerController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/14 - 15:38
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderMicrometerController
{
    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping(value = "/feign/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id)
    {
        return payFeignApi.myMicrometer(id);
    }
}


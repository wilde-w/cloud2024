package com.atguigu.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * ClassName: FlowLimitService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/18 - 13:03
 * @Version: v1.0
 */
@Service
public class FlowLimitService
{
    @SentinelResource(value = "common")
    public void common()
    {
        System.out.println("------FlowLimitService come in");
    }
}

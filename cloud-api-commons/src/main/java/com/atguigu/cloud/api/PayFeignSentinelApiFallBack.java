package com.atguigu.cloud.api;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * ClassName: PayFeignSentinelApiFallBack
 * Package: com.atguigu.cloud.api
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/19 - 18:06
 * @Version: v1.0
 */

@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}

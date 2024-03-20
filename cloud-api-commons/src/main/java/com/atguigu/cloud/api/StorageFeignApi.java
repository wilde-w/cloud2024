package com.atguigu.cloud.api;

import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: StorageFeignApi
 * Package: com.atguigu.cloud.api
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/20 - 19:22
 * @Version: v1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageFeignApi
{
    /**
     * 扣减库存
     */
    @PostMapping(value = "/storage/decrease")
    ResultData decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

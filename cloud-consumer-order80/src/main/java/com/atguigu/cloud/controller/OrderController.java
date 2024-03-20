package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.ResultSetMetaData;

/**
 * ClassName: OrderController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/10 - 16:24
 * @Version: v1.0
 */

@RestController
public class OrderController {

//    public static final String PaymentSrv_URL = "http://localhost:8001";
    public static final String PaymentSrv_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO){

        return restTemplate.postForObject(PaymentSrv_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping(value = "/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){

        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/" + id,  ResultData.class,id);
    }

    @GetMapping(value = "/consumer/pay/get/info")
    private String getInfoByConsul()
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/info", String.class);
    }

    @PutMapping(value = "/consumer/pay/update")
    public ResultData updateOrderPay(PayDTO payDTO){

        return restTemplate.postForObject(PaymentSrv_URL + "/pay/update",payDTO,ResultData.class);
    }

    @DeleteMapping(value = "/consumer/pay/delete/{id}")
    public ResultData deleteOrder(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/delete/" + id, ResultData.class);
    }
}

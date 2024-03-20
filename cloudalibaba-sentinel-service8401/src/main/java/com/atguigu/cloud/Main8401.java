package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: ${NAME}
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author: 王德举
 * @Create: ${DATE} - ${TIME}
 * @Version: v1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Main8401 {
    public static void main(String[] args) {

        SpringApplication.run(Main8401.class,args);
    }
}
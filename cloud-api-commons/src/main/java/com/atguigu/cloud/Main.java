package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * ClassName: ${NAME}
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author: 王德举
 * @Create: ${DATE} - ${TIME}
 * @Version: v1.0
 */
public class Main {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

    }
}
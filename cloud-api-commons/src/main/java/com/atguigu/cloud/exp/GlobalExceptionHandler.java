package com.atguigu.cloud.exp;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.atguigu.cloud.exp
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/11 - 21:06
 * @Version: v1.0
 */


@Slf4j
//@RestControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(RuntimeException.class)
        @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
        public ResultData<String> exception(Exception e){

            System.out.println("come in GlobalExceptionHandller");
            log.error("全局异常信息：{}",e.getMessage(),e);

            return ResultData.fail(ReturnCodeEnum.RC500.getCode(), e.getMessage());
        }

}

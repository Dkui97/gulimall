package com.atguigu.gulimall.product.exception;

import com.atguigu.common.exception.BizCodeEnum;
import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dkui
 * @Date 2024/5/16 10:26
 * @Description: `@ControllerAdvice`标注在类上，通过“basePackages”能够说明处理哪些路径下的异常。
 * `@ExceptionHandler(value = 异常类型.class) `标注在方法上
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller") //管理的controller
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException exception) {
        Map<String, String> map = new HashMap<>();
        // 获取数据校验的错误结果
        BindingResult bindingResult = exception.getBindingResult();
        // 处理错误
        bindingResult.getFieldErrors().forEach(fieldError -> {
            String message = fieldError.getDefaultMessage();
            String field = fieldError.getField();
            map.put(field, message);
        });

        log.error("数据校验出现问题{},异常类型{}", exception.getMessage(), exception.getClass());

        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(),
                BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", map);
    }


    @ExceptionHandler(value = Exception.class)//异常的范围更大
    public R handleException(Exception e){
        log.error("未知异常{},异常类型{}",
                e.getMessage(),
                e.getClass());
        return R.error(BizCodeEnum.UNKNOW_EXEPTION.getCode(),
                BizCodeEnum.UNKNOW_EXEPTION.getMsg());
    }
}

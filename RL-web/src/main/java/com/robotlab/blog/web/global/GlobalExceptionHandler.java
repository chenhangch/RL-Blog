package com.robotlab.blog.web.global;

import com.robotlab.blog.api.model.exception.BusinessException;
import com.robotlab.blog.api.model.vo.ResVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public ResVo<String> handlerAdviceException(BusinessException ex){
        return ResVo.fail(ex.getStatus());
    }
}

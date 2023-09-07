package com.robotlab.blog.web.global;

import com.robotlab.blog.api.model.exception.BusinessException;
import com.robotlab.blog.api.model.vo.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  全局异常处理
 */
@Slf4j
@Order(-99)
public class SystemExceptionHandler implements HandlerExceptionResolver {

    /** 全局异常处理
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {


        return null;
    }

    private Status buildToastMsg(Exception ex) {
        if (ex instanceof BusinessException) {
            return ((BusinessException) ex).getStatus();
        }
        return null;
    }

    private boolean restResponse(HttpServletRequest req, HttpServletResponse resp) {

        return false;
    }
}

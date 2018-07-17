package cn.edu.zut.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/16 16:34
 */

@ControllerAdvice
public class GlobalExceptionHAndler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest req,Exception e){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        modelMap.put("success",false);
        modelMap.put("errorMsg",e.getMessage());
        return modelMap;
    }
}

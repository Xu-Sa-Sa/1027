package cn.edu.zut.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/15 15:17
 */
@RestController
public class hello {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){
        return  "hello";
    }
}

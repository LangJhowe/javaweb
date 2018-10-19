package cn.jhowe.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/user")
public class UserController {

	@RequestMapping(value = "hello", method = RequestMethod.GET) 
    @ResponseBody //Ҫ����json����
    public Map login(HttpSession httpSession) {
        Map<String, Object> map = new HashMap<String, Object>();

        try {
          map.put("errorCode", 0);
          map.put("message", "hello");
        } catch (Exception e) {
            map.put("errorCode", 1);
            map.put("errorMessage", "δ֪����");
        }
        return map;
    }
}
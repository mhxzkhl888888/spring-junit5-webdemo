package com.example.demo;

/**
 * Created by 风清扬 on 2020/1/12.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/user")
    public @ResponseBody String getUser() {
        return "keny风清扬";
    }

}

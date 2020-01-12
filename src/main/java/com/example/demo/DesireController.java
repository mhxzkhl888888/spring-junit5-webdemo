package com.example.demo;

import com.example.demo.service.DesireService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DesireController {

    private final DesireService service;

    public DesireController(DesireService service) {
        this.service = service;
    }

    @RequestMapping("/desire")
    public @ResponseBody String desire() {
        return service.desire();
    }

}

package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {


    @GetMapping("callback")
    public String callback(@RequestParam("code") String code,
                           @RequestParam("state") String state){



        return "index";
    }
}

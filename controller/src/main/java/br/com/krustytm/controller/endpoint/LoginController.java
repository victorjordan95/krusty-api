package br.com.krustytm.controller.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    public String index() {
        return "login index";
    }

    @RequestMapping("/doLogin")
    public String login() {
        return "login action";
    }

    @RequestMapping("/doLogout")
    public String logout() {
        return "logout action";
    }
}

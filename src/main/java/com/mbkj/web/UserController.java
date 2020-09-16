package com.mbkj.web;

import com.mbkj.entity.User;
import com.mbkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<User> list = service.selectAll();
        model.addAttribute("list", list);
        return "list";// WEB-INF/jsp/"list".jsp
    }

}

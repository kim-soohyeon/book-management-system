package com.example.bookmanagementsystembo.common.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @GetMapping("/list")
    public String list() {
        return "menu_list";
    }

}

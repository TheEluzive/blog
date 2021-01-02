package com.sitespring.blog.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog-main")
    public String blog(Model model){
        model.addAttribute("title", "Блог");
        return "/blog-main";
    }
}

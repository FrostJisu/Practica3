
package com.Practica3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String paginaInicio(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
}

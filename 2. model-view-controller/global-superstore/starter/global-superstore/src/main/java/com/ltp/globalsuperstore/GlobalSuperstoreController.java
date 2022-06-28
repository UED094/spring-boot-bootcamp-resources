package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class GlobalSuperstoreController {

    @GetMapping("/")
    public String getForm(Model model) {

        model.addAttribute("categories",Constants.CATEGORIES);
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        return "inventory";
    }
}

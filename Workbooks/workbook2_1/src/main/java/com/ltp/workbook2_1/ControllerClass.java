package com.ltp.workbook2_1;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class ControllerClass {
    
    @GetMapping("/imdb")
    public String controllerMView() {
        return "shows";
        
    }
}

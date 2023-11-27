package com.Extra_Extra_Vision.Rentalsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // This should match the name of your HTML file in 'src/main/resources/templates'
    }
}

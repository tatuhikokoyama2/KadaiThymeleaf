package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    @GetMapping("/output")
    public String postOutput(String previous, Model model) {
        //System.out.println(previous);
        model.addAttribute("previous", previous);


        return "output";
    }
}

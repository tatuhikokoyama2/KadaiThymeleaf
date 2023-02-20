package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {
    @GetMapping("/input")
    public String getInput(String previous, Model model) {
        //System.out.println(previous);
        model.addAttribute("previous", previous);
        return "input";
    }

    @PostMapping("/output")
    public String postForm(@RequestParam("previous") String previous, Model model) {
        //フォームから送信された値をModelに登録
        model.addAttribute("previous", previous);
        //output.htmlに画面遷移
        return "/output";
    }

}

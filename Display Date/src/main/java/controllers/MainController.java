package org.example.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/data")
    public String dataTemplate(Model model) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d,yyyy", Locale.ENGLISH);
        model.addAttribute("currentDate", sdf.format(now));
        return "data";
    }

    @GetMapping("/time")
    public String timeTemplate(Model model) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
        model.addAttribute("currentTime", sdf.format(now));
        return "time";
    }
}

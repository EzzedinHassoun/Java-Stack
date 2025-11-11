package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String main(
            @RequestParam("number") String number,
            @RequestParam("city") String city,
            @RequestParam("person") String person,
            @RequestParam("hobby") String hobby,
            @RequestParam("animal") String animal,
            @RequestParam("nice") String nice,
            HttpSession session
    ) {
        // حفظ جميع القيم في الجلسة
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("animal", animal);
        session.setAttribute("nice", nice);
        return "redirect:/show";
    }

    @RequestMapping("/show")
    public String show() {
        return "show.jsp";
    }

    @RequestMapping("/")
    public String index() {
        return "mainPage.jsp";
    }
}

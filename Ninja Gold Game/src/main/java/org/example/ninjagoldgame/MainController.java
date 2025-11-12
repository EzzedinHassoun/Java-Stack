package org.example.ninjagoldgame;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
        }
        if (session.getAttribute("activities") == null) {
            session.setAttribute("activities", new ArrayList<String>());
        }

        model.addAttribute("gold", session.getAttribute("gold"));
        model.addAttribute("activities", session.getAttribute("activities"));

        return "index";
    }

    @PostMapping("/process")
    public String process(@RequestParam("place") String place, HttpSession session) {
        Random rand = new Random();
        int goldChange = 0;

        switch (place) {
            case "farm":
                goldChange = rand.nextInt(11) + 10;
                break;
            case "cave":
                goldChange = rand.nextInt(6) + 5;
                break;
            case "house":
                goldChange = rand.nextInt(4) + 2;
                break;
            case "quest":
                goldChange = rand.nextInt(101) - 50;
                break;
            default:
                goldChange = 0;
        }

        int gold = (int) session.getAttribute("gold") + goldChange;
        session.setAttribute("gold", gold);

        @SuppressWarnings("unchecked")
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd yyyy h:mm a"));
        String message;
        if (goldChange >= 0) {
            message = String.format("You entered a %s and earned %d gold! (%s)", place, goldChange, time);
        } else {
            message = String.format("You entered a %s and lost %d gold! (%s)", place, Math.abs(goldChange), time);
        }

        activities.add(0, message);
        session.setAttribute("activities", activities);

        return "redirect:/";
    }

    @PostMapping("/reset")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}

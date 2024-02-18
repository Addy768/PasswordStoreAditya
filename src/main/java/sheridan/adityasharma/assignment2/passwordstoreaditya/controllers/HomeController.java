package sheridan.adityasharma.assignment2.passwordstoreaditya.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage() {
        return "index"; // Return the name of the HTML template (index.html)
    }

    @PostMapping("/add")
    public String addPassword(@RequestParam String title, @RequestParam String username,
                              @RequestParam String password, @RequestParam String url,
                              @RequestParam String email, @RequestParam String notes,
                              Model model)
    {
        return "index";

    }


}

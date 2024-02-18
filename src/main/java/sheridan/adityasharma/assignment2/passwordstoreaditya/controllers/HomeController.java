package sheridan.adityasharma.assignment2.passwordstoreaditya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.service.PasswordService;

@Controller
public class HomeController {

    @Autowired
    private PasswordService service;

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @PostMapping("/add")
    public String addPassword(Model model, @ModelAttribute PasswordRecord record)
    {

        System.out.println("Starting entry of add");
        service.addRecord(record);
        return "index";

    }


}

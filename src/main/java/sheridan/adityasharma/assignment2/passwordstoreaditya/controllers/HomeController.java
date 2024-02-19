package sheridan.adityasharma.assignment2.passwordstoreaditya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.service.PasswordService;
import sheridan.adityasharma.assignment2.passwordstoreaditya.utilities.TitleUtilities;

import java.util.List;

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
    @GetMapping("/recordpage")
    public String showRecordPage(Model model) {
        model.addAttribute("records", service.getAllRecords());
        return "viewPasswordRecord"; // Assuming your template name is "viewPasswordRecord.html"
    }
    @GetMapping("/product")
    public String product(Model model) {
        List<PasswordRecord> records = service.getAllRecords();
        model.addAttribute("records", records);
        return "viewPasswordRecord"; // Assuming "product.html" template iterates through "records" attribute
    }


    @GetMapping("/searchByTitle")
    public String searchByTitle(Model model, @ModelAttribute TitleUtilities titleUtilities) {
        String searchTitle = titleUtilities.getSearchTitle();
        List<PasswordRecord> searchResults = service.searchByTitle(searchTitle);
        if (searchResults.isEmpty()) {
            model.addAttribute("message", "Record Not Found!");
        } else {
            model.addAttribute("searchResults", searchResults);
        }
        return "searchPasswordRecord"; // Assuming the name of the HTML file is searchPasswordRecord.html
    }




}

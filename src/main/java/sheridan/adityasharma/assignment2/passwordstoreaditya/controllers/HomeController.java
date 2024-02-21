package sheridan.adityasharma.assignment2.passwordstoreaditya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.service.PasswordService;
import sheridan.adityasharma.assignment2.passwordstoreaditya.utilities.TitleUtilities;

import java.util.List;

// name = Aditya Sharma
// student id == 991663142
@Controller
public class HomeController {

    @Autowired
    private PasswordService service;

    // This function is responsible for showing the home page when the "/index" URL is accessed.
    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

    // This function is triggered when a POST request is made to the "/add" URL. It adds a new password record to the database.
    @PostMapping("/add")
    public String addPassword(Model model, @ModelAttribute PasswordRecord record)
    {

        System.out.println("Starting entry of add");
        service.addRecord(record);
        return "index";

    }

    // This function is responsible for showing the record page when the "/recordpage" URL is accessed.
    // It fetches all the records from the database and sends them to the view.
    @GetMapping("/recordpage")
    public String showRecordPage(Model model) {
        model.addAttribute("records", service.getAllRecords());
        return "viewPasswordRecord"; // template name is "viewPasswordRecord.html"
    }

    // This function is responsible for showing the view record page when the "/product" URL is accessed.
    // It fetches all the records from the database and sends them to the view.
    @GetMapping("/product")
    public String product(Model model) {
        List<PasswordRecord> records = service.getAllRecords();
        model.addAttribute("records", records);
        return "viewPasswordRecord"; // Assuming "product.html" template iterates through "records" attribute
    }

    // This function is responsible for searching password records by title when the "/searchByTitle" URL is accessed.
    // It fetches the search results from the database and sends them to the view.
    // this handles the search by title page  where user gives the input  and the code handles the input and chekc wether we have the ecord or not if yes then it displays the content otherwise
    // it displays text no record yet
    @GetMapping("/searchByTitle")
    public String searchByTitle(Model model, @ModelAttribute TitleUtilities titleUtilities) {
        String searchTitle = titleUtilities.getSearchTitle();
        List<PasswordRecord> searchResults = service.searchByTitle(searchTitle);
        if (searchResults.isEmpty()) {
            model.addAttribute("message", "no record yet!");
        } else {
            model.addAttribute("searchResults", searchResults);
        }
        return "searchPasswordRecord"; //  the name of the HTML file is searchPasswordRecord.html
    }




}
// name = Aditya Sharma
// student id == 991663142

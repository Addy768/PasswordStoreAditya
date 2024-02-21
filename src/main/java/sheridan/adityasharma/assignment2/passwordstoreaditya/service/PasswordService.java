package sheridan.adityasharma.assignment2.passwordstoreaditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.database.DatabaseAccess;
import  sheridan.adityasharma.assignment2.passwordstoreaditya.utilities.RandomNumberGenerator;

import java.util.List;

// name = Aditya Sharma
// student id == 991663142
@Service
public class PasswordService {

    // Autowired enables you to inject the object dependency implicitly.
    @Autowired
    DatabaseAccess repository;

    // This method is used to add a new record to the database. It generates a unique ID for each record before saving.
    public void addRecord(PasswordRecord passwordRecord) {
        long min = 100_000_000L;
        long max = 999_999_999L;
        passwordRecord.setId(RandomNumberGenerator.generateNineDigitNumber(min, max));
        repository.save(passwordRecord);
    }

    // This method is used to fetch all records from the database
    public List<PasswordRecord> getAllRecords() {
        return repository.findAll();
    }

    // This method is used to search records by title. It fetches records from the database that contain the provided title by the user input.
    public List<PasswordRecord> searchByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

}
// name = Aditya Sharma
// student id == 991663142
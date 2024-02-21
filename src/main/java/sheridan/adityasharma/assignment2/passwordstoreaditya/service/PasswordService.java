package sheridan.adityasharma.assignment2.passwordstoreaditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.database.DatabaseAccess;
import  sheridan.adityasharma.assignment2.passwordstoreaditya.utilities.RandomNumberGenerator;

import java.util.List;

@Service
public class PasswordService {

    @Autowired
    DatabaseAccess repository;

    public void addRecord(PasswordRecord passwordRecord) {
        long min = 100_000_000L;
        long max = 999_999_999L;
        passwordRecord.setId(RandomNumberGenerator.generateNineDigitNumber(min, max));
        repository.save(passwordRecord);
    }

    public List<PasswordRecord> getAllRecords() {
        return repository.findAll();
    }
    public List<PasswordRecord> searchByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

}

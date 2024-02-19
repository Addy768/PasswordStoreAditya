package sheridan.adityasharma.assignment2.passwordstoreaditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.database.DatabaseAccess;

import java.util.List;

@Service
public class PasswordService {

    @Autowired
    DatabaseAccess repository;

    public void addRecord(PasswordRecord passwordRecord){
        System.out.println("in service class method");
        repository.save(passwordRecord);
    }
    public List<PasswordRecord> getAllRecords() {
        return repository.findAll();
    }
    public List<PasswordRecord> searchByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

}

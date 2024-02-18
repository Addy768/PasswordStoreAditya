package sheridan.adityasharma.assignment2.passwordstoreaditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;
import sheridan.adityasharma.assignment2.passwordstoreaditya.database.DatabaseAccess;

@Service
public class PasswordService {

    @Autowired
    DatabaseAccess repository;

    public void addRecord(PasswordRecord passwordRecord){
        System.out.println("in service class method");
        repository.save(passwordRecord);
    }

}

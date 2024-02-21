package sheridan.adityasharma.assignment2.passwordstoreaditya.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;

import java.util.List;
// name = Aditya Sharma
// student id == 991663142
@Repository
public interface DatabaseAccess extends JpaRepository<PasswordRecord, Long> {
    List<PasswordRecord> findByTitleContaining(String keyword);

}
// name = Aditya Sharma
// student id == 991663142

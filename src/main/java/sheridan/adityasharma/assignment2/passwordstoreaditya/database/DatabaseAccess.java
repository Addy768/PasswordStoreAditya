package sheridan.adityasharma.assignment2.passwordstoreaditya.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;

import java.util.List;

@Repository
public interface DatabaseAccess extends JpaRepository<PasswordRecord, Long> {
    List<PasswordRecord> findByTitleContaining(String keyword);

}

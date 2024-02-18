package sheridan.adityasharma.assignment2.passwordstoreaditya.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;

@Repository
public interface DatabaseAccess extends JpaRepository<PasswordRecord, Long> {
}

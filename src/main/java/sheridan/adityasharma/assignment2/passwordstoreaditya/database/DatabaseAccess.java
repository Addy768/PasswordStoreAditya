package sheridan.adityasharma.assignment2.passwordstoreaditya.database;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridan.adityasharma.assignment2.passwordstoreaditya.beans.PasswordRecord;

public interface DatabaseAccess extends JpaRepository<PasswordRecord, Long> {
}

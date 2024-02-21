package sheridan.adityasharma.assignment2.passwordstoreaditya.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.concurrent.ThreadLocalRandom;


// name = Aditya Sharma
// student id == 991663142
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "password")
public class PasswordRecord {

    @Id
    @NonNull
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // An autogenerated 9-digit identifier number

    private String title; // Title of the password record
    private String username; // Username for the password record
    private String password; // Password for the password record
    private String url; // URL associated with the password record
    private String email; // Email associated with the password record
    private String notes; // Additional notes for the password record

    public void generateId() {
        long min = 100_000_000L;
        long max = 999_999_999L;
        //this.id = id + min;
        this.id = ThreadLocalRandom.current().nextLong(min, max);
    }
}
// name = Aditya Sharma
// student id == 991663142

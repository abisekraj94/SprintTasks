package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${vault.mysql.local.password}")
    private String mysqlPassword;

    // Use the password for database connection or any other purpose
    public void usePassword() {
        System.out.println("Password: " + mysqlPassword);
    }
}

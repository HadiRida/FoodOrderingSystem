package user;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class UserRegistration {
    private String username;
    private String password;

    public UserRegistration(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        try {
            String path = System.getProperty("user.dir") + ".\\src\\user\\UserRegistration.txt";
            String text = (username + "-" + password + "\n");
            System.out.println("User registered successfully.");
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);

            
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

package user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserAuthentication {
    private String username;
    private String password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void authenticateUser() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\user\\UserRegistration.txt"));
            String line;
            boolean authenticated = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length >= 2) { 
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        authenticated = true;
                        break;
                    }
                }
            }
            reader.close();
            if (authenticated) {
                System.out.println("Authentication successful.");
            } else {
                System.out.println("Authentication failed. Please check your username and password.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

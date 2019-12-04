package mFinanceUserInformation;

import java.io.Serializable;

public class UserCredentials implements Serializable {

    private String username;
    private String password;

    /**
     * Constructor
     * @param username
     * @param password
     */
    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the username attribute
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * sets the username attribute
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * gets the password attribute
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets the password attribute
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

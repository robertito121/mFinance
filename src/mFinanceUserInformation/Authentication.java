package mFinanceUserInformation;

/**
 *
 * @author julian
 */
public class Authentication {
    private String userName;
    private String password;

    /**
     *Retrieves a user name
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *Sets a user name
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *Retrieves a password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password for user
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *Used to create a new user name password combination
     * @param userName
     * @param password
     */
    public Authentication(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    
}

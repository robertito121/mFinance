package mFinanceUserInformation;

/**
 * @author Roberto Gonzales
 */
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private UserCredentials credentials;


    /**
     * Constructor
     * @param firstName
     * @param lastName
     */
    public User(String firstName, String lastName, String phoneNumber, String emailAddress, UserCredentials credentials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.credentials = credentials;

    }

    /**
     * Get the FirstName attribute of the user
     * @return FirstName of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the FirstName attribute of the user
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the lastName attribute of the user
     * @return LastName of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the LastName attribute of the user
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the credentials
     */
    public UserCredentials getCredentials() {
        return credentials;
    }

    /**
     * @param credentials the credentials to set
     */
    public void setCredentials(UserCredentials credentials) {
        this.credentials = credentials;
    }
}

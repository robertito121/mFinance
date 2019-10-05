package mFinanceUserInformation;

/**
 * @author Roberto Gonzales
 */
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;


    /**
     * Constructor
     * @param firstName
     * @param lastName
     */
    public User(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;

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
}

package mFinanceUserInformation;

/**
 * @author Roberto Gonzales
 */
public class Customer extends User {

    private String customerId;
    private Address address;

    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     */
    public Customer(String firstName, String lastName, String customerId, Address address, String phoneNumber, String emailAddress, UserCredentials credentials) {
        super(firstName, lastName, phoneNumber, emailAddress, credentials);
        this.customerId = customerId;
        this.address = address;
    }

    /**
     * Gets the address attribute of the user
     * @return the users Address object
     * @see Address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address attribute of the user
     * @param address object
     * @see Address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * sets the customerId attribute
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * gets the customerId attribute
     * @return String
     */
    public String getCustomerId() {
        return customerId;
    }
}

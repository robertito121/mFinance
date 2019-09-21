package nFinanceUserInformation;

public class Customer extends User {

    private Address address;
    private String phoneNumber;

    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     */
    public Customer(String firstName, String lastName, Address address, String phoneNumber) {
        super(firstName, lastName);
        this.address = address;
        this.phoneNumber = phoneNumber;
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
     * Gets the phone number attribute of the user
     * @return the users phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets the phone number attribute of the user
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

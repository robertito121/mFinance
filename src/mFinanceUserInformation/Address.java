package mFinanceUserInformation;

/**
 * @author Roberto Gonzales
 */
public class Address {

    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;

    /**
     * Constructor
     * @param streetNumber
     * @param streetName
     * @param city
     * @param state
     * @param zipCode
     */
    public Address(int streetNumber, String streetName, String city, String state, int zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Gets the street number attribute of the Address Object
     * @return the street number of the Address
     */
    public int getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the street number attribute of the Address Object
     * @param streetNumber
     */
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * Gets the street name attribute of the Address Object
     * @return the street name of the address
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name attribute of the Address Object
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Gets the city attribute of the Address Object
     * @return city of the address
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city attribute of the Address Object
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state attribute of the Address Object
     * @return the state of the address
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state attribute of the Address Object
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zip code attribute of the Address Object
     * @return the zip code of the address
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zip code attribute of the Address Object
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

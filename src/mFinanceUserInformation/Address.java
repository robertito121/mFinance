package mFinanceUserInformation;

import java.io.Serializable;

/**
 * @author Roberto Gonzales
 */
public class Address implements Serializable {

    private String streetAddress;
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
    public Address(String streetAddress, String city, String state, int zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

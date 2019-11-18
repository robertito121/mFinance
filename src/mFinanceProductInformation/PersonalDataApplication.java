/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mFinanceProductInformation;


public class PersonalDataApplication {
    private String socialSecurity;
    private String householdIncome;
    private String maritalStatus;
    private String propertyOwnership;
    private String employment;
    private String jobTitle;

    public PersonalDataApplication(String socialSecurity, String householdIncome, String maritalStatus, String propertyOwnership, String employment, String jobTitle) {
        this.socialSecurity = socialSecurity;
        this.householdIncome = householdIncome;
        this.maritalStatus = maritalStatus;
        this.propertyOwnership = propertyOwnership;
        this.employment = employment;
        this.jobTitle = jobTitle;
    }

    /**
     * @return the socialSecurity
     */
    public String getSocialSecurity() {
        return socialSecurity;
    }

    /**
     * @param socialSecurity the socialSecurity to set
     */
    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    /**
     * @return the householdIncome
     */
    public String getHouseholdIncome() {
        return householdIncome;
    }

    /**
     * @param householdIncome the householdIncome to set
     */
    public void setHouseholdIncome(String householdIncome) {
        this.householdIncome = householdIncome;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the propertyOwnership
     */
    public String getPropertyOwnership() {
        return propertyOwnership;
    }

    /**
     * @param propertyOwnership the propertyOwnership to set
     */
    public void setPropertyOwnership(String propertyOwnership) {
        this.propertyOwnership = propertyOwnership;
    }

    /**
     * @return the employment
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * @param employment the employment to set
     */
    public void setEmployment(String employment) {
        this.employment = employment;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
}

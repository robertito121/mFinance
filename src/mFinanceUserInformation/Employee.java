package mFinanceUserInformation;

/**
 *
 * @author julian
 */
public class Employee extends User {
    private String emailAddress;
    private String employeeId;
    private String phoneNumber;
    private String department;
    private String jobTitle;

    /**
     *Retrieves an employee's email address
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     *Sets an employee's email address
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     *Retrieves an employee's ID
     * @return
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     *Retrieves a employee's ID
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     *Retrieves an employee's phone number
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *Sets an employee's phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *Retrieves an employee's department
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     *Sets an employee's department
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     *Retrieves an employee's job title
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     *Sets an employee's job title
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     *Used to create a new employee
     * @param emailAddress
     * @param employeeId
     * @param phoneNumber
     * @param department
     * @param jobTitle
     * @param firstName
     * @param lastName
     */
    public Employee(String emailAddress, String employeeId, String phoneNumber, String department, String jobTitle, String firstName, String lastName) {
        super(firstName, lastName);
        this.emailAddress = emailAddress;
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.jobTitle = jobTitle;
    }
    
    
    

}

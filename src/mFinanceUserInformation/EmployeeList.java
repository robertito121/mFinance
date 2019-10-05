package mFinanceUserInformation;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeList {

    private static HashMap<String, Employee> employeesMap;

    /**
     * return a list of Employees given a set of employee Ids
     * @param ids
     * @return ArrayList</Employee> that yields Employee objects
     * @see Employee
     */
    public static ArrayList<Employee> getEmployeeListByID(String ... ids) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (String id : ids) {
           employees.add(employeesMap.get(id));
        }
        return employees;
    }

    /**
     * gets the Employees Map
     * @return HashMap</String, Employee> that yields Employee objects as values with employeeId as
     * their corresponding keys
     */
    public static HashMap<String, Employee> getEmployeesMap() {
        return employeesMap;
    }

    /**
     * sets the Employees Map
     * @param employeesMap
     */
    public static void setEmployeesMap(HashMap<String, Employee> employeesMap) {
        EmployeeList.employeesMap = employeesMap;
    }
}

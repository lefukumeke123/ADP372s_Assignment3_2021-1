
/* EmployeeFactory.java
   Factory for the Employee
   Author: Marvin Lamohr (214273830)
   Date: 11 June 2021
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Employee;
import za.ac.cput.Util.GenericHelper;

public class EmployeeFactory {

    public static Employee createEmployee(String employeeName, String employeeAddress, String employeeID, String employeeEmail, String position){

        String employeeId = GenericHelper.generateId();

        Employee employee = new Employee.Builder().
                                setEmployeeName(employeeName).
                                setEmployeeAddress(employeeAddress).
                                setEmployeeID(employeeID).
                                setEmployeeEmail(employeeEmail).
                                setPosition(position).
                                build();

                                return employee;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author jbehrend4
 */
public class Company {
    
    private Manager hiringManager = new Manager();
    
    public void hireEmployee(String employeeFirstName, String employeeLastName, String socialSecurityNumber) {
        hiringManager.employeeInformation(employeeLastName, employeeLastName, employeeLastName);
    } 
    
    public void employeeOrientation(String cubicle) {
        hiringManager.employeeOrientation(cubicle);    
    }
    
    public void getEmployeeInformation() {
        hiringManager.getEmployeeInformation();
    }
}

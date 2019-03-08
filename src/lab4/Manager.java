
package lab4;

public class Manager {
    private final String REQUIRED_MSG = " is mandatory ";
    private String employeeFirstName;
    private String employeeLastName;
    private String socialSecurityNumber;
    private Employee e;
    private EmployeeReportService ers;
    
    public void employeeInformation(String eFN, String eLN, String ssn) {
        setEmployeeFirstName(eFN);
        setEmployeeLastName(eLN);
        setSocialSecurityNumber(ssn);
        e = new Employee (employeeFirstName, employeeLastName, socialSecurityNumber);
    }
    
    public void employeeOrientation(String cubicle) {
        e.doFirstTimeOrientation(cubicle);
    }
    
    public void getEmployeeInformation() {
        ers = new EmployeeReportService();
        ers.addData(employeeFirstName);
        ers.addData(employeeLastName);
        ers.addData(socialSecurityNumber);
        ers.outputReport();
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        if (employeeFirstName == null || employeeFirstName.isEmpty()) {
            throw new IllegalArgumentException("first name" + REQUIRED_MSG);
        }        
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        if (employeeLastName == null || employeeLastName.isEmpty()) {
            throw new IllegalArgumentException("last name" + REQUIRED_MSG);
        }
        this.employeeLastName = employeeLastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber == null || socialSecurityNumber.length() < 9 || socialSecurityNumber.length() > 11) {
            throw new IllegalArgumentException("ssn" + REQUIRED_MSG
                    + "and must be between 9 and 11 characters (if hyphens are used)");
        }
    }    
}

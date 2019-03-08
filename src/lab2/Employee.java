package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public -Done
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods. -Done
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code -Done
 *    4. All method parameters should be validated. -Done
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    private String orientationDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);   
        return fmtDate;
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        String date = orientationDate();      
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + date);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        String date = orientationDate();          
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + date);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    private void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        String date = orientationDate();         
        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + date);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    private void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        String date = orientationDate();           
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + date);
    }
    
    public void employeeIntroduction(String cubicle) {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubicle);
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("A first name is required!");
        }
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            System.out.println("A last name is required!");
        }        
       this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() > 11 || ssn.length() < 9) {
            System.out.println("A social security number is required that is between nine and eleven characters");
        }
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    
    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        if (orientationDate == null) {
            System.out.println("An orientation date is required.");
        }
        this.orientationDate = orientationDate;
    }
}
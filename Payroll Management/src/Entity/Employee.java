package Entity;

public class Employee {

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNic() {
        return nic;
    }
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getNotificationMeth() {
        return notificationMeth;
    }
    public void setNotificationMeth(String notificationMeth) {
        this.notificationMeth = notificationMeth;
    }
    public String getSalaryClass() {
        return salaryClass;
    }
    public void setSalaryClass(String salaryClass) {
        this.salaryClass = salaryClass;
    }
    public String getTax() {
        return tax;
    }
    public void setTax(String tax) {
        this.tax = tax;
    }
    private String name;
    private String employeeId;
    private String nic;
    private String designation;
    private String gender;
    private String address;
    private String email;
    private String mobile;
    private String division;
    private String salaryClass;
    private String basicsalary;

    public String getBasicsalary() {
        return basicsalary;
    }
    private String accountNumber;
    private String notificationMeth;
    private String tax;

    public void setBasicSalary(String basicsalary) {
       this.basicsalary=basicsalary;
    }
}

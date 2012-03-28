package Entity;

public class Administrator {

    String username;
    String password;
    String employeeid;
    boolean view_employee;
    boolean add_cheque;
    boolean add_edit_employee;
    boolean handle_salary;
    boolean view_notifications;

    public boolean getview_employee(){
        return view_employee;
    }

     public void setview_employee(boolean view_employee) {
        this.view_employee = view_employee;
    }

    public boolean getadd_cheque(){
        return add_cheque;
    }
    public void setadd_cheque(boolean add_cheque) {
        this.add_cheque= add_cheque;
    }
    public boolean getadd_edit_employee(){
        return add_edit_employee;
    }

    public void setadd_edit_employee(boolean add_edit_employee) {
        this.add_edit_employee= add_edit_employee;
    }
    public boolean gethandle_salary(){
        return handle_salary;
    }
    public void sethandle_salary(boolean handle_salary) {
        this.handle_salary=handle_salary;
    }
    public boolean getview_notifications(){
        return view_notifications;
    }

    public void setview_notifications(boolean view_notifications) {
        this.view_notifications=view_notifications;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Administrator(String username, String password, String employeeid, boolean view_employee,boolean add_cheque,boolean add_edit_employee,boolean handle_salary,boolean view_notifications) {
        this.employeeid = employeeid;
        this.username = username;
        this.password = password;
        this.add_cheque=add_cheque;
        this.add_edit_employee=add_edit_employee;
        this.handle_salary=handle_salary;
        this.view_employee=view_employee;
        this.view_notifications=view_notifications;
    }
}

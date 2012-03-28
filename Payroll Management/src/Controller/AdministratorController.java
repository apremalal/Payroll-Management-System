package Controller;

import Entity.Administrator;
import GUI.Bursar;
import Model.AdministratorModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.StringCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class AdministratorController {

    private Bursar bursar;
    private AdministratorModel adminModel;

//        public static void main(String []args){
//        new AdministratorController();
//        }

    public AdministratorController() {
        bursar=new Bursar();
        bursar.setVisible(true);
        bursar.controller=this;
        adminModel=new AdministratorModel();
    }


    public void add() {
        boolean thereIsUserName=false;
            
            Administrator admin = new Administrator(bursar.getjTextFieldUserName().getText(),bursar.getjPasswordField1().getText(),bursar.getjTextFieldEmployeeID().getText(),bursar.getjCheckBox3_view_employee().isSelected(),bursar.getjCheckBox_add_cheque().isSelected(),bursar.getjCheckBox_add_edit_employee().isSelected(),bursar.getjCheckBox_handle_salary().isSelected(),bursar.getjCheckBox_view_notifications().isSelected());

            ResultSet rs=adminModel.searchByUsername(bursar.getjTextFieldUserName().getText());
        try {
            while (rs.next()) {
                try {
                    if ((rs.getObject("username") + "").equals(bursar.getjTextFieldUserName().getText())) {
                        thereIsUserName=true;
                        JOptionPane.showMessageDialog(null,"Username is already registered! Try other.");
                        bursar.getjTextFieldUserName().setText(null);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdministratorController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorController.class.getName()).log(Level.SEVERE, null, ex);
        }

            if(!thereIsUserName){
            if(validateForTicks()&&validationForUserName()&&!(bursar.getjTextFieldEmployeeID().getText()+"").trim().equals("")&&!(bursar.getjTextFieldUserName().getText()+"").trim().equals("")&&!(bursar.getjPasswordField1().getText()+"").trim().equals(""))
            
                adminModel.addAdministrator(admin);

            else
            {
                if(!validationForUserName())
                bursar.getjTextFieldUserName().setText(null);
                JOptionPane.showMessageDialog(null, "Please fill All the fields!");
            }
        }


    }

    private boolean validateForTicks(){

            if(bursar.getjCheckBox3_view_employee().isSelected()||bursar.getjCheckBox_add_cheque().isSelected()||bursar.getjCheckBox_add_edit_employee().isSelected()||bursar.getjCheckBox_handle_salary().isSelected()||bursar.getjCheckBox_view_notifications().isSelected())
                    return true;
            else
                return false;
    }

    private boolean validationForUserName(){

        StringCharacterIterator iterator = new StringCharacterIterator(""+bursar.getjTextFieldUserName().getText());
        char character = iterator.current();
        
        while (character != StringCharacterIterator.DONE ) {

        boolean isValidChar = (Character.isLetter(character) || Character.isDigit(character) || character=='_' || character =='@');

        if (isValidChar==false) {

            JOptionPane.showMessageDialog(null, "Names Can contain only letters, numbers, underscores \"(_)\" and \"(@)\"", "Input Error",JOptionPane.ERROR_MESSAGE);
            return false;
                 }
        character=iterator.next();
        }
        return true;
    }

    public boolean validate(Administrator admin){
                    return false;
                }

    public void searchByUsername(String Username) {

                    ResultSet rs=adminModel.searchByUsername(Username);
                    updateTable(rs);
                    System.out.println();
            }

            public void searchByEmployeeID(int empoyeeID){

            ResultSet rs=adminModel.searchByEmployeeID(empoyeeID);
            updateTable(rs);

            }

    public ResultSet edit_profile(){

        int emp_id=(Integer)bursar.getjTable1().getValueAt(bursar.getjTable1().getSelectedRow(),0 );
        ResultSet rs=adminModel.searchByEmployeeID(emp_id);
        return rs;
        
        }


     public void searchAll(){

         ResultSet rs=adminModel.searchall();
         updateTable(rs);
         
         }


    private void updateTable(ResultSet rs){

            DefaultTableModel model = (DefaultTableModel)bursar.getjTable1().getModel();
            model.setRowCount(0);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>( bursar.getjTable1().getModel());
            bursar.getjTable1().setRowSorter(sorter);


        try {
            while (rs.next()) {

                Object[] ob=new Object[2];
                ob[0]=rs.getObject("employee_id");
                ob[1]=rs.getObject("username");
                model.addRow(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public void remove() {

        adminModel.remove(Integer.parseInt(bursar.getjTextFieldEmployeeID().getText()));
    }

    public void clearWindow(){

        bursar.getjCheckBox3_view_employee().setSelected(false);
        bursar.getjCheckBox_add_cheque().setSelected(false);
        bursar.getjCheckBox_add_edit_employee().setSelected(false);
        bursar.getjCheckBox_handle_salary().setSelected(false);
        bursar.getjCheckBox_view_notifications().setSelected(false);
        bursar.getjTextFieldEmployeeID().setText(null);
        bursar.getjTextFieldUserName().setText(null);
        bursar.getjPasswordField1().setText(null);

    }
}

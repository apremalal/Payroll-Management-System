/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Sandujith
 */
public class Cheques {
    private int employeeId;
    private int chequeId;
    private String chequeNo;
    private double amount;
    private Date date;
    private int espirationDuration;
    private String bankAccNo;
    private String branch;
    private String bank;

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the chequeId
     */
    public int getChequeId() {
        return chequeId;
    }

    /**
     * @param chequeId the chequeId to set
     */
    public void setChequeId(int chequeId) {
        this.chequeId = chequeId;
    }

    /**
     * @return the chequeNo
     */
    public String getChequeNo() {
        return chequeNo;
    }

    /**
     * @param chequeNo the chequeNo to set
     */
    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the espirationDuration
     */
    public int getEspirationDuration() {
        return espirationDuration;
    }

    /**
     * @param espirationDuration the espirationDuration to set
     */
    public void setExpirationDuration(int espirationDuration) {
        this.setEspirationDuration(espirationDuration);
    }

    /**
     * @return the bankAccNo
     */
    public String getBankAccNo() {
        return bankAccNo;
    }

    /**
     * @param bankAccNo the bankAccNo to set
     */
    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @param espirationDuration the espirationDuration to set
     */
    public void setEspirationDuration(int espirationDuration) {
        this.espirationDuration = espirationDuration;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }
 

}

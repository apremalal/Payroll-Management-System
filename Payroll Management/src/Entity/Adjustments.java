/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Sandujith
 */
public class Adjustments {
    private int salaryId;
    private String code;
    private double amount;

    /**
     * @return the salaryId
     */
    public int getSalaryId() {
        return salaryId;
    }

    /**
     * @param salaryId the salaryId to set
     */
    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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
    
}

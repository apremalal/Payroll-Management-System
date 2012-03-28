package Entity;

import java.sql.Date;
import java.sql.Time;

public class Notifications {

    private int employeeId;
    private int notificationId;
    private Date date;
    private Time time;
    private boolean sentSuccess;
    private int chequeId;

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
     * @return the notificationId
     */
    public int getNotificationId() {
        return notificationId;
    }

    /**
     * @param notificationId the notificationId to set
     */
    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
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
     * @return the sentSuccess
     */
    public boolean isSentSuccess() {
        return sentSuccess;
    }

    /**
     * @param sentSuccess the sentSuccess to set
     */
    public void setSentSuccess(boolean sentSuccess) {
        this.sentSuccess = sentSuccess;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
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
}

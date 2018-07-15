/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inspector_Machine.Modal;

import AccountPackage.DataManupulation.Account;
import AccountPackage.DataManupulation.Employee;
import AccountPackage.DataManupulation.User;
import GUI.Login;
import GUI.LoginClass;
import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class InspectorMachine implements Serializable {

    /**
     * @return the machineId
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * @param machineId the machineId to set
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    /**
     * @return the employee
     */
    public Account getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Account employee) {
        this.employee = employee;
    }

    /**
     * @return the loggedInAccount
     */
    public Account getLoggedInAccount() {
        return loggedInAccount;
    }

    /**
     * @param loggedInAccount the loggedInAccount to set
     */
    public void setLoggedInAccount(Account loggedInAccount) {
        this.loggedInAccount = loggedInAccount;
    }

    /**
     * @return the printer
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * @param printer the printer to set
     */
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    private int machineId;
    private Account employee;
    private Account loggedInAccount;
    private Printer printer;
    

    
}

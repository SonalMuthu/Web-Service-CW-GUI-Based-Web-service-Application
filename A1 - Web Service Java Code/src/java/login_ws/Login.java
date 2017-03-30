/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_ws;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuka
 */
@WebService(serviceName = "Login")
public class Login {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_employee")
    public String login(@WebParam(name = "UserName") String UserName, @WebParam(name = "Password") String Password) {
        String result = "Pending";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM EMPLOYEES WHERE UserName = ? AND Password = ?");
            stmt.setString(1, UserName);
            stmt.setString(2, Password);
            ResultSet results = stmt.executeQuery();
            if (results.next()) {
                result = "Login Success";
                con.close();

            } else {
                result = "Login Unsuccess";
                con.close();

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "show_employees")
    public List<Employees> showEmployees() {
        List<Employees> employeeList = new ArrayList();
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Employees");
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String name = results.getString("Name");
                String position = results.getString("Position");
                String username = results.getString("UserName");
                String password = results.getString("Password");
                Employees employee = new Employees(name, position, username, password);
                employeeList.add(employee);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employeeList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete_employee")
    public String delete_employee(@WebParam(name = "userName") String userName) {
        String result = "Unsuccesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM EMPLOYEES WHERE USERNAME = ?");
            stmt.setString(1, userName);
            int i = stmt.executeUpdate();
            result = "Delete Succesful";
            con.close();
        } catch (SQLException e) {
            printStackTrace();
        }
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add_employees")
    public String add_employees(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") 
           String username, @WebParam(name = "password") String password) {
        String result = "Not succesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO EMPLOYEES (Name,Position,UserName,Password)"
                    + "Values (?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, position);
            stmt.setString(3, username);
            stmt.setString(4, password);

            int i = stmt.executeUpdate();
            result = "Insert Succesful";
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update_employee")
    public String update_employee(@WebParam(name = "name") String name, @WebParam(name = "position") String position,
            @WebParam(name = "Newusername") String newUsername, @WebParam(name = "password") String password,
            @WebParam(name = "Oldusername") String oldUsername) {
        String result = "Unsuccesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("UPDATE EMPLOYEES SET NAME = ?,POSITION = ?,USERNAME = ?, PASSWORD= ? WHERE USERNAME = ? ");
            stmt.setString(1, name);
            stmt.setString(2, position);
            stmt.setString(3, newUsername);
            stmt.setString(4, password);
            stmt.setString(5, oldUsername);
            int i = stmt.executeUpdate();
            result = "Update Succesful";
            con.close();
        } catch (SQLException e) {
            printStackTrace();
        }
        return result;
    }

}


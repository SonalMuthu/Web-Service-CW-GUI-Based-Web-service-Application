/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_ws;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import login_ws.Login;

/**
 *
 * @author Manuka
 */
@WebService(serviceName = "Customer_ws")
public class Customer_ws {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "show_Customers")
    public List<Customers> showCustomers() {
        List<Customers> customerList = new ArrayList();
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Customers");
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String name = results.getString("FULLNAME");
                String address = results.getString("ADDRESS");
                String birthDate = results.getString("DATEOFBIRTH");
                String mobile = results.getString("MOBILE");
                String email = results.getString("EMAIL");
                String accountType = results.getString("ACCOUNTTYPE");
                String accountNumber = results.getString("ACCOUNTNUMBER");
                String sortCode = results.getString("SORTCODE");
                String balance = results.getString("BALANCE");
                String card = results.getString("CARD");

                Customers customer = new Customers(name, balance, card, email, address, mobile, birthDate, accountType, accountNumber, sortCode);
                customerList.add(customer);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return customerList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add_Customer")
    public String Add_Customer(@WebParam(name = "name") String name, @WebParam(name = "address") String address,
            @WebParam(name = "mobile") String mobile, @WebParam(name = "dateOfBirth") String dateOfBirth,
            @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType,
            @WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "balance") String balance,
            @WebParam(name = "sortCode") String sortCode, @WebParam(name = "card") String card) {
        String result = "Not succesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Customers (FullName,DateOfBirth,Address,"
                    + "Mobile,Email,AccountType,AccountNumber,SortCode,Balance,Card)"
                    + "Values (?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(3, address);
            stmt.setString(4, mobile);
            stmt.setString(2, dateOfBirth);
            stmt.setString(5, email);
            stmt.setString(6, accountType);
            stmt.setString(7, accountNumber);
            stmt.setString(9, balance);
            stmt.setString(8, sortCode);
            stmt.setString(10, card);

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
    @WebMethod(operationName = "delete_Customer")
    public String delete_Customer(@WebParam(name = "Account_number") String Account_number) {
        String result = "Unsuccesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM CUSTOMERS WHERE ACCOUNTNUMBER = ?");
            stmt.setString(1, Account_number);
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
    @WebMethod(operationName = "edit_Customer")
    public String edit_customer(@WebParam(name = "name") String name,
            @WebParam(name = "address") String address,
            @WebParam(name = "dateOfBirth") String dateOfBirth,
            @WebParam(name = "mobile") String mobile, @WebParam(name = "email") String email,
            @WebParam(name = "accountNumber") String accountNumber) {
        String result = "Unsuccesful";
        try {
            //TODO write your implementation code here:
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cs_cw_db", "cw", "123");
            PreparedStatement stmt = con.prepareStatement("UPDATE CUSTOMERS SET FULLNAME = ?,"
                    + "ADDRESS = ?,MOBILE = ?, DATEOFBIRTH = ?, EMAIL = ? WHERE ACCOUNTNUMBER = ? ");
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, dateOfBirth);
            stmt.setString(4, mobile);
            stmt.setString(5, email);
            stmt.setString(6, accountNumber);
            int i = stmt.executeUpdate();
            result = "Update Succesful";
            con.close();
        } catch (SQLException e) {
            printStackTrace();
        }
        return result;
    }

}

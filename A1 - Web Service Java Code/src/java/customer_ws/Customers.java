/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_ws;

/**
 *
 * @author Manuka
 */
public class Customers {

    private String name;
    private String address;
    private String mobile;
    private String birtDate;
    private String accountType;
    private String accountNumber;
    private String sortCode;
    private String balance;
    private String email;
    private String card;

    Customers(String name, String balance, String card, String email, String address, 
            String mobile, String birthDate, String accountType, String accountNumber, String sortCode) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.birtDate = birthDate;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.email = email;
        this.balance = balance;
        this.card = card;

    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the card
     */
    public String getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the birtDate
     */
    public String getBirtDate() {
        return birtDate;
    }

    /**
     * @param birtDate the birtDate to set
     */
    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the sortCode
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * @param sortCode the sortCode to set
     */
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

}



package com.example.nuedabackend.model;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String bank;
    private double annualIncome;
    private long routingNumber;
    private long accountNumber;
    private int creditScore;

    public Customer(int id, String firstName, String lastName, String bank, double annualIncome, long routingNumber, long accountNumber, int creditScore) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bank = bank;
        this.annualIncome = annualIncome;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.creditScore = creditScore;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBank() {
        return this.bank;
    }

    public double getAnnualIncome() {
        return this.annualIncome;
    }

    public long getRoutingNumber() {
        return this.routingNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public int getCreditScore() {
        return this.creditScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}

package com.lightbytes.ukstudentloanrepaymentcalculator.models;

public interface LoanInterface {
    double calculateInterest();

    double calculateTotalRepayment();

    double calculateMonthlyPayment();
}
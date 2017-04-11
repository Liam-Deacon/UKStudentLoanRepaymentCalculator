package com.lightbytes.ukstudentloanrepaymentcalculator.models;

class Loan implements LoanInterface {
    private double principal;
    private double apr;  // monthly interest rate = apr / 12
    private int payments;  // in months

    public Loan(double initialLoanValue, double apr, int years, int months) {
        this.principal = initialLoanValue;
        this.apr = apr;
        this.payments = years * 12 + months;
    }

    @Override
    public double calculateInterest() {
        return calculateTotalRepayment() - principal;
    }

    @Override
    public double calculateTotalRepayment() {
        return calculateMonthlyPayment() * payments;
    }

    @Override
    public double calculateMonthlyPayment() {
        double r = apr / 100 / 12;
        double P = principal;
        int n = payments;

        // M = P * [r(1+r)^n]/[(1-r)^n -1]
        return P * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    }

}

class Mortgage extends Loan {
    public Mortgage() {

    }

}
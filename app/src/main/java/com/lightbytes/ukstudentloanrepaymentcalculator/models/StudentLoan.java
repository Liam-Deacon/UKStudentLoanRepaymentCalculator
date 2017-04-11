package com.lightbytes.ukstudentloanrepaymentcalculator.models;

import java.util.Collections;
import java.util.HashMap;

class StudentLoanFactory {
    public static final HashMap<Integer, RepaymentPlan> PLANS =
            Collections.unmodifiableMap(
                    new HashMap<Integer, RepaymentPlan>() {{
                        put(1, RepaymentPlan
                    }});

    public StudentLoan createStudentLoan(double salary, int plan) {

    }
}

abstract class RepaymentPlan {
    static double getSalaryRepaymentThreshold() {

    }

    static double getRepaymentPercent() {

    }
}

class Plan1 extends RepaymentPlan {
    public static final double salaryThreshold = 17495;
    public static final double repaymentPercent = 9.;

    private double salary;

    public Plan1(double salary) {
        this.salary = salary;
    }

    public static double getSalaryRepaymentThreshold() {
        return salaryThreshold;
    }

    public static double getRepaymentPercent() {
        return repaymentPercent;
    }
}

class Plan2 extends RepaymentPlan {
    public static final double salaryThreshold = 21000;
    public static final double repaymentPercent = 9.;

    public double salary;

    public Plan2(double salary) {
        this.salary = salary;
    }

    public static double getSalaryRepaymentThreshold() {
        return salaryThreshold;
    }

    public static double getRepaymentPercent() {
        return repaymentPercent;
    }
}

class StudentLoan implements LoanInterface {
    private RepaymentPlan plan;

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public double calculateMonthlyPayment() {
        return 0;
    }

    @Override
    public double calculateTotalRepayment() {
        return 0;
    }
}


// =========================================
// Lab Session 5: Packages and Interfaces
// Topic: edu.bank package with Loan interface
// Author: Gaurav (RV University)
// =========================================

// ----- Package Declaration -----
package edu.bank;

// Interface: Loan
interface Loan {
    double calculateEMI(double principal, double rate, int time);
    void displayLoanDetails(double principal, double rate, int time);
}

// Class: HomeLoan implementing Loan
class HomeLoan implements Loan {

    @Override
    public double calculateEMI(double principal, double rate, int time) {
        rate = rate / (12 * 100); // convert annual rate to monthly
        time = time * 12;         // convert years to months
        double emi = (principal * rate * Math.pow(1 + rate, time)) /
                     (Math.pow(1 + rate, time) - 1);
        return emi;
    }

    @Override
    public void displayLoanDetails(double principal, double rate, int time) {
        System.out.println("🏡 Home Loan Details:");
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Calculated EMI: ₹" + String.format("%.2f", calculateEMI(principal, rate, time)));
        System.out.println("-----------------------------------");
    }
}

// Class: CarLoan implementing Loan
class CarLoan implements Loan {

    @Override
    public double calculateEMI(double principal, double rate, int time) {
        rate = rate / (12 * 100);
        time = time * 12;
        double emi = (principal * rate * Math.pow(1 + rate, time)) /
                     (Math.pow(1 + rate, time) - 1);
        return emi;
    }

    @Override
    public void displayLoanDetails(double principal, double rate, int time) {
        System.out.println("🚘 Car Loan Details:");
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Calculated EMI: ₹" + String.format("%.2f", calculateEMI(principal, rate, time)));
        System.out.println("-----------------------------------");
    }
}

// =========================================
// MAIN CLASS (in default package)
// =========================================

// To compile and run without actual folders, comment the package line above.
// Or, if you want real package structure, create folder edu/bank/ and adjust imports accordingly.

// import edu.bank.*;

public class LoanDemo {
    public static void main(String[] args) {
        // Using interface reference for polymorphism
        Loan homeLoan = new HomeLoan();
        Loan carLoan = new CarLoan();

        System.out.println("=== Banking Loan Management System ===\n");

        homeLoan.displayLoanDetails(500000, 8.5, 15);
        carLoan.displayLoanDetails(800000, 9.0, 5);
    }
}

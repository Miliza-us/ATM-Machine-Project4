/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 1000;
    private double savingBalance = 1000;

    //Set customer number
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    //Get customer number
    public int getCustomerNumber(){
        return customerNumber;
    }

    //Set pin number
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //Get pin number
    public int getPinNumber(){
        return pinNumber;
    }

    //Get checking account balance
    public double getCheckingBalance(){
        return checkingBalance;
    }

    //Get saving account balance
    public double getSavingBalance(){
        return savingBalance;
    }

    //Calculating checking account withdrawal
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculating saving account withdrawal
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //Calculating checking account deposit
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //Calculating saving account deposit
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    //Customer checking account withdraw input
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    //Customer saving account withdraw input
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    //Customer checking account deposit input
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    //Customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
}
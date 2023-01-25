/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    int iselect;

    //Validation login information customer number n pin number
    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(181818, 2003); //You can add more data here by copy-paste data.put
                data.put(191919, 2004);
                data.put(13042022, 2003);

                System.out.println("Welcome to the Gas ATM!");

                System.out.println("Please enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Please enter your Pin Number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Characters. Enter only numbers." + "\n");
                x = 2;
            }
            for (Entry<Integer, Integer> entry : data.entrySet()){
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
        } while (x == 1);
    }

    //Display account type menu with selections
    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Exit");
        System.out.print("Select: ");

        iselect = menuInput.nextInt();

        switch(iselect){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thankyou!");
                break;
            default:
                System.out.println("\n" + "Invalid Input." + "\n");
                getAccountType();
        }
    }

    //Display checking account menu witb selections
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("1. My Balance");
        System.out.println("2. Withdaw");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Select: ");

        iselect = menuInput.nextInt();

        switch(iselect){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thankyou!");
                break;
            default:
                System.out.println("\n" + "Invalid Input" + "\n");
                getChecking();
        }
    }

    //Display saving account menu with selections
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("1. My Balance");
        System.out.println("2. Withdaw");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Select: ");

        iselect = menuInput.nextInt();

        switch(iselect){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thankyou!");
                break;
            default:
                System.out.println("\n" + "Invalid Input" + "\n");
                getSaving();
        }
    }
}

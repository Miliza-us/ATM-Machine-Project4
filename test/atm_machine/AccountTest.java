/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iTozz
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCustomerNumber method, of class Account.
     */
    @Test
    public void testSetCustomerNumber() {
        System.out.println("setCustomerNumber");
        int customerNumber = 0;
        Account instance = new Account();
        int expResult = 0;
        int result = instance.setCustomerNumber(customerNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomerNumber method, of class Account.
     */
    @Test
    public void testGetCustomerNumber() {
        System.out.println("getCustomerNumber");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getCustomerNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPinNumber method, of class Account.
     */
    @Test
    public void testSetPinNumber() {
        System.out.println("setPinNumber");
        int pinNumber = 0;
        Account instance = new Account();
        int expResult = 0;
        int result = instance.setPinNumber(pinNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPinNumber method, of class Account.
     */
    @Test
    public void testGetPinNumber() {
        System.out.println("getPinNumber");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getPinNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckingBalance method, of class Account.
     */
    @Test
    public void testGetCheckingBalance() {
        System.out.println("getCheckingBalance");
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.getCheckingBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSavingBalance method, of class Account.
     */
    @Test
    public void testGetSavingBalance() {
        System.out.println("getSavingBalance");
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.getSavingBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcCheckingWithdraw method, of class Account.
     */
    @Test
    public void testCalcCheckingWithdraw() {
        System.out.println("calcCheckingWithdraw");
        double amount = 0.0;
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.calcCheckingWithdraw(amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcSavingWithdraw method, of class Account.
     */
    @Test
    public void testCalcSavingWithdraw() {
        System.out.println("calcSavingWithdraw");
        double amount = 0.0;
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.calcSavingWithdraw(amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcCheckingDeposit method, of class Account.
     */
    @Test
    public void testCalcCheckingDeposit() {
        System.out.println("calcCheckingDeposit");
        double amount = 0.0;
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.calcCheckingDeposit(amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcSavingDeposit method, of class Account.
     */
    @Test
    public void testCalcSavingDeposit() {
        System.out.println("calcSavingDeposit");
        double amount = 0.0;
        Account instance = new Account();
        double expResult = 1000.0;
        double result = instance.calcSavingDeposit(amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCheckingWithdrawInput method, of class Account.
     */
    @Test
    public void testGetCheckingWithdrawInput() {
        System.out.println("getCheckingWithdrawInput");
        Account instance = new Account();
        instance.getCheckingWithdrawInput();
    }

    /**
     * Test of getSavingWithdrawInput method, of class Account.
     */
    @Test
    public void testGetSavingWithdrawInput() {
        System.out.println("getSavingWithdrawInput");
        Account instance = new Account();
        instance.getSavingWithdrawInput();
    }

    /**
     * Test of getCheckingDepositInput method, of class Account.
     */
    @Test
    public void testGetCheckingDepositInput() {
        System.out.println("getCheckingDepositInput");
        Account instance = new Account();
        instance.getCheckingDepositInput();
    }

    /**
     * Test of getSavingDepositInput method, of class Account.
     */
    @Test
    public void testGetSavingDepositInput() {
        System.out.println("getSavingDepositInput");
        Account instance = new Account();
        instance.getSavingDepositInput();
    }
    
}

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
public class OptionMenuTest {
    
    public OptionMenuTest() {
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
     * Test of getLogin method, of class OptionMenu.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetLogin() throws Exception {
        System.out.println("getLogin");
        OptionMenu instance = new OptionMenu();
        instance.getLogin();
    }

    /**
     * Test of getAccountType method, of class OptionMenu.
     */
    @Test
    public void testGetAccountType() {
        System.out.println("getAccountType");
        OptionMenu instance = new OptionMenu();
        instance.getAccountType();
    }

    /**
     * Test of getChecking method, of class OptionMenu.
     */
    @Test
    public void testGetChecking() {
        System.out.println("getChecking");
        OptionMenu instance = new OptionMenu();
        instance.getChecking();
    }

    /**
     * Test of getSaving method, of class OptionMenu.
     */
    @Test
    public void testGetSaving() {
        System.out.println("getSaving");
        OptionMenu instance = new OptionMenu();
        instance.getSaving();
    }
    
}

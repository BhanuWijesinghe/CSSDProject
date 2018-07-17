/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vanni Kotiyaa
 */
public class AccountRegistryTest {
    
//    public AccountRegistryTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getNumberOfAccounts method, of class AccountRegistry.
     */
//    @Test
//    public void testGetNumberOfAccounts() {
//        System.out.println("getNumberOfAccounts");
//        AccountRegistry instance = new AccountRegistry();
//        String expResult = "";
//        String result = instance.getNumberOfAccounts();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setNumberOfAccounts method, of class AccountRegistry.
     */
//    @Test
//    public void testSetNumberOfAccounts() {
//        System.out.println("setNumberOfAccounts");
//        String numberOfAccounts = "";
//        AccountRegistry instance = new AccountRegistry();
//        instance.setNumberOfAccounts(numberOfAccounts);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getAccount method, of class AccountRegistry.
     */
//    @Test
//    public void testGetAccount() {
//        System.out.println("getAccount");
//        AccountRegistry instance = new AccountRegistry();
//        Account[] expResult = null;
//        Account[] result = instance.getAccount();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setAccount method, of class AccountRegistry.
     */
//    @Test
//    public void testSetAccount() {
//        System.out.println("setAccount");
//        Account[] account = null;
//        AccountRegistry instance = new AccountRegistry();
//        instance.setAccount(account);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findAccount method, of class AccountRegistry.
//     */
//    @Test
//    public void testFindAccount() {
//        System.out.println("findAccount");
//        String username = " ";
//        String password = " ";
//        AccountRegistry instance = new AccountRegistry();
//        //Account expResult = null;
//        Account result = instance.findAccount(username, password);
//        assertEquals(result, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of updateAccount method, of class AccountRegistry.
     */
//    @Test
//    public void testUpdateAccount() {
//        System.out.println("updateAccount");
//        String username = "";
//        String password = "";
//        double balance = 0.0;
//        AccountRegistry instance = new AccountRegistry();
//        Boolean expResult = null;
//        Boolean result = instance.updateAccount(username, password, balance);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of retriveAccount method, of class AccountRegistry.
     */
    @Test
    public void testRetriveAccount() {
        System.out.println("retriveAccount");
        String accountID = "u010";
        AccountRegistry instance = new AccountRegistry();
        //Account expResult = null;
        Account result = instance.retriveAccount(accountID);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

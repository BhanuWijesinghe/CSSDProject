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
     * Test of getAccountID method, of class Account.
     */
    @Test
    public void testGetAccountID() {
        System.out.println("getAccountID");
        Account instance = new Account();
        
        String result = instance.getAccountID();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of getCard method, of class Account.
//     */
//    @Test
//    public void testGetCard() {
//        System.out.println("getCard");
//        Account instance = new Account();
//        String expResult = "";
//        String result = instance.getCard();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBalance method, of class Account.
//     */
//    @Test
//    public void testSetBalance() {
//        System.out.println("setBalance");
//        double balance = 0.0;
//        Account instance = new Account();
//        boolean expResult = false;
//        boolean result = instance.setBalance(balance);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsername method, of class Account.
//     */
//    @Test
//    public void testGetUsername() {
//        System.out.println("getUsername");
//        Account instance = new Account();
//        String expResult = "";
//        String result = instance.getUsername();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPassword method, of class Account.
//     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        Account instance = new Account();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTransactionHistory method, of class Account.
//     */
//    @Test
//    public void testGetTransactionHistory() {
//        System.out.println("getTransactionHistory");
//        Account instance = new Account();
//        Transaction_History expResult = null;
//        Transaction_History result = instance.getTransactionHistory();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAccountID method, of class Account.
//     */
//    @Test
//    public void testSetAccountID() {
//        System.out.println("setAccountID");
//        String accountIDs = "";
//        Account instance = new Account();
//        instance.setAccountID(accountIDs);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCard method, of class Account.
//     */
//    @Test
//    public void testSetCard() {
//        System.out.println("setCard");
//        String cards = "";
//        Account instance = new Account();
//        instance.setCard(cards);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBalance method, of class Account.
//     */
//    @Test
//    public void testGetBalance() {
//        System.out.println("getBalance");
//        Account instance = new Account();
//        double expResult = 0.0;
//        double result = instance.getBalance();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of creditBalance method, of class Account.
//     */
//    @Test
//    public void testCreditBalance() {
//        System.out.println("creditBalance");
//        double credits = 0.0;
//        Account instance = new Account();
//        instance.creditBalance(credits);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUsername method, of class Account.
//     */
//    @Test
//    public void testSetUsername() {
//        System.out.println("setUsername");
//        String usernames = "";
//        Account instance = new Account();
//        instance.setUsername(usernames);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPassword method, of class Account.
//     */
//    @Test
//    public void testSetPassword() {
//        System.out.println("setPassword");
//        String passwords = "";
//        Account instance = new Account();
//        instance.setPassword(passwords);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTransactionHistory method, of class Account.
//     */
//    @Test
//    public void testSetTransactionHistory() {
//        System.out.println("setTransactionHistory");
//        Transaction_History transactionHistorys = null;
//        Account instance = new Account();
//        instance.setTransactionHistory(transactionHistorys);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkCredentials method, of class Account.
//     */
//    @Test
//    public void testCheckCredentials() {
//        System.out.println("checkCredentials");
//        String usernames = "";
//        String passwords = "";
//        Account instance = new Account();
//        boolean expResult = false;
//        boolean result = instance.checkCredentials(usernames, passwords);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of debitBalance method, of class Account.
//     */
//    @Test
//    public void testDebitBalance() {
//        System.out.println("debitBalance");
//        double credits = 0.0;
//        Account instance = new Account();
//        instance.debitBalance(credits);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAccountDetails method, of class Account.
//     */
//    @Test
//    public void testGetAccountDetails() {
//        System.out.println("getAccountDetails");
//        String accountId = "";
//        Account instance = new Account();
//        Account expResult = null;
//        Account result = instance.getAccountDetails(accountId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAccountDetails method, of class Account.
//     */
//    @Test
//    public void testSetAccountDetails() {
//        System.out.println("setAccountDetails");
//        String accountID = "";
//        String username = "";
//        String password = "";
//        Account instance = new Account();
//        instance.setAccountDetails(accountID, username, password);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

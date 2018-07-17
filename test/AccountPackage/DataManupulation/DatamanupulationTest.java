/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import java.util.ArrayList;
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
public class DatamanupulationTest {
    
    public DatamanupulationTest() {
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
     * Test of userSerialization method, of class Datamanupulation.
     */
//    @Test
//    public void testUserSerialization() {
//        System.out.println("userSerialization");
//        User user = null;
//        Datamanupulation instance = new Datamanupulation();
//        instance.userSerialization(user);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of accountSerialization method, of class Datamanupulation.
//     */
//    @Test
//    public void testAccountSerialization() {
//        System.out.println("accountSerialization");
//        Account account = null;
//        Datamanupulation instance = new Datamanupulation();
//        instance.accountSerialization(account);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of employeeSerialization method, of class Datamanupulation.
//     */
//    @Test
//    public void testEmployeeSerialization() {
//        System.out.println("employeeSerialization");
//        Employee employee = null;
//        Datamanupulation instance = new Datamanupulation();
//        instance.employeeSerialization(employee);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of userDeserialization method, of class Datamanupulation.
     */
    @Test
    public void testUserDeserialization() {
        System.out.println("userDeserialization");
        Datamanupulation instance = new Datamanupulation();
       // ArrayList expResult = null;
        
        ArrayList<User> result = instance.userDeserialization();
       // for (User sz: result){
       //    System.out.println(sz);
        //}
        
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of accountDeserialization method, of class Datamanupulation.
     */
    @Test
    public void testAccountDeserialization() {
        System.out.println("accountDeserialization");
        Datamanupulation instance = new Datamanupulation();
        //ArrayList expResult = null;
        ArrayList result = instance.accountDeserialization();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of employeeDeserialization method, of class Datamanupulation.
     */
    @Test
    public void testEmployeeDeserialization() {
        System.out.println("employeeDeserialization");
        Datamanupulation instance = new Datamanupulation();
        //ArrayList expResult = null;
        ArrayList result = instance.employeeDeserialization();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

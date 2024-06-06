/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Tbluser;

/**
 *
 * @author Adit
 */
public class DAOuserTest {
    
    public DAOuserTest() {
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
     * Test of retrveTbluser method, of class DAOuser.
     */
    @Test
    public void testRetrveTbluser() {
        System.out.println("retrveTbluser");
        DAOuser instance = new DAOuser();
        List<Tbluser> expResult = null;
        List<Tbluser> result = instance.retrveTbluser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbyID method, of class DAOuser.
     */
    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        String idU = "";
        DAOuser instance = new DAOuser();
        List<Tbluser> expResult = null;
        List<Tbluser> result = instance.getbyID(idU);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class DAOuser.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        Integer idU = null;
        DAOuser instance = new DAOuser();
        instance.deleteUser(idU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUser method, of class DAOuser.
     */
    @Test
    public void testEditUser() {
        System.out.println("editUser");
        Tbluser usr = null;
        DAOuser instance = new DAOuser();
        instance.editUser(usr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetUser method, of class DAOuser.
     */
    @Test
    public void testResetUser() {
        System.out.println("resetUser");
        Tbluser usr = null;
        DAOuser instance = new DAOuser();
        instance.resetUser(usr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

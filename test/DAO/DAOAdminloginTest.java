/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import pojo.Tbladmin;

/**
 *
 * @author Adit
 */
public class DAOAdminloginTest {
    
    public DAOAdminloginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOAdminlogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("TEST getBy SUCCESS");
        String uName = "admin";
        String uPass = "admin123";
        DAOAdminlogin instance = new DAOAdminlogin();
        int expResult = 1;
        int result = instance.getBy(uName, uPass).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of add_admin method, of class DAOAdminlogin.
     */
    @Test
    public void testadd_admin() {
        System.out.println("TEST add_admin SUCCESS");
        Tbladmin admin = null;
        DAOAdminlogin instance = new DAOAdminlogin();
        instance.add_admin(admin);
    }
    
}

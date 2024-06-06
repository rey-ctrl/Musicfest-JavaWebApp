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
import pojo.Tbluser;

/**
 *
 * @author Adit
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
       System.out.println("TEST getBy SUCCESS");
        String uName = "rey";
        String uPass = "12345";
        DAOLogin instance = new DAOLogin();
        int expResult = 1;
        int result = instance.getBy(uName, uPass).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of add_user method, of class DAOLogin.
     */
    @Test
    public void testAdd_user() {
        System.out.println("TEST add_user SUCCESS");
        Tbluser user = null;
        DAOLogin instance = new DAOLogin();
        instance.add_user(user);
    }
    
}

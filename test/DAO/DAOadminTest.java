/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import pojo.Tbladmin;

/**
 *
 * @author Adit
 */
public class DAOadminTest {
    
     DAOadmin instance;
    
    public DAOadminTest() {
    }
    
    @Before
    public void setUp() {
        instance = new DAOadmin();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of retrveTbladmin method, of class DAOadmin.
     */
    @Test
    public void testRetrveTbladmin() {
        System.out.println("TEST retreveTbladmin SUCCESS");
        DAOadmin instance = new DAOadmin();
        List<Tbladmin> expResult = null;
        List<Tbladmin> result = instance.retrveTbladmin();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getbyID method, of class DAOadmin.
     */
    @Test
    public void testGetbyID() {
        String IdAdminToSearch = "1";
    List<Tbladmin> result = instance.getbyID(IdAdminToSearch);    

    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertEquals(1, result.size());
    
    Tbladmin actualadmin = result.get(0);
    assertEquals("Admin", actualadmin.getAdmin());
    assertEquals("Admin123", actualadmin.getPassword());
}

    /**
     * Test of deleteAdmin method, of class DAOadmin.
     */
    @Test
    public void testDeleteadmin() {
        System.out.println("DeleteAdmin");
        Integer idU = null;
        DAOadmin instance = new DAOadmin();
        instance.deleteadmin(idU);
    }

    /**
     * Test of editAdmin method, of class DAOadmin.
     */
    @Test
    public void testEditadmin() {
         System.out.println("editAdmin");
        Tbladmin usr = null;
        DAOadmin instance = new DAOadmin();
        instance.editadmin(usr);
    }

    
}

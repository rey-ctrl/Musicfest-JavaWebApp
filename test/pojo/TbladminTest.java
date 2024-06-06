/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adit
 */
public class TbladminTest {
    
     private Tbladmin instance;
    
    public TbladminTest() {
    }
    
    @Before
    public void setUp() {
    instance = new Tbladmin();
    }
    
    @After
    public void tearDown() {
    instance = null;
    }

    /**
     * Test of save_admin method, of class Tbladmin.
     */
    @Test
    public void testSave_admin() {
        System.out.println("SaveAdmin");
        instance.setAdmin("ValidAdmin");
        instance.setPassword("ValidPassword");
        instance.save_admin();
        // You can assert the expected result here.
    }

    /**
     * Test of login_admin method, of class Tbladmin.
     */
    @Test
    public void testLogin_admin() {
        System.out.println("Login_Admin");
        instance.setAdmin("ValidAdmin");
        instance.setPassword("ValidPassword");

        String expResult = "dashboard"; // Ganti dengan hasil yang diharapkan
        String result = instance.login_admin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllRecords method, of class Tbladmin.
     */
    @Test
    public void testGetAllRecords() {
        List<Tbladmin> result = instance.getAllRecords();
        assertNotNull(result);
    }

    /**
     * Test of getByIdus method, of class Tbladmin.
     */
    @Test
    public void testGetByIdus() {
    }


    /**
     * Test of edit method, of class Tbladmin.
     */
    @Test
    public void testEdit() {
        System.out.println("Edit Admin");
        instance.setAdmin("ValidAdmin");
        instance.setPassword("ValidPassword");
        String expResult = "admin"; // Ganti dengan hasil yang diharapkan
        String result = instance.edit();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Tbladmin.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete Admin"); 
        instance.setIdAdmin(11); // Ganti dengan ID yang valid
        String expResult = "admin"; // Ganti dengan hasil yang diharapkan
        String result = instance.delete();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdAdmin method, of class Tbladmin.
     */
    @Test
    public void testGetIdAdmin() {
         Integer expResult = 11; // Ganti dengan ID yang valid
        instance.setIdAdmin(expResult);
        Integer result = instance.getIdAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdAdmin method, of class Tbladmin.
     */
    @Test
    public void testSetIdAdmin() {
         Integer idAdmin = 11; // Ganti dengan ID yang valid
        instance.setIdAdmin(idAdmin);
        Integer result = instance.getIdAdmin();
        assertEquals(idAdmin, result);
    }

    /**
     * Test of getAdmin method, of class Tbladmin.
     */
    @Test
    public void testGetAdmin() {
         String expResult = "admin"; // Ganti dengan nilai yang diharapkan
        instance.setAdmin(expResult);
        String result = instance.getAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdmin method, of class Tbladmin.
     */
    @Test
    public void testSetAdmin() {
       String admin = "admin"; // Ganti dengan nilai yang diharapkan
        instance.setAdmin(admin);
        String result = instance.getAdmin();
        assertEquals(admin, result);
    }

    /**
     * Test of getPassword method, of class Tbladmin.
     */
    @Test
    public void testGetPassword() {
       String expResult = "password"; // Ganti dengan nilai yang diharapkan
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Tbladmin.
     */
    @Test
    public void testSetPassword() {
       String password = "password"; // Ganti dengan nilai yang diharapkan
        instance.setPassword(password);
        String result = instance.getPassword();
        assertEquals(password, result);
    }
    
}

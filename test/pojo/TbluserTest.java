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
public class TbluserTest {
    
    private Tbluser instance;
    
    public TbluserTest() {
    }
    
    @Before
    public void setUp() {
    instance = new Tbluser();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save_user method, of class Tbluser.
     */
    @Test
    public void testSave_user() {
         System.out.println("SaveCustomer");
        instance.setUsername("user");
        instance.setPassword("user123");
    }


    /**
     * Test of login_user method, of class Tbluser.
     */
    @Test
    public void testLogin_user() {
     System.out.println("Login_Admin");
        instance.setUsername("user");
        instance.setPassword("user123");

        String expResult = "event"; // Ganti dengan hasil yang diharapkan
        String result = instance.login_user();
        assertEquals(expResult, result);
    }


    /**
     * Test of getAllRecords method, of class Tbluser.
     */
    @Test
    public void testGetAllRecords() {
      List<Tbluser> result = instance.getAllRecords();
        assertNotNull(result);
    }

    /**
     * Test of getByIdus method, of class Tbluser.
     */
    @Test
    public void testGetByIdus() {
        instance.setIdUser(1); // Ganti dengan ID yang valid
        String expResult = "user"; // Ganti dengan hasil yang diharapkan
        String result = instance.getByIdus();
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class Tbluser.
     */
    @Test
    public void testEdit() {
         System.out.println("Edit user");
        instance.setUsername("user");
        instance.setPassword("user123");
        String expResult = "user"; // Ganti dengan hasil yang diharapkan
        String result = instance.edit();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of delete method, of class Tbluser.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete User"); 
        instance.setIdUser(1); // Ganti dengan ID yang valid
        String expResult = "user"; // Ganti dengan hasil yang diharapkan
        String result = instance.delete();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of getIdUser method, of class Tbluser.
     */
    @Test
    public void testGetIdUser() {
        Integer idUser = 1; // Ganti dengan ID yang valid
        instance.setIdUser(idUser);
        Integer result = instance.getIdUser();
        assertEquals(idUser, result);
    }


    /**
     * Test of setIdUser method, of class Tbluser.
     */
    @Test
    public void testSetIdUser() {
        Integer idUser = 1; // Ganti dengan ID yang valid
        instance.setIdUser(idUser);
        Integer result = instance.getIdUser();
        assertEquals(idUser, result);
    }

    /**
     * Test of getPassword method, of class Tbluser.
     */
    @Test
    public void testGetPassword() {
       String expResult = "password"; // Ganti dengan nilai yang diharapkan
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }


    /**
     * Test of setPassword method, of class Tbluser.
     */
    @Test
    public void testSetPassword() {
        String password = "password"; // Ganti dengan nilai yang diharapkan
        instance.setPassword(password);
        String result = instance.getPassword();
        assertEquals(password, result);
    }

    /**
     * Test of getUsername method, of class Tbluser.
     */
    @Test
    public void testGetUsername() {
       String expResult = "user"; // Ganti dengan nilai yang diharapkan
        instance.setUsername(expResult);
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Tbluser.
     */
    @Test
    public void testSetUsername() {
        String user = "user"; // Ganti dengan nilai yang diharapkan
        instance.setUsername(user);
        String result = instance.getUsername();
        assertEquals(user, result);
    }
    
}

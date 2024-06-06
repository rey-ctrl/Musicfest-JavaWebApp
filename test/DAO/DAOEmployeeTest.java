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
import pojo.Tblemp;

/**
 *
 * @author Adit
 */
public class DAOEmployeeTest {
    
    DAOEmployee instance;
    
    public DAOEmployeeTest() {
    }
    
    @Before
    public void setUp() {
        instance = new DAOEmployee();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOEmployee.
     */
    @Test
    public void testGetBy() {
       System.out.println("getBy");
        String uNemp = "";
        String uGen = "";
        String uTlp = "";
        String uSal = "";
        String uAds = "";
        DAOEmployee instance = new DAOEmployee();
        List<Tblemp> expResult = instance.getBy("", "", "", "","");
        List<Tblemp> result = instance.getBy(uNemp, uGen, uTlp, uSal, uAds);
        assertEquals(expResult, result);
    }

    /**
     * Test of add_employee method, of class DAOEmployee.
     */
    @Test
    public void testAdd_employee() {
        System.out.println("TEST add_employee SUCCESS");
        Tblemp employee = null;
        DAOEmployee instance = new DAOEmployee();
        instance.add_employee(employee);
    }

    /**
     * Test of retreveTblemp method, of class DAOEmployee.
     */
    @Test
    public void testRetreveTblemp() {
         System.out.println("TEST retreveTblemp SUCCESS");
        DAOEmployee instance = new DAOEmployee();
        List<Tblemp> expResult = null;
        List<Tblemp> result = instance.retreveTblemp();
        assertNotNull(result);
    }

    /**
     * Test of getbyIDemp method, of class DAOEmployee.
     */
    @Test
    public void testGetbyIDemp() {
        String employeeIdToSearch = "1";
    List<Tblemp> result = instance.getbyIDemp(employeeIdToSearch);

    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertEquals(1, result.size());
    
    Tblemp actualEmployee = result.get(0);
    assertEquals("kaya", actualEmployee.getNamaEmployee());
    assertEquals("female", actualEmployee.getGender());
    assertEquals("24123", actualEmployee.getTlpn());
    assertEquals("5000000", actualEmployee.getSallary());
    assertEquals("alabasta", actualEmployee.getAddress());
}

    /**
     * Test of deleteEmplo method, of class DAOEmployee.
     */
    @Test
    public void testDeleteEmplo() {
        System.out.println("deleteEmployee");
        Integer idE = null;
        DAOEmployee instance = new DAOEmployee();
        instance.deleteEmplo(idE);
    }

    /**
     * Test of editEmplo method, of class DAOEmployee.
     */
    @Test
    public void testEditEmplo() {
        System.out.println("editEmplo");
        Tblemp plo = null;
        DAOEmployee instance = new DAOEmployee();
        instance.editEmplo(plo);
    }
    
}

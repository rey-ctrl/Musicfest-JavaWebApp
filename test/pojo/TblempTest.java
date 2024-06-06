/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import DAO.DAOEmployee;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adit
 */
public class TblempTest {
    
    private Tblemp instance;
    
    public TblempTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Tblemp();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of save_employee method, of class Tblemp.
     */
    @Test
    public void testSave_employee() {
         System.out.println("Save employee");
        instance.setNamaEmployee("kuyang");
        instance.setGender("Bekasi");
        instance.setTlpn("123456789");
        instance.setSallary("1500000");
        instance.setAddress("1500000");
        instance.save_employee();
    }

    /**
     * Test of getAllRecordsss method, of class Tblemp.
     */
    @Test
    public void testGetAllRecordsss() {
        List<Tblemp> result = instance.getAllRecordsss();
        assertNotNull(result);
    }

    /**
     * Test of getByIdemp method, of class Tblemp.
     */
    @Test
    public void testGetByIdemp() {
          System.out.println("TEST getByIdemp");

        Tblemp employee = new Tblemp("Sample Employee", "Sample Gender", "1234567890", "1500000", "Sample Address");
        DAOEmployee employe = new DAOEmployee();
        employe.add_employee(employee);

        int employeeId = employee.getIdEmployee();
        instance.setIdEmployee(employeeId);

        String result = instance.getByIdemp();
        assertEquals(result, "employee");

        // Verify that the properties of tblCust have been set with the correct values
        assertEquals(employee.getNamaEmployee(), instance.getNamaEmployee());
        assertEquals(employee.getGender(), instance.getGender());
        assertEquals(employee.getTlpn(), instance.getTlpn());
        assertEquals(employee.getSallary(), instance.getSallary());
        assertEquals(employee.getAddress(), instance.getAddress());
    }

    /**
     * Test of editte method, of class Tblemp.
     */
    @Test
    public void testEditte() {
       System.out.println("Edit Customer");
        instance.setNamaEmployee("kuyang");
        instance.setGender("perempuan");
        instance.setTlpn("123456789");
        instance.setSallary("1500000");
        instance.setAddress("1500000");
        String expResult = "employee"; // Ganti dengan hasil yang diharapkan
        String result = instance.editte();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of deleteet method, of class Tblemp.
     */
    @Test
    public void testDeleteet() {
        System.out.println("Delete employee"); 
        instance.setIdEmployee(1); // Ganti dengan ID yang valid
        String expResult = "employee"; // Ganti dengan hasil yang diharapkan
        String result = instance.deleteet();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of getIdEmployee method, of class Tblemp.
     */
    @Test
    public void testGetIdEmployee() {
        Integer IdEmployee = 1; // Ganti dengan ID yang valid
        instance.setIdEmployee(IdEmployee);
        Integer result = instance.getIdEmployee();
        assertEquals(IdEmployee, result);
    }

    /**
     * Test of setIdEmployee method, of class Tblemp.
     */
    @Test
    public void testSetIdEmployee() {
        Integer IdEmployee = 1; // Ganti dengan ID yang valid
        instance.setIdEmployee(IdEmployee);
        Integer result = instance.getIdEmployee();
        assertEquals(IdEmployee, result);
    }

    /**
     * Test of getNamaEmployee method, of class Tblemp.
     */
    @Test
    public void testGetNamaEmployee() {
        String expResult = "employee"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setNamaEmployee(expResult);
        String result = instance.getNamaEmployee();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNamaEmployee method, of class Tblemp.
     */
    @Test
    public void testSetNamaEmployee() {
        System.out.println("setNamaCustomer");
        String NamaEmployee = "kuyang";
        instance.setNamaEmployee(NamaEmployee);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getGender method, of class Tblemp.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        String expResult = "perempuan"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setGender(expResult);
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Tblemp.
     */
    @Test
    public void testSetGender() {
        System.out.println("SetGender");
        String Gender = "Bekasi";
        instance.setGender(Gender);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getTlpn method, of class Tblemp.
     */
    @Test
    public void testGetTlpn() {
        System.out.println("getTlpn");
        String expResult = "123456789"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setTlpn(expResult);
        String result = instance.getTlpn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTlpn method, of class Tblemp.
     */
    @Test
    public void testSetTlpn() {
        System.out.println("setNoTlpn");
        String noTlpn = "123456789";
        instance.setTlpn(noTlpn);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getSallary method, of class Tblemp.
     */
    @Test
    public void testGetSallary() {
        System.out.println("GetSallary");
        String expResult = "1500000"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setSallary(expResult);
        String result = instance.getSallary();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSallary method, of class Tblemp.
     */
    @Test
    public void testSetSallary() {
        System.out.println("SetSallary");
        String Sallary = "1500000";
        instance.setTlpn(Sallary);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getAddress method, of class Tblemp.
     */
    @Test
    public void testGetAddress() {
        System.out.println("GetAddress");
        String expResult = "Bekasi"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setAddress(expResult);
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Tblemp.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAlamat");
        String Address = "Bekasi";
        instance.setAddress(Address);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import DAO.DAOCustomer;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Adit
 */
public class TblcustTest {
   
    private Tblcust instance;
    
    public TblcustTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Tblcust();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of save_Customer method, of class TblCust.
     */
    @Test
    public void testSave_Customer() {
         System.out.println("SaveCustomer");
        instance.setNamaCustomer("kuya");
        instance.setAlamat("Bekasi");
        instance.setNoTlpn("12345");
        instance.save_Customer();
        assertTrue(instance.getIdCustomer() > 0);
    }

    /**
     * Test of getAllRecordsss method, of class TblCust.
     */
    @Test
    public void testGetAllRecordsss() {
        List<Tblcust> result = instance.getAllRecordsss();
        assertNotNull(result);
    }

    /**
     * Test of getByIdcus method, of class TblCust.
     */
    @Test
    public void testGetByIdcus() {
        System.out.println("TEST getByIdcus");

        Tblcust Customer = new Tblcust("Sample Customer", "Sample Address", "1234567890");
        DAOCustomer daoCustomer = new DAOCustomer();
        daoCustomer.addcustomer(Customer);

        int customerId = Customer.getIdCustomer();
        instance.setIdCustomer(customerId);

        String result = instance.getByIdcus();
        assertEquals(result, "customer");

        // Verify that the properties of tblCust have been set with the correct values
        assertEquals(Customer.getNamaCustomer(), instance.getNamaCustomer());
        assertEquals(Customer.getAlamat(), instance.getAlamat());
        assertEquals(Customer.getNoTlpn(), instance.getNoTlpn());
    }
  

    /**
     * Test of editta method, of class TblCust.
     */
    @Test
    public void testEditta() {
        System.out.println("Edit Customer");
        instance.setNamaCustomer("kuya");
        instance.setAlamat("Bekasi");
        instance.setNoTlpn("12345");
        String expResult = "customer"; // Ganti dengan hasil yang diharapkan
        String result = instance.editta();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of deleteea method, of class TblCust.
     */
    @Test
    public void testDeleteea() {
        System.out.println("Delete Customer"); 
        instance.setIdCustomer(1); // Ganti dengan ID yang valid
        String expResult = "customer"; // Ganti dengan hasil yang diharapkan
        String result = instance.deleteea();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of getIdCustomer method, of class TblCust.
     */
    @Test
    public void testGetIdCustomer() {
        Integer idCustomer = 1; // Ganti dengan ID yang valid
        instance.setIdCustomer(idCustomer);
        Integer result = instance.getIdCustomer();
        assertEquals(idCustomer, result);
    }

    /**
     * Test of setIdCustomer method, of class TblCust.
     */
    @Test
    public void testSetIdCustomer() {
        Integer idCustomer = 1; // Ganti dengan ID yang valid
        instance.setIdCustomer(idCustomer);
        Integer result = instance.getIdCustomer();
        assertEquals(idCustomer, result);
    }

    /**
     * Test of getNamaCustomer method, of class TblCust.
     */
    @Test
    public void testGetNamaCustomer() {
        String expResult = "customer"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setNamaCustomer(expResult);
        String result = instance.getNamaCustomer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNamaCustomer method, of class TblCust.
     */
    @Test
    public void testSetNamaCustomer() {
        System.out.println("setNamaCustomer");
        String namaCustomer = "kuya";
        instance.setNamaCustomer(namaCustomer);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getAlamat method, of class TblCust.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("getAlamat");
        String expResult = "Bekasi"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setAlamat(expResult);
        String result = instance.getAlamat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlamat method, of class TblCust.
     */
    @Test
    public void testSetAlamat() {
         System.out.println("setAlamat");
        String alamat = "Bekasi";
        instance.setAlamat(alamat);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    /**
     * Test of getNoTlpn method, of class TblCust.
     */
    @Test
    public void testGetNoTlpn() {
       System.out.println("getNoTlpn");
        String expResult = "12345"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setNoTlpn(expResult);
        String result = instance.getNoTlpn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNoTlpn method, of class TblCust.
     */
    @Test
    public void testSetNoTlpn() {
        System.out.println("setNoTlpn");
        String noTlpn = "";
        instance.setNoTlpn(noTlpn);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }
    
}

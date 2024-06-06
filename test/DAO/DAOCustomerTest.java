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
import pojo.Tblcust;

/**
 *
 * @author Adit
 */
public class DAOCustomerTest {
    
    DAOCustomer instance;
    
    public DAOCustomerTest() {
    }
    
    @Before
    public void setUp() {
        instance = new DAOCustomer();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOCustomer.
     */
    @Test
    public void testGetBy() {
       System.out.println("TEST getBy SUCCESS");
        String uNcus = "";
        String uAl = "";
        String uTlp = "";
        DAOCustomer instance = new DAOCustomer();
        List<Tblcust> expResult = instance.getBy("", "", "");
        List<Tblcust> result = instance.getBy(uNcus, uAl, uTlp);
        assertEquals(expResult, result);
    }

    /**
     * Test of AddCustomer method, of class DAOCustomer.
     */
    @Test
    public void testAddcustomer() {
       System.out.println("TEST add_product SUCCESS");
        Tblcust customer = null;
        DAOCustomer instance = new DAOCustomer();
        instance.addcustomer(customer);
    }

    /**
     * Test of retreveTblCust method, of class DAOCustomer.
     */
    @Test
    public void testRetreveTblCust() {
        System.out.println("TEST retreveTblCust SUCCESS");
        DAOCustomer instance = new DAOCustomer();
        List<Tblcust> expResult = null;
        List<Tblcust> result = instance.retreveTblCust();
        assertNotNull(result);
    }

    /**
     * Test of getbyID method, of class DAOCustomer.
     */
    @Test
    public void testGetbyID() {
        String idCustomerToSearch = "13";
    List<Tblcust> result = instance.getbyID(idCustomerToSearch);

    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertEquals(1, result.size());
    
    Tblcust actualCustomer = result.get(0);
    assertEquals("Reyhan", actualCustomer.getNamaCustomer());
    assertEquals("villa bekasi indah", actualCustomer.getAlamat());
    assertEquals("012345", actualCustomer.getNoTlpn());
}

    /**
     * Test of deleteCustomer method, of class DAOCustomer.
     */
    @Test
    public void testDeleteCustomer() {
       System.out.println("deleteCustomer");
        Integer idC = null;
        DAOCustomer instance = new DAOCustomer();
        instance.deleteCustomer(idC);
    }

    /**
     * Test of editCustomer method, of class DAOCustomer.
     */
    @Test
    public void testEditCustomer() {
       System.out.println("editCustomer");
        Tblcust cus = null;
        DAOCustomer instance = new DAOCustomer();
        instance.editCustomer(cus);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

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
public class TblticketTest {
    
    public TblticketTest() {
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
     * Test of save_Ticket method, of class Tblticket.
     */
    @Test
    public void testSave_Ticket() {
        System.out.println("save_Ticket");
        Tblticket instance = new Tblticket();
        instance.save_Ticket();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllRecoordss method, of class Tblticket.
     */
    @Test
    public void testGetAllRecoordss() {
        System.out.println("getAllRecoordss");
        Tblticket instance = new Tblticket();
        List<Tblticket> expResult = null;
        List<Tblticket> result = instance.getAllRecoordss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByIdtic method, of class Tblticket.
     */
    @Test
    public void testGetByIdtic() {
        System.out.println("getByIdtic");
        Tblticket instance = new Tblticket();
        String expResult = "";
        String result = instance.getByIdtic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editta method, of class Tblticket.
     */
    @Test
    public void testEditta() {
        System.out.println("editta");
        Tblticket instance = new Tblticket();
        String expResult = "";
        String result = instance.editta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteea method, of class Tblticket.
     */
    @Test
    public void testDeleteea() {
        System.out.println("deleteea");
        Tblticket instance = new Tblticket();
        String expResult = "";
        String result = instance.deleteea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTicket method, of class Tblticket.
     */
    @Test
    public void testGetIdTicket() {
        System.out.println("getIdTicket");
        Tblticket instance = new Tblticket();
        Integer expResult = null;
        Integer result = instance.getIdTicket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTicket method, of class Tblticket.
     */
    @Test
    public void testSetIdTicket() {
        System.out.println("setIdTicket");
        Integer idTicket = null;
        Tblticket instance = new Tblticket();
        instance.setIdTicket(idTicket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketCode method, of class Tblticket.
     */
    @Test
    public void testGetTicketCode() {
        System.out.println("getTicketCode");
        Tblticket instance = new Tblticket();
        String expResult = "";
        String result = instance.getTicketCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketCode method, of class Tblticket.
     */
    @Test
    public void testSetTicketCode() {
        System.out.println("setTicketCode");
        String ticketCode = "";
        Tblticket instance = new Tblticket();
        instance.setTicketCode(ticketCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketType method, of class Tblticket.
     */
    @Test
    public void testGetTicketType() {
        System.out.println("getTicketType");
        Tblticket instance = new Tblticket();
        String expResult = "";
        String result = instance.getTicketType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketType method, of class Tblticket.
     */
    @Test
    public void testSetTicketType() {
        System.out.println("setTicketType");
        String ticketType = "";
        Tblticket instance = new Tblticket();
        instance.setTicketType(ticketType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

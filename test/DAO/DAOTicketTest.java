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
import pojo.Tblticket;

/**
 *
 * @author Adit
 */
public class DAOTicketTest {
    
    DAOTicket instance;
    
    public DAOTicketTest() {
    }
    
    @Before
    public void setUp() {
        instance = new DAOTicket();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOTicket.
     */
    @Test
    public void testGetBy() {
        System.out.println("TEST getBy SUCCESS");
        String uPI = "";
        String uTcd = "";
        DAOTicket instance = new DAOTicket();
        List<Tblticket> expResult = instance.getBy("", "");
        List<Tblticket> result = instance.getBy(uPI, uTcd);
        assertEquals(expResult, result);
    }

    /**
     * Test of addTicket method, of class DAOTicket.
     */
    @Test
    public void testAddTicket() {
        System.out.println("TEST add_ticket SUCCESS");
        Tblticket ticket = null;
        DAOTicket instance = new DAOTicket();
        instance.addTicket(ticket);
    }

    /**
     * Test of retreveTicket method, of class DAOTicket.
     */
    @Test
    public void testRetreveTicket() {
        System.out.println("TEST retreveTicket SUCCESS");
        DAOTicket instance = new DAOTicket();
        List<Tblticket> expResult = null;
        List<Tblticket> result = instance.retreveTicket();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getbyID method, of class DAOTicket.
     */
    @Test
    public void testGetbyID() {
    String IdTicketToSearch = "3";
    List<Tblticket> result = instance.getbyID(IdTicketToSearch);

    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertEquals(1, result.size());
    
    Tblticket actualticket = result.get(0);
    assertEquals("001121", actualticket.getTicketCode());
    assertEquals("VIP", actualticket.getTicketType());
}

    /**
     * Test of deleteTicket method, of class DAOTicket.
     */
    @Test
    public void testDeleteTicket() {
        System.out.println("deleteTicket");
        Integer idC = null;
        DAOTicket instance = new DAOTicket();
        instance.deleteTicket(idC);
    }

    /**
     * Test of editTicket method, of class DAOTicket.
     */
    @Test
    public void testEditTicket() {
        System.out.println("editTicket");
        Tblticket tic = null;
        DAOTicket instance = new DAOTicket();
        instance.editTicket(tic);
    }
    
}

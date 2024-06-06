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
import pojo.Tblevent;

/**
 *
 * @author Adit
 */
public class DAOEventTest {
    
    DAOEvent instance;
    
    public DAOEventTest() {
    }
    
    @Before
    public void setUp() {
     instance = new DAOEvent();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOEvent.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String uPduct = "";
        String uPurch = "";
        DAOEvent instance = new DAOEvent();
        List<Tblevent> expResult = instance.getBy("","");
        List<Tblevent> result = instance.getBy(uPduct, uPurch);
        assertEquals(expResult, result);
    }

    /**
     * Test of add_event method, of class DAOEvent.
     */
    @Test
    public void testAdd_event() {
        System.out.println("add_event");
        Tblevent product = null;
        DAOEvent instance = new DAOEvent();
        instance.add_event(product);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of retreveTblevent method, of class DAOEvent.
     */
    @Test
    public void testRetreveTblevent() {
      System.out.println("TEST retreveTblevent SUCCESS");
        DAOEvent instance = new DAOEvent();
        List<Tblevent> expResult = null;
        List<Tblevent> result = instance.retreveTblevent();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getbyID method, of class DAOEvent.
     */
    @Test
    public void testGetbyID() {
       String idEventToSearch = "1";
    List<Tblevent> result = instance.getbyID(idEventToSearch);

    assertNotNull(result);
    assertFalse(result.isEmpty());
    assertEquals(1, result.size());
    
    Tblevent actualartist = result.get(0);
    assertEquals("Avicii", actualartist.getArtistName());
    assertEquals("walk stage jam 18.13", actualartist.getArtistBio());
}

    /**
     * Test of deleteEvent method, of class DAOEvent.
     */
    @Test
    public void testDeleteevent() {
    System.out.println("DeleteEvent");
        Integer idP = null;
        DAOEvent instance = new DAOEvent();
        instance.deleteevent(idP);
    }


    /**
     * Test of editEvent method, of class DAOEvent.
     */
    @Test
    public void testEditevent() {
       System.out.println("editevent");
        Tblevent pro = null;
        DAOEvent instance = new DAOEvent();
        instance.editevent(pro);
    }
    
}

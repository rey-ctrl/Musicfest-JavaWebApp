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
public class TbleventTest {
    
    private Tblevent instance;
    
    public TbleventTest() {
    }
    
    @Before
    public void setUp() {
    instance = new Tblevent();
    }
    
    @After
    public void tearDown() {
     instance = null;
    }


    /**
     * Test of save_event method, of class Tblevent.
     */
    @Test
    public void testSave_event() {
         System.out.println("Save Artist");
        instance.setArtistName("Bootstrap");
        instance.setArtistBio("Second on Stage");
    }

    /**
     * Test of getAllRecordss method, of class Tblevent.
     */
    @Test
    public void testGetAllRecordss() {
       List<Tblevent> result = instance.getAllRecordss();
        assertNotNull(result);
    }


    /**
     * Test of getByIdeve method, of class Tblevent.
     */
    @Test
    public void testGetByIdeve() {
        instance.setIdEvent(1); // Ganti dengan ID yang valid
        String expResult = "event"; // Ganti dengan hasil yang diharapkan
        String result = instance.getByIdeve();
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class Tblevent.
     */
    @Test
    public void testEdit() {
         System.out.println("Edit Artist");
        instance.setArtistName("Bootstrap");
            instance.setArtistBio("Second on Stage");
        String expResult = "event"; // Ganti dengan hasil yang diharapkan
        String result = instance.edit();
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of delete method, of class Tblevent.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete Artist"); 
        instance.setIdEvent(1); // Ganti dengan ID yang valid
        String expResult = "event"; // Ganti dengan hasil yang diharapkan
        String result = instance.delete();
        assertEquals(expResult, result);
        assertNotNull(result);
    }
    
    /**
     * Test of getIdEvent method, of class Tblevent.
     */
    @Test
    public void testGetIdEvent() {
        Integer idEvent = 1; // Ganti dengan ID yang valid
        instance.setIdEvent(idEvent);
        Integer result = instance.getIdEvent();
        assertEquals(idEvent, result);
    }


    /**
     * Test of setIdEvent method, of class Tblevent.
     */
    @Test
    public void testSetIdEvent() {
         Integer idEvent = 1; // Ganti dengan ID yang valid
        instance.setIdEvent(idEvent);
        Integer result = instance.getIdEvent();
        assertEquals(idEvent, result);
    }
    /**
     * Test of getArtistName method, of class Tblevent.
     */
    @Test
    public void testGetArtistName() {
        String expResult = "event"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setArtistName(expResult);
        String result = instance.getArtistName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setArtistName method, of class Tblevent.
     */
    @Test
    public void testSetArtistName() {
        System.out.println("setArtistName");
        String ArtistName = "Bootstrap";
        instance.setArtistName(ArtistName);
    }

    /**
     * Test of getArtistBio method, of class Tblevent.
     */
    @Test
    public void testGetArtistBio() {
        System.out.println("getArtistBio");
        String expResult = "Second on Stage"; // Mengubah nilai yang diharapkan sesuai dengan yang telah Anda set sebelumnya.
        instance.setArtistBio(expResult);
        String result = instance.getArtistBio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArtistBio method, of class Tblevent.
     */
    @Test
    public void testSetArtistBio() {
         System.out.println("setArtistBio");
        String alamat = "Second on Stage";
        instance.setArtistBio(alamat);
        // Anda perlu menambahkan pengujian lain untuk memeriksa apakah setter berfungsi dengan benar.
    }

    
}

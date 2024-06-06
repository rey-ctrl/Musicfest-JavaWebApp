package pojo;
// Generated Oct 15, 2023 10:00:20 PM by Hibernate Tools 4.3.1

import DAO.DAOEvent;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class Tblevent  implements java.io.Serializable {

     private Integer idEvent;
     private String artistName;
     private String artistBio;

     public void save_event() {
        if (artistName == null || artistName.isEmpty() || artistBio == null || artistBio.isEmpty()) {
            // Menampilkan pesan kesalahan jika kolom yang diperlukan kosong
            FacesMessage message = new FacesMessage("Data cannot be empty!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            // Melanjutkan penyimpanan produk ke database jika validasi sukses
            DAOEvent addd = new DAOEvent();
            addd.add_event(this);
        }
    }

    public List<Tblevent> getAllRecordss() {
        DAOEvent plo = new DAOEvent();
        List<Tblevent> lPlo = plo.retreveTblevent();
        return lPlo;
    }

    public String getByIdeve() {
        String id_event = idEvent.toString();
        DAOEvent plo = new DAOEvent();
        List<Tblevent> lPlo = plo.getbyID(id_event);

        if (!lPlo.isEmpty()) {
            // Produk ditemukan, isi nilai-nilai
            artistName = lPlo.get(0).getArtistName();
            artistBio = lPlo.get(0).getArtistBio();
        } else {
            // Produk tidak ditemukan, berikan pesan kesalahan kepada pengguna
            FacesMessage message = new FacesMessage("event with ID " + id_event + " doesn't exist.");
            message.setSeverity(FacesMessage.SEVERITY_ERROR); // Menetapkan tingkat kesalahan menjadi error
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return "event";
    }

    public String edit() {
        if (artistName == null || artistName.isEmpty() || artistBio == null || artistBio.isEmpty()) {
            FacesMessage message = new FacesMessage("Data cannot be empty!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR); // Menetapkan tingkat kesalahan menjadi error
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            DAOEvent plo = new DAOEvent();
            plo.editevent(this);
            artistName = "";
            artistBio = "";
        }
        return "event";
    }

    public String delete() {
        DAOEvent plo = new DAOEvent();
        plo.deleteevent(idEvent);
        artistName = "";
        artistBio = "";
        return "event";
    }
    
    public Tblevent() {
    }

    public Tblevent(String artistName, String artistBio) {
       this.artistName = artistName;
       this.artistBio = artistBio;
    }
   
    public Integer getIdEvent() {
        return this.idEvent;
    }
    
    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }
    public String getArtistName() {
        return this.artistName;
    }
    
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getArtistBio() {
        return this.artistBio;
    }
    
    public void setArtistBio(String artistBio) {
        this.artistBio = artistBio;
    }
}



package pojo;
// Generated Oct 13, 2023 9:59:41 PM by Hibernate Tools 4.3.1

import DAO.DAOTicket;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Tblticket  implements java.io.Serializable {


     private Integer idTicket;
     private String ticketCode;
     private String ticketType;

     public void save_Ticket() {
        if (ticketType == null || ticketType.isEmpty() || ticketCode == null || ticketCode.isEmpty()) {
            FacesMessage message = new FacesMessage("Data cannot be empty!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR); // Menetapkan tingkat kesalahan menjadi error
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            DAOTicket daoTicket = new DAOTicket();
            daoTicket.addTicket(this);
        }
    }

     public List<Tblticket> getAllRecoordss() {
        DAOTicket tic = new DAOTicket();
        List<Tblticket> lTic = tic.retreveTicket();
        return lTic;
    }

    public String getByIdtic() {
        String ticket_ID = idTicket.toString();
        DAOTicket tic = new DAOTicket();
        List<Tblticket> lTic = tic.getbyID(ticket_ID);

        if (!lTic.isEmpty()) {
            ticketType = lTic.get(0).getTicketType();
            ticketCode = (String) lTic.get(0).getTicketCode();
        } else {
            FacesMessage message = new FacesMessage("Ticket with ID " + ticket_ID + " doesn't exist.");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }

        return "ticket";
    }

    public String editta() {
        if (ticketType == null || ticketType.isEmpty() || ticketCode == null || ticketCode.isEmpty()) {
            FacesMessage message = new FacesMessage("Data cannot be empty!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR); // Menetapkan tingkat kesalahan menjadi error
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            DAOTicket tic = new DAOTicket();
            tic.editTicket(this);
            ticketType = "";
            ticketCode = "";
        }
        return "ticket";
    }

    public String deleteea() {
        DAOTicket tic = new DAOTicket();
        tic.deleteTicket(idTicket);
        ticketType = "";
        ticketCode = "";
        return "ticket";
    }
    
    public Tblticket() {
    }

    public Tblticket(String ticketCode, String ticketType) {
       this.ticketCode = ticketCode;
       this.ticketType = ticketType;
    }
   
    public Integer getIdTicket() {
        return this.idTicket;
    }
    
    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }
    public String getTicketCode() {
        return this.ticketCode;
    }
    
    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }
    public String getTicketType() {
        return this.ticketType;
    }
    
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }




}



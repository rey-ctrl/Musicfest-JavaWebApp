package pojo;
// Generated Oct 15, 2023 10:00:20 PM by Hibernate Tools 4.3.1

import DAO.DAOAdminlogin;
import DAO.DAOadmin;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class Tbladmin  implements java.io.Serializable {


     private Integer idAdmin;
     private String admin;
     private String password;
     
     public void save_admin() {
        if (admin == null || admin.isEmpty() || password == null || password.isEmpty()) {
            // Menampilkan pesan kesalahan jika admin atau password kosong
            FacesMessage message = new FacesMessage("admin or Password cannot be empty!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            // Melanjutkan penyimpanan data ke database jika validasi sukses
            DAOAdminlogin add = new DAOAdminlogin();
            add.add_admin(this);
        }
    }

    public String login_admin() {
        DAOAdminlogin uDao = new DAOAdminlogin();
        List<Tbladmin> us = uDao.getBy(admin, password);
        try {
            if (us != null) {
                admin = us.get(0).admin;
                password = us.get(0).password;
                return "dashboard";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "gagal";
    }

    public List<Tbladmin> getAllRecords() {
        DAOadmin usr = new DAOadmin();
        List<Tbladmin> lUsr = usr.retrveTbladmin();
        return lUsr;
    }

    public String getByIdus() {
        String id_admin = idAdmin.toString();
        DAOadmin usr = new DAOadmin();
        List<Tbladmin> lUsr = usr.getbyID(id_admin);

        if (!lUsr.isEmpty()) {
            // User ditemukan, isi nilai-nilai
            admin = lUsr.get(0).getAdmin();
            password = lUsr.get(0).getPassword();
        } else {
            // User tidak ditemukan, berikan pesan kesalahan kepada pengguna
            FacesMessage message = new FacesMessage("admin with ID " + id_admin + " doesn't exist.");
            message.setSeverity(FacesMessage.SEVERITY_ERROR); // Menetapkan tingkat kesalahan menjadi error
            FacesContext.getCurrentInstance().addMessage(null, message);
        }

        return "admin";
    }

    public String edit() {
        if (admin == null || admin.isEmpty() || password == null || password.isEmpty()) {
            // Menampilkan pesan kesalahan jika username atau password kosong
            FacesMessage message = new FacesMessage("Username or Password cannot be empty!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null; // Tidak melakukan perubahan jika ada kesalahan
        } else {
            // Melanjutkan perubahan data jika validasi sukses
            DAOadmin usr = new DAOadmin();
            usr.editadmin(this);
            admin = "";
            password = "";
            return "admin";
        }
    }

    public String delete() {
        DAOadmin usr = new DAOadmin();
        usr.deleteadmin(idAdmin);
        admin = "";
        password = "";

        return "admin";
    }

    public Tbladmin() {
    }

    public Tbladmin(String admin, String password) {
       this.admin = admin;
       this.password = password;
    }
   
    public Integer getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}



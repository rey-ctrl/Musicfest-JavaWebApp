/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.AbsoluteUtil;
import pojo.Tbluser;

/**
 *
 * @author Indri
 */
public class DAOuser {
    
    public List<Tbluser> retrveTbluser()    
    {
        List stud = new ArrayList();
        Tbluser stud1 = new Tbluser();
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Tbluser");
            stud = query.list();
            stud.add(stud1.getIdUser());
            stud.add(stud1.getUsername());
            stud.add(stud1.getPassword());
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return stud;
    }
    
    public List<Tbluser>getbyID(String idU){
        Tbluser usr = new Tbluser();
        List<Tbluser> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Tbluser where id_user = :id");
            query.setString("id", idU);
            usr = (Tbluser) query.uniqueResult();
            iUsr = query.list();
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return iUsr;
    }
    
    public void deleteUser(Integer idU)
    {
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Tbluser usr = (Tbluser) session.load(Tbluser.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void editUser(Tbluser usr)
    {
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            session.update(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void resetUser(Tbluser usr)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.clear();
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
}

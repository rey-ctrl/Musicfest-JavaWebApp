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
import pojo.Tbladmin;

/**
 *
 * @author Indri
 */
public class DAOadmin {
    
    public List<Tbladmin> retrveTbladmin()    
    {
        List stud = new ArrayList();
        Tbladmin stud1 = new Tbladmin();
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Tbluser");
            stud = query.list();
            stud.add(stud1.getIdAdmin());
            stud.add(stud1.getAdmin());
            stud.add(stud1.getPassword());
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return stud;
    }
    
    public List<Tbladmin>getbyID(String idU){
        Tbladmin usr = new Tbladmin();
        List<Tbladmin> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Tbluser where id_user = :id");
            query.setString("id", idU);
            usr = (Tbladmin) query.uniqueResult();
            iUsr = query.list();
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        return iUsr;
    }
    
    public void deleteadmin(Integer idU)
    {
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        
        try{
            trans = session.beginTransaction();
            Tbladmin usr = (Tbladmin) session.load(Tbladmin.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void editadmin(Tbladmin usr)
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
}

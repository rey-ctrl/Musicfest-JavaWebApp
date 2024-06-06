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
public class DAOAdminlogin {
    public List<Tbladmin>getBy(String uName, String uPass)
    {
        Transaction trans = null;
        Tbladmin us = new Tbladmin();
        List<Tbladmin> user = new ArrayList();
        
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Tbladmin where admin=:uName AND password=:uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            us = (Tbladmin) query.uniqueResult();
            user = query.list();
            trans.commit();
        }catch (Exception e){
            System.out.println(e);
        }
        return user;
    } 
    
    public void add_admin(Tbladmin admin)
    {
        Transaction trans = null;
        Session session = AbsoluteUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(admin);
            trans.commit();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

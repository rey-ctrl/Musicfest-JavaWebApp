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
import pojo.Tblticket;

public class DAOTicket {
    public List<Tblticket> getBy(String uPI, String uTcd) 
   {
       Transaction trans = null;
       Tblticket tc = new Tblticket();
       List<Tblticket> ticket = new ArrayList();
       
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblticket where ticketType=:uPI AND ticketCode=:uTcd");
           query.setString("uPI", uPI);
           query.setString("uTcd", uTcd);
           tc = (Tblticket) query.uniqueResult();
           ticket = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return ticket;
   }
   
   public void addTicket(Tblticket ticket)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           session.save(ticket);
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
  
   public List<Tblticket> retreveTicket()
   {
       List tic = new ArrayList();
       Tblticket tic1 = new Tblticket();
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblticket");
           tic = query.list();
           tic.add(tic1.getIdTicket());
           tic.add(tic1.getTicketCode());
           tic.add(tic1.getTicketType());
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
       return tic;
   }
   

   
   public List<Tblticket> getbyID(String idT)
   {
       Tblticket tic = new Tblticket();
       List<Tblticket> lTic = new ArrayList();
       
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblticket where ticket_ID= :id");
           query.setString("id", idT);
           tic = (Tblticket) query.uniqueResult();
           lTic = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return lTic;
   }
   
   public void deleteTicket(Integer idT)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Tblticket tic = (Tblticket) session.load(Tblticket.class, new Integer(idT));
           session.delete(tic);
           trans.commit();
       }catch (Exception e){
           System.out.println(e);
       }
   }
   
   public void editTicket(Tblticket tic)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.update(tic);
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
   }
}
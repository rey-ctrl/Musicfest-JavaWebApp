package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.AbsoluteUtil;
import pojo.Tblevent;

/**
 *
 * @author Indri
 */
public class DAOEvent {
   public List<Tblevent> getBy(String uPduct, String uPurch) 
   {
       Transaction trans = null;
       Tblevent ev = new Tblevent();
       List<Tblevent> product = new ArrayList();
       
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblevent where artistName=:uPduct AND artistBio=:uPurch");
           query.setString("uPduct", uPduct);
           query.setString("uPurch", uPurch);
           ev = (Tblevent) query.uniqueResult();
           product = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return product;
   }
   
   public void add_event(Tblevent event)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           session.save(event);
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
   
   public List<Tblevent> retreveTblevent()
   {
       List prod = new ArrayList();
       Tblevent prod1 = new Tblevent();
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblevent");
           prod = query.list();
           prod.add(prod1.getIdEvent());
           prod.add(prod1.getArtistName());
           prod.add(prod1.getArtistBio());
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
       return prod;
   }
   
   public List<Tblevent> getbyID(String idP)
   {
       Tblevent pro = new Tblevent();
       List<Tblevent> lPlo = new ArrayList();
       
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblevent where id_event= :id");
           query.setString("id", idP);
           pro = (Tblevent) query.uniqueResult();
           lPlo = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return lPlo;
   }
   
   public void deleteevent(Integer idP)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Tblevent pro = (Tblevent) session.load(Tblevent.class, new Integer(idP));
           session.delete(pro);
           trans.commit();
       }catch (Exception e){
           System.out.println(e);
       }
       
   }
   
   public void editevent(Tblevent pro)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.update(pro);
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
   }
   
}

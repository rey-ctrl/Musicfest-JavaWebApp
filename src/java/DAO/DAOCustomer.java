/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.SessionFactory;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.AbsoluteUtil;
import pojo.Tblcust;

public class DAOCustomer {
    public List<Tblcust> getBy(String uNcus, String uAl, String uTlp) {
    Transaction trans = null;
    List<Tblcust> customer = new ArrayList<>();
    
    Session session = AbsoluteUtil.getSessionFactory().openSession();
    try {
        trans = session.beginTransaction();
        Query query = session.createQuery("from Tblcust where namaCustomer = :uNcus AND alamat = :uAl AND noTlpn = :uTlp");
        query.setString("uNcus", uNcus);
        query.setString("uAl", uAl);
        query.setString("uTlp", uTlp);
        
        // Periksa apakah ada hasil yang sesuai
        List<Tblcust> result = query.list();
        if (result != null && !result.isEmpty()) {
            customer = result;
        }
        
        trans.commit();
    } catch (Exception e) {
        System.out.println(e);
        if (trans != null) {
            trans.rollback(); // Rollback transaksi jika terjadi kesalahan
        }
    } finally {
        session.close(); // Tutup sesi Hibernate
    }
    
    return customer;
}


   
   public void addcustomer(Tblcust customer)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           session.save(customer);
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
   
   public List<Tblcust> retreveTblCust()
   {
       List cus = new ArrayList();
       Tblcust cus1 = new Tblcust();
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblcust");
           cus = query.list();
           cus.add(cus1.getIdCustomer());
           cus.add(cus1.getNamaCustomer());
           cus.add(cus1.getAlamat());
           cus.add(cus1.getNoTlpn());
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
       return cus;
   }
   
   public List<Tblcust> getbyID(String idC)
   {
       Tblcust cus = new Tblcust();
       List<Tblcust> iCus = new ArrayList();
       
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblcust where id_Customer= :id");
           query.setString("id", idC);
           cus = (Tblcust) query.uniqueResult();
           iCus = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return iCus;
   }
   
   public void deleteCustomer(Integer idC)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Tblcust cus = (Tblcust) session.load(Tblcust.class, new Integer(idC));
           session.delete(cus);
           trans.commit();
       }catch (Exception e){
           System.out.println(e);
       }
   }
   
   public void editCustomer(Tblcust cus)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.update(cus);
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
   }
   
}

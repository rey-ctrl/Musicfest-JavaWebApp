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
import pojo.Tblemp;

/**
 *
 * @author Indri
 */
public class DAOEmployee {
    public List<Tblemp> getBy(String uNemp, String uGen, String uTlp, String uSal, String uAds) 
   {
       Transaction trans = null;
       Tblemp em = new Tblemp();
       List<Tblemp> employee = new ArrayList();
       
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblemp where namaEmployee=:uNemp AND gender=:uGen AND tlpn=:uTlp AND sallary=:uSal AND String address=:uAds");
           query.setString("uNemp", uNemp);
           query.setString("uGen", uGen);
           query.setString("uTlp", uTlp);
           query.setString("uSal", uSal);
           query.setString("uAds", uAds);
           em = (Tblemp) query.uniqueResult();
           employee = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return employee;
   }
    
   
   public void add_employee(Tblemp employee)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           session.save(employee);
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
   }
   
   public List<Tblemp> retreveTblemp()
   {
       List empl = new ArrayList();
       Tblemp empl1 = new Tblemp();
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblemp");
           empl = query.list();
           empl.add(empl1.getNamaEmployee());
           empl.add(empl1.getGender());
           empl.add(empl1.getTlpn());
           empl.add(empl1.getSallary());
           empl.add(empl1.getAddress());
           trans.commit();
       }catch(Exception e){
           System.out.println(e);
       }
       return empl;
   }
   
   
   public List<Tblemp> getbyIDemp(String idE)
   {
       Tblemp plo = new Tblemp();
       List<Tblemp> iPlo = new ArrayList();
       
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Query query = session.createQuery("from Tblemp where id_employee= :id");
           query.setString("id", idE);
           plo = (Tblemp) query.uniqueResult();
           iPlo = query.list();
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
       return iPlo;
   }
   
   
   public void deleteEmplo(Integer idE)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           Tblemp plo = (Tblemp) session.load(Tblemp.class, new Integer(idE));
           session.delete(plo);
           trans.commit();
       }catch (Exception e){
           System.out.println(e);
       }
   }
   
   public void editEmplo(Tblemp plo)
   {
       Transaction trans = null;
       Session session = AbsoluteUtil.getSessionFactory().openSession();
       
       try{
           trans = session.beginTransaction();
           session.update(plo);
           trans.commit();
       } catch (Exception e){
           System.out.println(e);
       }
   }
}

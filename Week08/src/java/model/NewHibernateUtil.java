/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author tp034196
 */
public class NewHibernateUtil {

    private static final SessionFactory sessionFactory;
    private Session s = null; //app with database
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void insert(Se x){
        s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(x);
        s.getTransaction().commit();
        s.close();
    }
    
    public void update(Se x){
        s = sessionFactory.openSession();
        s.beginTransaction();
        s.update(x);
        s.getTransaction().commit();
        s.close();
    }
    
    public Se search(String name){
        
        s = sessionFactory.openSession();
        s.beginTransaction();
        String sql = "FROM Se a WHERE a.name = '"+name+"'";
        Query q = (Query)s.createQuery(sql);
        Se found = null;
        for(Iterator it = q.iterate();it.hasNext();){
            Se y = (Se)it.next();
            found = new Se();
            found.setName(y.getName());
            found.setGender(y.getGender());
            found.setPassword(y.getPassword());
            found.setBalance(y.getBalance());
        }
        s.getTransaction().commit();
        s.close();
        return found;
    }
    
}

package org.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Test {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static EntityManager entityManager = sessionFactory.createEntityManager();

    public static void main(String[] args) {

        /**
         SPRAWDZENIE WERSJI BAZY DANYCH
         */
//        Session session  = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        //Chceck database version
//        String sql = "Select version();";
//
//        String result = (String) session.createNativeQuery(sql).getSingleResult();
//        System.out.println(result);
//
////        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.shutdown();


        /**
         * ENCJE - PROSTY CRUDs
         */





    }
}

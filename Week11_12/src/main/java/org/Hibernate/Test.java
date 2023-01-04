package org.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import java.time.LocalDate;

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

        Employee e1 = new Employee("Jan", "Kowalski", LocalDate.of(1977, 12, 6), "jkowalski@sda.com");
        Employee e2 = new Employee("Anna", "Nowak", LocalDate.of(1987, 10, 4), "anowak@onet.pl");

        /**
         * ENCJE - PROSTY CRUDs
         */
        // początek transmisji do bazy danych *************************************************************************
        entityManager.getTransaction().begin();

        entityManager.persist(e1);
        entityManager.persist(e2);

        // CRUD here
        // zapis encji - entityManager.persist(entity);
        // modyfikacje encji - entityManager.merge(entity);
        // usunięcie encji - entityManager.remove(entity);
        // wysukiwnie encji po id - entityManager.find(Entity.class(NazwaKlasy.class), 1(id));

        entityManager.persist(e1);
        entityManager.persist(e2);

        /**dodawanie pracownika do bazy danych*/
//        entityManager.persist(new Phone(EnumType.STRING, "3310i"));

        // koniec transmisji do bazy danych *************************************************************************
        entityManager.getTransaction().commit();
        HibernateUtil.shutdown();

    }
}

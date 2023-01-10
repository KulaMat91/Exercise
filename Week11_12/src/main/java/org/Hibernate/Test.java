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
//

        /**
         * Dodawanie pracownaika do bazy danych
         */

//        // początek transmisji do bazy danych *************************************************************************
//        entityManager.getTransaction().begin();

//        Employee e1 = new Employee("Jan", "Kowalski", LocalDate.of(1977, 12, 6), "jkowalski@sda.com");
//        Employee e2 = new Employee("Anna", "Nowak", LocalDate.of(1987, 10, 4), "anowak@onet.pl");
//
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(e1);
//        entityManager.merge(e2);

//        // koniec transmisji do bazy danych *************************************************************************
//        entityManager.getTransaction().commit();
//        HibernateUtil.shutdown();

        /**
         * ENCJE - PROSTY CRUDs
         */
        // początek transmisji do bazy danych *************************************************************************
        entityManager.getTransaction().begin();


        // CRUD here
        // zapis encji - entityManager.persist(entity);
        // modyfikacje encji - entityManager.merge(entity);
        // usunięcie encji - entityManager.remove(entity);
        // wysukiwnie encji po id - entityManager.find(Entity.class(NazwaKlasy.class), 1(id));


        /**dodawanie telefonu do bazy danych*/
//        entityManager.persist(new Phone(Phone.PhoneBrand.NOKIA, "3310i"));

        /**filtorwanie pracownika z bazy danych  i wyświetlanie informacje o nim */

//        Employee e1 = entityManager.find(Employee.class, 1);
//        Employee e2 = entityManager.find(Employee.class, 3);
//        System.out.println(e1);
//        System.out.println(e2);

        /** modyfikowanie pracownika z bazy danych */
        // 1 sposób - modyfikcja zwykłym seterem jego danych i dodatkowo wyświetlenie pracownika aby łatwiej było go modyfikować
//        Employee e1 = entityManager.find(Employee.class, 3);
//        System.out.println(e1);
//        e1.setEmail("joanna@gmail.com");
//        e1.setBirthday(LocalDate.of(1991, 05,23));
//        Phone phone = entityManager.find(Phone.class ,2);
//        e1.setPhone(phone);
//        entityManager.merge(e1);

        // 2 sposób - modyfikcja przez metode entityManage.merge(nazwaObiektu)

//        entityManager.merge(new Employee(1, "Hans", "Zimmer",
//                LocalDate.of(1969,10,12), "hanszimmer123@gmail.com"));

        /** usuwanie pracownika z bazy danych */
//        Employee e1 = entityManager.find(Employee.class, 3);
//        entityManager.remove(e1);

        /** dodawanie dwóch encji EMPLOYEE i PHONE */
//        Employee e1 = entityManager.find(Employee.class,2);
//        Phone phone = entityManager.find(Phone.class, 1);
//        e1.setPhone(phone);
//        entityManager.merge(e1);


        // koniec transmisji do bazy danych *************************************************************************
        entityManager.getTransaction().commit();
        HibernateUtil.shutdown();

    }

}

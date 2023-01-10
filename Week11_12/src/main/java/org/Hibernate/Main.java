package org.Hibernate;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class Main {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {
//        initData();
        exampleMethod("Kowal");
        HibernateUtil.shutdown();

    }

    public static void initData() {
        Employee e1 = new Employee("Jan", "Kowalski", LocalDate.of(1977,12,6), "jkowalksi@sda.com");
        Employee e2 = new Employee("Anna", "Nowak", LocalDate.of(1987,10,4), "anowak@onet.pl");
        Employee e3 = new Employee("Marek", "Kowal", LocalDate.of(1999,12,17), "marekk@gmail.com");

        Phone ph1 = new Phone(Phone.PhoneBrand.SAMSUNG, "S10");
        Phone ph2 = new Phone(Phone.PhoneBrand.NOKIA,"X1");
        Phone ph3 = new Phone(Phone.PhoneBrand.MOTOROLA,"123");

        e1.setPhone(ph1);
        e2.setPhone(ph2);
        e3.setPhone(ph3);

        Task t1 = new Task("Database schema", "Database schema creation", Task.TaskType.BLOCKER);
        Task t2 = new Task("Database script", "Creation of script for database generation", Task.TaskType.HIGH_PRIORITY);
        Task t3 = new Task("Security", "Security configuration", Task.TaskType.HIGH_PRIORITY);
        Task t4 = new Task("Login page", "[FRONTEND] Login page design", Task.TaskType.NORMAL);
        Task t5 = new Task("Login implementation", "User login backend implementation", Task.TaskType.NORMAL);
        Task t6 = new Task("Mail notifications", "Mail notifications implementation", Task.TaskType.LOW_PRIORITY);
        Task t7 = new Task("Password change", "[FRONTEND] Allow user to change password", Task.TaskType.LOW_PRIORITY);

        t1.setEmployee(e1);
        t2.setEmployee(e1);
        t3.setEmployee(e2);
        t4.setEmployee(e3);
        t5.setEmployee(e2);
        t6.setEmployee(e1);
        t7.setEmployee(e3);

        Project pr1 = new Project("Finance App");
        Project pr2 = new Project("Security");

        EntityManager em =sessionFactory.createEntityManager();

        em.getTransaction().begin();

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(ph1);
        em.persist(ph2);
        em.persist(ph3);
        em.persist(t1);
        em.persist(t2);
        em.persist(t3);
        em.persist(t4);
        em.persist(t5);
        em.persist(t6);
        em.persist(t7);
        em.persist(pr1);
        em.persist(pr2);

        em.getTransaction().commit();

    }

    public static  void exampleMethod(String  familyName){
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();

        int rowsChanged = em.createQuery("update Employee e set e.name='Adrian' where e.familyName = :param")
                .setParameter("param",familyName).executeUpdate();
        em.getTransaction().commit();
        System.out.println("Rows changed: " + rowsChanged);
    }
}

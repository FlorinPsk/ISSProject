package util;

import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Status.class)
                    .addAnnotatedClass(Location.class)
                    .addAnnotatedClass(Person.class)
                    .addAnnotatedClass(Timestamp.class)
                    .addAnnotatedClass(Crew.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }

}


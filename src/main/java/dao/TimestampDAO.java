package dao;

import entity.Location;
import entity.Timestamp;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.time.LocalDate;

public class TimestampDAO {

    public void saveTimestamp(Timestamp timestamp) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the timestamp object
            session.persist(timestamp);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateTimestamp(Timestamp timestamp) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(timestamp);
            Timestamp timestamp2 = session.get(Timestamp.class, 1);
            timestamp2.setTimestamp(LocalDate.of(2, 2, 2020));
            Location location = session.get(Location.class, 1);
            timestamp2.setLocation(location);
            timestamp2.setSpeed(28.000);
            session.persist(timestamp2);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Timestamp getTimestamp(int id) {
        Transaction transaction = null;
        Timestamp timestamp = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get a timestamp object
            timestamp = session.get(Timestamp.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return timestamp;
    }

    public void delete(Timestamp timestamp) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // remove the timestamp object
            session.remove(timestamp);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}


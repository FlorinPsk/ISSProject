package dao;

import entity.Status;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StatusDAO {

    public void saveStatus(Status status) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the iss object
            session.persist(status);
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

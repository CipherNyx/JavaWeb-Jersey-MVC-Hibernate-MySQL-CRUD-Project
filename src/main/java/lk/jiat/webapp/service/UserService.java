package lk.jiat.webapp.service;

import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserService {

    public User getByUserId(long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.createQuery("select u from User u where u.id=:id", User.class)
                .setParameter("id", id)
                .uniqueResult();
        session.close();
        return user;
    }

    public User getByUsernameAndPassword(String username, String password){
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.createQuery("select u from User u where u.username=:username and u.password=:password", User.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();
        return user;
    }

    public List<User> getAllUsers(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            List<User> users = session.createQuery("select u from User u", User.class).getResultList();
            return users;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void saveUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        session.close();
    }

    public void deleteUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(user);
        transaction.commit();
        session.close();
    }

}

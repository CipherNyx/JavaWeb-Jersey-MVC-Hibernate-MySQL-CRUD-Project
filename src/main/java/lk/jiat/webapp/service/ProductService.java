package lk.jiat.webapp.service;

import jakarta.persistence.NoResultException;
import lk.jiat.webapp.entity.Product;
import lk.jiat.webapp.entity.User;
import lk.jiat.webapp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductService {

    public Product getByProductId(long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.createQuery("select p from Product p where p.id=:id", Product .class)
                .setParameter("id", id)
                .uniqueResult();
        session.close();
        return product;
    }

    public List<Product> getAllProducts(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            List<Product> products = session.createQuery("select u from Product u", Product.class).getResultList();
            return products;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Product> searchByTitle(String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Product> products = session.createQuery("SELECT p FROM Product p WHERE p.title LIKE :product",Product.class)
                    .setParameter("product", "%"+title+"%").getResultList();;
            return products;
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }
    }

    public void saveProduct(Product product){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(product);
        transaction.commit();
        session.close();
    }

    public void updateProduct(Product product){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(product);
        transaction.commit();
        session.close();
    }

    public void deleteProduct(Product product){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(product);
        transaction.commit();
        session.close();
    }

}

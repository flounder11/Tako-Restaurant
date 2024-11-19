package ru.fodi.Tako.Restaurant.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import ru.fodi.Tako.Restaurant.model.*;

@Component
public class DataAccessLayer {
    private final SessionFactory sessionFactory;

    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    Session session = null;

    public void createClient(Client newClient) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newClient);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createAdditive(Additive newAdditive) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newAdditive);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createMenu(Menu newMenu) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newMenu);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createOrder(Order newOrder) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newOrder);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void createProduct(Product newProduct) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newProduct);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
}

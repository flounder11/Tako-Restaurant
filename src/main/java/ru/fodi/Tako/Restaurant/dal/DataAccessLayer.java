package ru.fodi.Tako.Restaurant.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.fodi.Tako.Restaurant.model.*;

@Component
public class DataAccessLayer {
    private final SessionFactory sessionFactory;
    @Autowired
    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    Session session = null;

//    Post

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

//    Delete

    public void deleteClientById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Client client = session.get(Client.class, id);
        session.remove(client);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteAdditiveById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Additive additive = session.get(Additive.class, id);
        session.remove(additive);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteMenuById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Menu menu = session.get(Menu.class, id);
        session.remove(menu);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteOrderById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Order order = session.get(Order.class, id);
        session.remove(order);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void deleteProductById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.remove(product);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

//    Get

    public Client getClientById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Client client = session.get(Client.class, id);
            return client;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Additive getAdditiveById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Additive additive = session.get(Additive.class, id);
            return additive;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Menu getMenuById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Menu menu = session.get(Menu.class, id);
            return menu;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Order getOrderById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Order order = session.get(Order.class, id);
            return order;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Product getProductById(long id){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try{
            Product product = session.get(Product.class, id);
            return product;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }

//    Patch

    public Client patchClientById(long id, Client client){
        session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            Client updatedClient = session.get(Client.class, id);

            updatedClient.setNameClient(client.getNameClient());
            updatedClient.setPhoneClient(client.getPhoneClient());
            updatedClient.setPhoneClient(client.getPhoneClient());
            updatedClient.setEmailClient(client.getEmailClient());

            session.merge(updatedClient);
            session.getTransaction().commit();
            return updatedClient;
        } finally {
            if (session != null){
                session.close();
            }
        }
    }
}

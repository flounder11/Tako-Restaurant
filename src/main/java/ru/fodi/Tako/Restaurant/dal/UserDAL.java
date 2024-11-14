package ru.fodi.Tako.Restaurant.dal;

import ru.fodi.Tako.Restaurant.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAL {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAL(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}

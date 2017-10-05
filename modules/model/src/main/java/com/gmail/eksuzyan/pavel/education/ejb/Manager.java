package com.gmail.eksuzyan.pavel.education.ejb;

import com.gmail.eksuzyan.pavel.education.ejb.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Pavel Eksuzian.
 *         Created: 03.10.2017.
 */
public class Manager {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EjbApp");
        EntityManager entityManager = factory.createEntityManager();

        Product product = new Product();

        product.setType("A good thing");

        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
    }

}

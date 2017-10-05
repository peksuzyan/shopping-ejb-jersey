package com.gmail.eksuzyan.pavel.education.ejb.session;

import com.gmail.eksuzyan.pavel.education.ejb.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * @author Pavel Eksuzian.
 *         Created: 04.10.2017.
 */

@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 20)
public class CartBean implements Cart {

    @PersistenceContext(unitName = "EjbApp", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    private List<Product> products;

    @PostConstruct
    private void initializeBean(){
        products = new ArrayList<>();
    }

    @Override
    public void addProductToCart(Product product) {
        products.add(product);

    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void checkOut() {
        for(Product product : products){
            entityManager.persist(product);
        }
        products.clear();

    }
}
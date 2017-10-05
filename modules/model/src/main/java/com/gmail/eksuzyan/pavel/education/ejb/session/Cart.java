package com.gmail.eksuzyan.pavel.education.ejb.session;

import javax.ejb.Local;

import com.gmail.eksuzyan.pavel.education.ejb.model.Product;

/**
 * @author Pavel Eksuzian.
 *         Created: 04.10.2017.
 */
@Local
public interface Cart {

    void addProductToCart(Product product);

    void checkOut();

}

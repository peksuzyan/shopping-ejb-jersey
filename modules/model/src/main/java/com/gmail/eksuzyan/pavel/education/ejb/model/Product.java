package com.gmail.eksuzyan.pavel.education.ejb.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Pavel Eksuzian.
 *         Created: 03.10.2017.
 */
@Entity
@Table(name = "PRODUCT", catalog = "shop")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String description) {
        this.type = description;
    }

}
package eatclean.project.demo.enity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.engine.internal.ForeignKeys;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userID", referencedColumnName = "userID", foreignKey = @ForeignKeys(name = "fk_orders_users"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productID", referencedColumnName = "productID", foreignKey = ForeignKeys(
            name = "fk_orders_products"))
    private Products products;

    @Column(name="orderDate")
    private Date datetime;

    public Order(){}
    public Order(int id, User user, Products products, Date datetime){
        this.id=id;
        this.user=user;
        this.products=products;
        this.datetime=datetime;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }
    public Date getDatetime() {
        return datetime;
    }
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    
}

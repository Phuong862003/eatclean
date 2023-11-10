package eatclean.project.demo.enity;

import java.util.Date;

<<<<<<< HEAD
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
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
<<<<<<< HEAD
    @JoinColumn(name="userID", referencedColumnName = "userID", foreignKey = @ForeignKeys(name = "fk_orders_users"))
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productID", referencedColumnName = "productID", foreignKey = ForeignKeys(
            name = "fk_orders_products"))
    private Products products;

=======
    @JoinColumn(name="userID", referencedColumnName = "userID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productID", referencedColumnName = "productID")
    private Products products;

    @Column(name = "thanhtien")
    private float money;

>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1
    @Column(name="orderDate")
    private Date datetime;

    public Order(){}
<<<<<<< HEAD
    public Order(int id, User user, Products products, Date datetime){
        this.id=id;
        this.user=user;
        this.products=products;
        this.datetime=datetime;
    }
=======
    public Order(int id, User user, Products products, float money, Date datetime){
        this.id=id;
        this.user=user;
        this.products=products;
        this.money = money;
        this.datetime=datetime;
    }
    
>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1
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
<<<<<<< HEAD
=======
    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }
>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1
    
}

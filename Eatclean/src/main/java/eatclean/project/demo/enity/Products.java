package eatclean.project.demo.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "image")
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cateID")
    private Categories categories;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "metaKeywords")
    private String metaKeywords;

    @Column(name = "metaDescriptions")
    private String metaDescriptions;

    // @Column(name = "createdBy")
    // private Integer createdBy;

    // @Column(name = "createdDate")
    // private String createdDate;

    // @Column(name = "updateBy")
    // private int updateBy;

    // @Column(name = "updateDate")
    // private String updateDate;

    public Products() {
        // super();
    }

    // public Products(int id, String name, String image, int quantity, float price) {
    //     this.id = id;
    //     this.name = name;
    //     this.image = image;
    //     this.quantity = quantity;
    //     this.price = price;
    // }

    public Products(int id, String name, String status, String description, float price, String image,
            Categories categories, int quantity, String metaKeywords, String metaDescriptions) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.description = description;
        this.price = price;
        this.image = image;
        this.categories = categories;
        this.quantity = quantity;
        this.metaKeywords = metaKeywords;
        this.metaDescriptions = metaDescriptions;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescriptions() {
        return metaDescriptions;
    }

    public void setMetaDescriptions(String metaDescriptions) {
        this.metaDescriptions = metaDescriptions;
    }

   

    

}

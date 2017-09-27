/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem.db;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author P00004
 */
@Entity
@Table(name = "PRODUCT", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findByCategoryId", query = "SELECT p FROM Product p WHERE p.categoryId = :categoryId"),
    @NamedQuery(name = "Product.findByProductPrice", query = "SELECT p FROM Product p WHERE p.productPrice = :productPrice")})
public class Product implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @Column(name = "CATEGORY_ID", nullable = false)
    private long categoryId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE", nullable = false)
    private double productPrice;

    public Product() {
    }

    public Product(Long id) {
        this.id = id;
    }

    public Product(Long id, String name, long categoryId, double productPrice) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.productPrice = productPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        long oldCategoryId = this.categoryId;
        this.categoryId = categoryId;
        changeSupport.firePropertyChange("categoryId", oldCategoryId, categoryId);
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        double oldProductPrice = this.productPrice;
        this.productPrice = productPrice;
        changeSupport.firePropertyChange("productPrice", oldProductPrice, productPrice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pointofsalesystem.db.Product[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

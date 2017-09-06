/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem;

import java.util.HashMap;

public class Order {

    private Integer id;
    private HashMap<Integer, OrderDetail> orderDetail = new HashMap<Integer, OrderDetail>();
    private Double subTotal;
    private Double discount;
    private Double tax;
    private Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Integer, OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(HashMap<Integer, OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double Total) {
        this.total = Total;
    }
}

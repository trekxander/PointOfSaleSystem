package pointofsalesystem;

import java.util.HashMap;

public class Sales {

    private Integer id;
    private HashMap<Integer, OrderItem> orderItem = new HashMap<>();
    private Double subTotal = 0.0;
    private Double discount = 0.0;
    private Double tax = 0.0;
    private Double total = 0.0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<Integer, OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(HashMap<Integer, OrderItem> orderDetail) {
        this.orderItem = orderDetail;
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

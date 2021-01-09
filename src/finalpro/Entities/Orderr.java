/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro.Entities;

/**
 *
 * @author FOR LAPTOP
 */
public class Orderr {
    
 private String customer;
 private String product;
 private String order_Date;
 private int quantity;
 private int totalPrice;
 
    public Orderr(String customer, String product, String order_Date, int quantity, int totalPrice) {
        this.customer = customer;
        this.product = product;
        this.order_Date = order_Date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    /**
     * @return the customerId
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customer) {
        this.customer = customer;
    }

    /**
     * @return the productId
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.product = product;
    }

    /**
     * @return the order_Date
     */
    public String getOrder_Date() {
        return order_Date;
    }

    /**
     * @param order_Date the order_Date to set
     */
    public void setOrder_Date(String order_Date) {
        this.order_Date = order_Date;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    
    
}

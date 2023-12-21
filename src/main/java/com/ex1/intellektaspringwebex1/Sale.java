package com.ex1.intellektaspringwebex1;

import java.sql.Date;

public class Sale {
    private int id;
    private String product_id;
    private Date store_date;
    private Date sales_date;
    private float price;

    public Sale() {
        id = 0;
        product_id = "0000";
        store_date = new Date(0);
        sales_date = store_date;
        price = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Date getStore_date() {
        return store_date;
    }

    public void setStore_date(Date store_date) {
        this.store_date = store_date;
    }

    public Date getSales_date() {
        return sales_date;
    }

    public void setSales_date(Date sales_date) {
        this.sales_date = sales_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", product_id='" + product_id + '\'' +
                ", store_date=" + store_date +
                ", sales_date=" + sales_date +
                ", price=" + price +
                '}';
    }
}

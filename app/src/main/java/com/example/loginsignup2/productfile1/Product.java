package com.example.loginsignup2.productfile1;

public class Product {
    @Override
    public String toString() {
        return "product{" +
                "Price=" + Price +
                ", Type='" + Type + '\'' +
                ", NameProduct='" + NameProduct + '\'' +
                ", NumberProduct=" + NumberProduct +
                '}';
    }

    private String Type;
    private Integer  Price;
    private String NameProduct;
    private Integer NumberProduct;

    public int getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }
    public Integer getNumberProduct() {
        return NumberProduct;
    }
    public void setNumberProduct(Integer numberProduct){
        NumberProduct = numberProduct;
    }




    public Product(Integer price, String type, String nameProduct) {
        Price = price;
        Type = type;
        NameProduct = nameProduct;
    }



}



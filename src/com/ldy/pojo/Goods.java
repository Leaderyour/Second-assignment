package com.ldy.pojo;

public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private Integer byNum;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", byNum=" + byNum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getByNum() {
        return byNum;
    }

    public void setByNum(Integer byNum) {
        this.byNum = byNum;
    }
}

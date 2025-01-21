package com.SpringApi.Api.Entities;

public class Books {

    int id;
    String name;
    String title;
    int price;

    public Books(int id, String name, String title, int price) {
        super();

        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;

    }

    public Books() {
        super();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Books [id=" + id + ", name=" + name + ", title=" + title + ", price=" + price + "]";
    }

}

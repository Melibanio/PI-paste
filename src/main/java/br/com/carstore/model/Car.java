package br.com.carstore.model;

public class Car {

    private String id;
    private String name;
    private String color;
    private String model;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
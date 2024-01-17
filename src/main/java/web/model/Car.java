package web.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {
    private Integer id;
    private String model;
    private Integer series;
    private String color;

    public Car(Integer id, String model, Integer series, String color) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car {" +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", series = " + series +
                ", color = '" + color + '\'' +
                '}' + "\n";
    }


}

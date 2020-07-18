package se.lexicon.zainabahmed;

public class Car {
    private int id,
                year;
    private String model,
                   color,
                   motorSize;

    public Car(int id, int year, String model, String color, String motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }
public Car(){
        this(1, 2018, "eTech160auto ", "red ", "160hp ");
}
public Car(int id, int year, String model){

}

    public void drive(){
    System.out.println(model + " with motor " +motorSize + " can drive now ");
}
}

package se.lexicon.zainabahmed;

public class Rectangle {
    private double height,
                    width;
    public Rectangle(){
    this(2.5,3.5);
    }
    public Rectangle(double height, double width){

    }
    //getters
    public  double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    //setters
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }
    //methods
    public double getArea(double userHeight, double userWidth){
        return userHeight * userWidth;
    }
}

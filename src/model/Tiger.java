package model;

public class Tiger extends Mammal{

    public Tiger(){
        super(4,"Tigru", 36.0f, 92.0f);
    }
    public String toString() {
        return "Tiger: " + super.toString();
    }
}

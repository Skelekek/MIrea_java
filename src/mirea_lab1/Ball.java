package mirea_lab1;
import java.lang.*;
public class Ball {
    private String Colour;
    private String manufacturer;

    public Ball(String colour, String manufacturer) {
        setColour(colour);
        setManufacturer(manufacturer);

    }
    public void setColour(String Colour) { this.Colour = Colour; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getBallColour() {return Colour; }
    public String getballMenufacturer() {return  this.manufacturer; }
    public String toString() {
        return "Ball Colour: " + "\nBall manufacturer: " + this.manufacturer + "\n";
    }

}

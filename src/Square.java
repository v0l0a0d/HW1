/**
 * Created by hillel on 27.07.17.
 */
public class Square implements Shape {

    double a = 0;
    Colour colour;

    public Square(double a, Colour colour){
        this.colour = colour;
        this.a = a;
    }

    public double size() {
        return Math.pow(a, 2);
    }



    public Colour colour() {
        return colour;
    }


}

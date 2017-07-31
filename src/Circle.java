public class Circle implements Shape {
    double r;
    Colour colour;

    public Circle(double r, Colour colour){
        this.colour = colour;
        this.r = r;
    }

    public double size() {
        return Math.PI * Math.pow(r, 2);
    }


    public Colour colour() {
        return colour;
    }

}

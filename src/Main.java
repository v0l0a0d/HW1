import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape first = new Circle(5, Colour.RED);
        Shape second = new Square(3, Colour.BLUE);
        Shape third = new Square(3, Colour.GREEN);
        Shape forth = new Square(5, Colour.GREEN);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(first);
        shapes.add(second);
        shapes.add(third);
        shapes.add(forth);


        calculateCost(shapes,Colour.GREEN);
        System.out.println("MostExpensive: " + findMostExpensive(shapes));
    }


    private static void calculateCost(List<Shape> shapes, Colour filter) {

        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i).colour() == filter) {
                double result = shapes.get(i).size() * (shapes.get(i).colour().getCost());
                System.out.println(result);
            }
        }

    }


    private static double findMostExpensive(List<Shape> shapes){

        double result = shapes.get(0).size() * (shapes.get(0).colour().getCost());

        for (int i = 0; i < shapes.size(); i++){
            double result2 = shapes.get(i).size() * (shapes.get(i).colour().getCost());

            if (result < result2) { result = result2; }
        }
        return result;
    }

}



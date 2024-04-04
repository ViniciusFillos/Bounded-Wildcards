package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(3.0));
        myShapes.add(new Circle(2.0));

//        System.out.println("Total area: " + totalArea(myShapes));
//        System.out.println("Total area: " + totalArea(myCircles));

        List<Integer> myInts = Arrays.asList(3, 4, 5);
        List<Double> myDoubles = Arrays.asList(2.1, 3.5, 6.7);
        List<Object> myObjs = new ArrayList<>();

        myObjs = copy(myInts, myObjs);
        printList(myObjs);

        myObjs.clear();

        myObjs = copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

    public static List copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
        return destiny;
    }

    public static void printList(List<?> myObjs) {
        System.out.println();
        for(Object obj : myObjs) {
            System.out.println(obj);
        }
    }
}

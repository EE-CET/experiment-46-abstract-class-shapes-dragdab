
abstract class Shape {
    
    abstract void numberOfSides();
}


class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides of Rectangle is 4");
    }
}


class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides of Triangle is 3");
    }
}


class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides of Hexagon is 6");
    }
}

public class AbstractShapes {
    public static void main(String[] args) {
        // Creating objects for each shape
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();

        // Calling the methods
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}

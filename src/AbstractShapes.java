
abstract class Shape {
    
    abstract void numberOfSides();
}


class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 Sides");
    }
}


class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}


class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
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

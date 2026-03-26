class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void displayPoint() {
        System.out.println("Center Point is (" + x + "," + y + ")");
    }
}

class Circle {
    Point center;
    double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    void displayCircle() {
        center.displayPoint();
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + 2*(22/7)*radius);
    }
}

class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Circle c = new Circle(p, 5.5);
        c.displayCircle();
    }
}
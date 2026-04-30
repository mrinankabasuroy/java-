import java.util.*;

// Abstract class
abstract class AbstractProduct {
    int product_id;

    abstract void getData(Scanner sc);
    abstract void display();
}

// Travel Guide Book
class TravelGuide extends AbstractProduct {
    String title, author;

    void getData(Scanner sc) {
        System.out.print("Enter Product ID: ");
        product_id = sc.nextInt();
        System.out.print("Enter Title: ");
        title = sc.next();
        System.out.print("Enter Author: ");
        author = sc.next();
    }

    void display() {
        System.out.println("Travel Guide -> ID: " + product_id + ", Title: " + title + ", Author: " + author);
    }
}

// CD class
class CD extends AbstractProduct {
    String name, artist;

    void getData(Scanner sc) {
        System.out.print("Enter Product ID: ");
        product_id = sc.nextInt();
        System.out.print("Enter CD Name: ");
        name = sc.next();
        System.out.print("Enter Artist: ");
        artist = sc.next();
    }

    void display() {
        System.out.println("CD -> ID: " + product_id + ", Name: " + name + ", Artist: " + artist);
    }
}

// Main class
public class AbstractProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AbstractProduct p1 = new TravelGuide();
        AbstractProduct p2 = new CD();

        p1.getData(sc);
        p2.getData(sc);

        p1.display();
        p2.display();
    }
}
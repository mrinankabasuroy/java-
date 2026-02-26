public class innerOuter {

    static class Inner {
        void display() {
            System.out.println("You're inside the class");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.display();
    }
}

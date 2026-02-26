class PositiveNegative {

    int number;

    void check() {
        if (number > 0)
            System.out.println("Positive");
        else if (number < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.number = -5;
        obj.check();
    }
}
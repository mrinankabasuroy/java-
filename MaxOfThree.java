class MaxOfThree {

    int a, b, c;

    void findMax() {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        MaxOfThree obj = new MaxOfThree();
        obj.a = 10;
        obj.b = 25;
        obj.c = 15;
        obj.findMax();
    }
}
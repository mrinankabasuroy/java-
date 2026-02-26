class Fibonacci {

    int n;

    void printSeries() {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.n = 10;
        obj.printSeries();
    }
}
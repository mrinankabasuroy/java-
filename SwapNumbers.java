class SwapNumbers {

    int a, b;

    void swap() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        SwapNumbers obj = new SwapNumbers();
        obj.a = 5;
        obj.b = 10;
        obj.swap();
    }
}
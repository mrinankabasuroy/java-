public class factorialNumber {
    public static void main(String[] args) {
        int f = 1;
        int num = 5;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.println("Factorial = "+ f);
    }
}

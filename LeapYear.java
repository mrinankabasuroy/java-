class LeapYear {

    int year;

    void check() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.year = 2024;
        obj.check();
    }
}
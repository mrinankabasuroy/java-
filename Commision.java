class Commission {

    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        return sales * 0.1;  // 10% commission
    }
}

class Demo {
    public static void main(String[] args) {

        double saleValue = 10000;

        if (saleValue < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission obj = new Commission(saleValue);
            System.out.println("Commission = " + obj.commission());
        }
    }
}
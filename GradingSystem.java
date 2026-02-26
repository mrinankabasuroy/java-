class GradingSystem {

    int marks;

    void grade() {
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        GradingSystem obj = new GradingSystem();
        obj.marks = 82;
        obj.grade();
    }
}
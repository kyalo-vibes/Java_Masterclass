    package classesandobjectsextended;

public class recursionRisk {

    public static void main(String[] args) {
        recursionMeth();
    }

    static void recursionMeth() {
        System.out.println("Entered..");
        recursionMeth();
        System.out.println("This message will never be displayed");
    }

}

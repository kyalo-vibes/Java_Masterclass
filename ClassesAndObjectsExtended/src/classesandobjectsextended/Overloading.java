package classesandobjectsextended;

public class Overloading {

    public static void main(String[] args) {
        Maths obj = new Maths(20);

        System.out.println(obj.addition(10, 20));
        System.out.println(obj.addition(10.3, 20));
        System.out.println(obj.addition(10, 50, 60));
    }

}

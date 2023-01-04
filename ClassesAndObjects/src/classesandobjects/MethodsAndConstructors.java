package classesandobjects;

public class MethodsAndConstructors {

    public static void main(String[] args) {

        Maths obj1 = new Maths(10, 40);
        Maths obj2 = new Maths(20, 20);
        
        Maths obj3 = obj1;
        obj3.x = 30;
        Maths obj4 = obj3;
        
        Maths obj5 = new Maths(obj1.x, obj2.y);
        
        System.out.println(obj1.addition());
        System.out.println(obj2.addition());
        System.out.println(obj3.addition());
        System.out.println(obj4.addition());
        System.out.println(obj5.addition());
    }
}

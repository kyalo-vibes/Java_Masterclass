package classesandobjects;

public class ThisKeyword {

    public static void main(String[] args) {
        
        Maths obj = new Maths(10,20);
        Maths obj1 = new Maths(10,20);
        
        obj.setValues(50, 50);
        
        System.out.println(obj.addition());

    }
}

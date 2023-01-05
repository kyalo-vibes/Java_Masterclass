package classesandobjectsextended;

public class InnerClassMain {

    public static void main(String[] args) {
        InnerClassOuter outerObj = new InnerClassOuter();
        
        InnerClassOuter.InnerClass innerClassObj = outerObj.new InnerClass();
        
        innerClassObj.meth();

    }

}

package classesandobjectsextended;

public class StaticNestedClassMain {

    public static void main(String[] args) {
        StaticNestedClassOuter.StaticNestedClassInner nested = new StaticNestedClassOuter.StaticNestedClassInner();

        nested.meth();

    }

}

package classesandobjectsextended;

public class LocalClassExample {

    void methodOuter() {
        int x = 10;
        
        class LocalClass {

            void meth() {
                System.out.println("x = " + x);
            }
        }

        LocalClass locObj = new LocalClass();

        locObj.meth();

    }

    public static void main(String[] args) {
        LocalClassExample objOuter = new LocalClassExample();

        objOuter.methodOuter();

    }
}

package classesandobjects;

public class StaticKeyword {

    public static void main(String[] args) {

        Car obj = new Car(7, 1.8F);
        Car obj1 = new Car(5, 1.7F);
        Car obj2 = new Car(6, 1.4F);
        Car obj3 = new Car(5, 1.7F);

        /*obj.display();
        obj1.display();
        obj2.display();
        obj3.display();*/
        
        Car.staticMeth();
    }
}

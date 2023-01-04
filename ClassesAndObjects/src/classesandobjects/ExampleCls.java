package classesandobjects;

public class ExampleCls {

    void example1(int x) {
        x = 100;
    }

    void example2(Maths mathsObj) {
        mathsObj.x = 100;
    }

    void example3(Maths mathsObj) {
        
        Maths newObj = new Maths(10,10);
        mathsObj = newObj;
        
        mathsObj.x = 20;
    }
}

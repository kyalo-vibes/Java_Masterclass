package classesandobjects;

public class ObjectExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 100;
        
        Maths mathsObj = new Maths(7, 10);   
        Car carObj = new Car(7, 1.8F);
        
        //carObj.objParmExample(mathsObj);
        //System.out.println(mathsObj.addition());
        
        System.out.println(carObj.objReturnExample().addition());
        
        
    }
}

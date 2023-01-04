package classesandobjects;

public class PassByValue {

    public static void main(String[] args) {

        ExampleCls obj = new ExampleCls();
        Maths mathsObj = new Maths(5,5);
        
        //Scenario one
        int x = 10;
        obj.example1(x);
        System.out.println(x);
        
        //Scenario two
        obj.example2(mathsObj);
        System.out.println(mathsObj.addition());
        
        //Scenario three
        obj.example3(mathsObj);
        System.out.println(mathsObj.addition());
        
    }
}

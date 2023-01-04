package classesandobjects;

public class Car {

    final static int wheelCount = 4;
    
    static int count = 0;

    int gearCount = 0;

    float height = 0.0F;

    Car(int geatCount, float height) {
        this.gearCount = gearCount;
        this.height = height;
        
        count++;
    }

    static void staticMeth(){
        System.out.println(count);
    }
    
    void objParmExample(Maths mathsObj){
    mathsObj.x = 100;
    }
    
    Maths objReturnExample(){
    return new Maths(70,30);
    }
    
    void display() {
        System.out.print("Gear Count/Height/Wheel Count/ : " + gearCount + "/" + height + "/" + wheelCount + "\n");
    }
}

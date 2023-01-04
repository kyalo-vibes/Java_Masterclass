package classesandobjects;

public class Triangle {
    int base;
    int height;
    int hypotenuse;
    Triangle(int x, int y, int z){
        this.base = x;
        this.height = y;
        this.hypotenuse = z;
    }

    int getPerimeter(){
        return (base + height + hypotenuse);
    }
    int getArea() {
        return ((base * height)/2);
    }
}

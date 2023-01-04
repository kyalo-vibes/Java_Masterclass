package classesandobjects;

public class areaPerimeter {
    public static void main(String[] args){
        Triangle obj = new Triangle(3, 4, 5);
        // System.out.println(obj.getPerimeter());
        System.out.println("Permieter of triangle is :" + obj.getPerimeter());
        System.out.println("Area of triangle is :" + obj.getArea());
    }
}

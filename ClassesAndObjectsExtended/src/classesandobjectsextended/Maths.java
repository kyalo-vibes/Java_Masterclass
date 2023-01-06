package classesandobjectsextended;

public class Maths {

    int x;
    int y;

    Maths() {
    }
    
    Maths(int y) {
        this();
        this.y = y;
    }

    int addition(int x, int y) {
        return (x + y);
    }

    double addition(double x, int y) {
        return (x + y);
    }

    int addition(int x, int y, int z) {
        return (x + y + z);
    }
}

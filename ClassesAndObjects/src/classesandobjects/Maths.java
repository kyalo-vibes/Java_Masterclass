package classesandobjects;

public class Maths {

    int x;
    int y;

    Maths(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setValues(int x, int y) {
        x = x;
        y = y;
    }

    int addition() {
        return (x + y);
    }

    void product() {
        System.out.println(x * y);
    }
}

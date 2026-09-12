package one.terenin.oop.example;

// extends - Triangle inherits GeometricalFigure
// implements - Triangle implement unimplemented behavior of Perimeter

public class Triangle extends GeometricalFigure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("I am triangle");
    }

    public final int perimeter() {
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

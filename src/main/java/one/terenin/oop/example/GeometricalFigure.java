package one.terenin.oop.example;

public abstract class GeometricalFigure {

    private int dimension = 2;
    private int size = 1;

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public abstract int perimeter();
}

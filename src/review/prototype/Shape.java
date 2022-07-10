package review.prototype;

public abstract class Shape implements Cloneable{
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    public abstract void draw();
}

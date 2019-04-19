package lesson7;

public class Box {
    public double width; // ширина
    public double height; // высота
    public double depth; // глубина


    public void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);
    }

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

}
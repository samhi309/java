import java.io.*;
interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
public class Demointerface{
    public static void main(String args[]){
        Drawable d = new Circle();
        d.draw();
        Drawable r = new Rectangle();
        r.draw();
    }
}

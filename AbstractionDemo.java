import java.io.*;
import java.util.*;
abstract class Animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("zzzzzzz");
}
}
class Cat extends Animal{
    public void animalsound(){
        System.out.println("The cat sounds meow");
    }
}
public class AbstractionDemo{
    public static void main(String args[]){
        Cat c=new Cat();
        c.animalsound();
        c.sleep();
        
    }
}

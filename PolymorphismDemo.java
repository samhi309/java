import java.io.*;
class Animal{
    public void animalSound(){
        System.out.println("An animal can make sounds");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("A cow sounds-mawwww");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("A cat sounds=meowmeow");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal an=new Animal();
        Animal myCow=new Cow();
        Animal myCat=new Cat();
        an.animalSound();
        myCow.animalSound();
        myCat.animalSound();
    }
}

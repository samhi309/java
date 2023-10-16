 import java.io.*;
 class Animal{
     void eat(){
         System.out.println("Animal can eat");
     }
 }
 class Dog extends Animal{
     void bark(){
         System.out.println("Dog can bark");
     }
 }
 class BabyDog extends Dog{
     void beep(){
         System.out.println("BabyDog can beep");
     }
 }
public class MultilevelInheritanceDemo{
     public static void main(String args[]){
         BabyDog bd = new BabyDog();
         bd.beep();
         bd.bark();
         bd.eat();
     }
 }

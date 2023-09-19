import java.io.*;
class Student{
    int Rollno;
    String name;
    float Fee;
    Student(int Rollno,String name,float Fee){
        this.Rollno=Rollno;
        this.name=name;
        this.Fee=Fee;
    }
    void display(){
        System.out.println("Student details are ");
        System.out.println(Rollno+" "+name+" "+Fee+" ");
        }
}
public class ThisDemo1{
    public static void main(String args[]){
        Student s1=new Student (4222,"samhi",85000);
        Student s2=new Student (4221,"lasya",25000);
        s1.display();
        s2.display();
    }
}

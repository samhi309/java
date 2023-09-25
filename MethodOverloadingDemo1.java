import java.io.*;
import java.util.*;
class Addar{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloadingDemo1{
    public static void main(String args[]){
        Addar ad=new Addar();
        int x=ad.add(5,10);
        int y=ad.add(10,20,30);
        int z=ad.add(x,y);
        System.out.println("X value is "+x);
        System.out.println("Y value is "+y);
        System.out.println("Z value is "+z);
    }
} 

import java.io.*;
import java.util.*;
public class CheckPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer number to check whether it is an palindrome or not : ");
         int n=sc.nextInt();
        int rev=0;
        int temp = n;
        while(n>0)
        {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println(temp+"is a palindrome");
        }
        else
        {
            System.out.println(temp+"is not a palindrome");
        }
    }
}

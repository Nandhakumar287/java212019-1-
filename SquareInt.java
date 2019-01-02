import java.io.*;
import java.util.*;
  public class SquareInt{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Input Integer:");
      int input=sc.nextInt();
      int dig,ans=0;
      while(input!=0)
      {
        dig=input%10;
        ans=ans+(dig*dig);
        input=input/10;
      }
      System.out.println("Result:"+ans);
   }
 }  

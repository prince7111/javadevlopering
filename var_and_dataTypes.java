package javadevlopering;
import java.util.*;


public class var_and_dataTypes {
    public static void main(String args[]){
      
        //sum of a and b Using Scanner
       Scanner prince = new Scanner (System.in);
       System.out.println("Enter your number firs:");
        int a = prince.nextInt(); // input frome user
         System.out.println("Enter your number second:");
        int b = prince.nextInt(); // input from user
        int sum = a+b;
        System.out.println("the sum of "+a+" + "+b+" is ="+sum);

    }
    
}

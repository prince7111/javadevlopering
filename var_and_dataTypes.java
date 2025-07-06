package javadevlopering;
import java.util.*;


public class var_and_dataTypes {
    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);
       // Q.1 avrage of three number
         System.out.println("Entere your number First:");
         int n1 = sc.nextInt();
         System.out.println("Entere your number second:");
         int n2 = sc.nextInt();
          System.out.println("Entere your number Third:");
         int n3 = sc.nextInt();
         int avrage = (n1+n2+n3)/3;
         System.out.println("the avrage :");
         System.out.println(avrage);//  problem starting frome basics its start and i become hard devloper
         //Q.2 Area of Square
         int side = sc.nextInt();
         int AreaofSuare = side*side; //area of suare fromula : side*side;
         System.out.println("the area of square is="+AreaofSuare);
         //Q.3 calculate bill and add gst 18%
         int pen =3;
         int pencile = 5;
         int eraser =5;
         int bill = pen+pencile+eraser;
         float gstCal = bill*0.18f;
         float finalBill = bill+gstCal;
         System.out.println("your final bill + 0.18 gst is="+finalBill);
        

    


    }
    
}

package javadevlopering;
import java.util.*;
public class loopjava{
    public static void main(String args[]){
        System.out.println("Hello World (IV)");
        System.out.println("Java || Ch-04-||Loops");

        Scanner sc = new Scanner (System.in);// Scanner class

        // //Q.1:How many times hello is printed
        // for(int i=0; i<5; i++){
        //     System.out.println("hello");//two times

        //     i+=2;
        // }
        //Q.2 writw a java prog. that read a set of intiger and then sum of odd even numbers(using Scanner class)
        // int number;
        //  int odd=0;
        // int even=0 ;
        // String choise;
        // do{
        //     System.out.println("entere your intgere");
        //     number =sc.nextInt();
          
           
        //     if(number %2 ==0){  
        //         even+=number;
        //     }else{
        //         odd+=number;
        //     }
        //     System.out.println("Sum of even="+even);
        //     System.out.println("sum of oddd="+odd);
        //     sc.nextLine();
        //     System.out.println("ar yoy want to continue");
        //     choise =sc.nextLine().toLowerCase();

        // }while(choise.equals("yes"));
        //     System.out.println("progema finish");
        //     Scanner close;

        //Q.3 factorial // find factoral of A number given by users
        // System.out.println("entere your no:");
        // int n =sc.nextInt();
        // int factoral=1;
        // for(int i =1; i<=n; i++){
        //     factoral =factoral*i;
        // }
        // System.out.println("factorial of no ="+factoral);
        
        //Q.4 Multiplication table of any number
        // System.out.println("entere your numero here:");
        // int n = sc.nextInt();
        // int table =1;
        // for(int i =1;i<=10;i++){
        // table =n*i;
        // System.out.println(n+" * "+i+" =  "+table);
        // }
        // Q.5 check What wrong in this programme
        for(int i =0;i<=5;i++){
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop ===+i");// i out of the bloack of code or loops
        
    }
}
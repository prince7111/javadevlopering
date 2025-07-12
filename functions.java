package javadevlopering;
public class functions {

     //  Q.1 write a java programe to compute the average of three number
    public static float clcAvg(int a,int b,int c){ // one
        return (a+b+c)/3.0f;
    }//Q.2 Write a mathod isEven that accepts an int argument the method return true of the argument is even or false other wise.
                                          //          Also write a proggram to test your method
    public static boolean isEven(int n){
        if (n % 2 == 0){            
            return true;
        }
           return false;
    }
    // Q.3 isPalindrome Method
    public static boolean isPalindrome(int n){
        int origNUm =n;
        int flip =0;
        while( n>0){
            int lastDig = n % 10;
            flip = flip * 10 +lastDig;
            n = n/10;
            
        }
        System.out.println("n =:"+n);
        System.out.println("origNum ="+origNUm);
        System.out.println("flip number:"+flip);
        if (origNUm == flip){
            return true;
        }
        return false;
    }

    
    
    public static void main(String []args) {
     
         //Q.3 check if number is palindrome or not
          System.out.println(isPalindrome(121));




    }
    
}

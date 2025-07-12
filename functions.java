package javadevlopering;
public class functions {
    public static float clcAvg(int a,int b,int c){ // one
        return (a+b+c)/3.0f;
    }
    public static boolean isEven(int n){
        if (n % 2 == 0){            
            return true;
        }
           return false;
    }
    
    public static void main(String[] args) {
     
      //  Q.1 write a java programe to compute the average of three number
      //Q.2 Write a mathod isEven that accepts an int argument the method return true of the argument is even or false other wise.Also write a proggram to test your method
     System.out.println(isEven(4));



    }
    
}

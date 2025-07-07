package javadevlopering;

public class operator {
    public static void main(String args[]){
        System.out.println("all is well");
        //Q.1 what will be the answer of the following expressions :-
        int x =2,y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x*(y / x));
        System.out.println(exp1 +" ");
        System.out.println(exp2 +" ");
        //q.2  (Same Questions)
        int x2 = 200, y2 =50, z2 =100;
        if(x2 > y2 && y2 > z2){
            System.out.println("hello");

        }if(z2 > y2 && z2 < x2){
            System.out.println("java");
        }if((y2+200) < x2 && (y2+150) < z2){
            System.out.println("hello world");
        }
    }
    
}

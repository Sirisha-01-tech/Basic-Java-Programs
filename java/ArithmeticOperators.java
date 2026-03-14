import java.util.*;
public class ArithmeticOperators {
public static void main(String args[]){
    System.out.println("Enter any two numbers:");
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;
    int g=a%b;
    System.out.println("Addition of two numbers is:"+c);
    System.out.println("Subtraction of two numbers is:"+d);
    System.out.println("Multiplication of two numbers is:"+e);
    System.out.println("Division of Two numbers is:"+f);
    System.out.println("mod of two numbers is:"+g);
}

    
}

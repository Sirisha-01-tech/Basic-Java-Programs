import java.util.*;
public class Method4 {
    public static boolean isEven(int n){
        if( n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number :");

            int n=sc.nextInt();
            
            if(isEven(n)){
                System.out.println(n+" "+"even");
            }else{
                System.out.println(n+" "+"odd");
            }

        }
    }
    


public class MethodGreaterLesser {
    static int Greater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
    public static void main(String args[]){
        
       int a = 10, b=20;
       if(a>b){
        System.out.println("a is greater");
       }else{
        System.out.println("b is greater");
       }
    }
    
}

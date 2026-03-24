public class MethodTables {
    static int table(int num, int i){
        return num*i;

    }
    public static void main(String args[]){
        int num=4;
        
        for(int i=1;i<=10;i++){
           
           // int result=table(num,i);
            System.out.println(num+"*"+i+"="+(num*i));
            
        }
    }
    
}

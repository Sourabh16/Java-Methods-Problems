import java.util.*;
public class factorialOfNum {
    public static int factorial(int n){
        
        int f = 1;
        for(int i = 1;i<=n;i++){
            f*=i;
        }
        System.out.println(f);
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
        
    }
}

import java.util.*;
public class binomialCoeff {
   public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f = (f*i);
    }
    
    return f;
}
public static int binomial(int n, int r){
    
    
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_diff = factorial(n-r);
    int bino = fact_n/(fact_r*fact_diff);

    
    return bino;

   } 
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n =sc.nextInt();
    System.out.print("Enter r: ");
    int r = sc.nextInt();
    int z = binomial(n,r);
    System.out.println(z);
    sc.close();
   }
}

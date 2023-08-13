
import java.util.*;
public class product {
    public static int multiply(int a, int b){
        int product = a*b;
        
        return product;
    }
    public static void main(String args[]){
        System.out.print("Enter a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("Produc of a & b is "+prod);
        
        
        
        
        sc.close();
    }
    
}

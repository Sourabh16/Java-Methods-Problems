import java.util.*;
public class returnSum {
    public static int returnSum1(int x, int y){
        int z = x+y;
        System.out.println("Sum is " + z);
        return z;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        returnSum1(a,b);
        sc.close();
    }
}

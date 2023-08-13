import java.util.*;
public class swapNumbers {
    public static void swapNumbers1(int x , int y){
        int z = x;
        
        x=y;
        y=z;
        System.out.println(x +" & "+y);
        return;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b; ");
        int b = sc.nextInt();
        swapNumbers1(a,b);
        sc.close();
    }
}

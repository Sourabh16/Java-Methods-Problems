import java.util.*;
public class Problem {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }
}

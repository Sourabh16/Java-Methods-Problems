import java.util.*;
public class sumOfDigits {
    public static void sumDigits(int n){
        int sum = 0;
        int myNum = n;
        while(n>0){
            int lastDigit = n%10;
            sum = sum+lastDigit;
            n=n/10;
        }
        System.out.println("Sum of Digits of "+myNum+" is "+sum);
        return;
    } public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sumDigits(n);
        sc.close();
    }
}

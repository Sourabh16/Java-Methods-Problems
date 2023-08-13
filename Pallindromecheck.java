import java.util.*;
public class Pallindromecheck {
    public static boolean pallindrome(int n){
        int num = n;
        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            revNum = revNum*10 + lastDigit;
            n = n/10;
        }
        if(num==revNum){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println(pallindrome(n));
        sc.close();

    }
}

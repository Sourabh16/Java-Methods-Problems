import java.util.*;
public class binaryToDecimal{
    public static void binToDec(int binNum){
        int pow = 0;
        int myNum = binNum;
        int decNum = 0;
        while(binNum>0){
        int lastDigit = binNum%10;
        decNum = decNum + (lastDigit*(int)Math.pow(2,pow ));
        pow++;
        binNum = binNum/10;

    }
    System.out.println("Decimal number of "+myNum+" is "+decNum);
      }
      public static void main(String [] args){
        System.out.print("Enter Binary number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binToDec(n);
        sc.close();
      }
}
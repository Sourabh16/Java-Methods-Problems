import java.util.*;
public class decimalToBinary {
    public static void decToBin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum>0){
            int rem = decNum%2;
            binNum = rem*(int)Math.pow(10,pow)+binNum;
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary Number of "+myNum+ " is "+binNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number:");
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}

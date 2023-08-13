import java.util.*;
public class average {
  public static double avg(double a,double b,double c){
    double averageOfNums = (a+b+c)/2;
    return averageOfNums;
  }  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    System.out.print("Enter third number: ");
    int c = sc.nextInt();
    System.out.println("Average of three numbers are: "+ avg(a,b,c));
    sc.close();

  }
}

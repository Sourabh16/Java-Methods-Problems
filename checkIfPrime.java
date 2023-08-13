import java.util.*;
public class checkIfPrime {
  public static boolean Prime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n % i == 0){
          return false;
    }
    
  }
    return true;  
 
}
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    System.out.println("The given number is Prime: "+ Prime(n));
    sc.close();
  }
}

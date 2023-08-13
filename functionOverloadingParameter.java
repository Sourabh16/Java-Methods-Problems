public class functionOverloadingParameter {
    //function to calculate sum of two numbers
    public static int sum(int a,int b){
        return a+b;
    }
    //function to calculate sum of three nubers
    public static int sum(int a, int b , int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
    }
}

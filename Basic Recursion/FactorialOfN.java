import java.util.Scanner;
public class FactorialOfN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int answer=fact(n);
        System.out.println("Factorial: "+answer);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int fact=n*fact(n-1);
        return fact;
    }
}

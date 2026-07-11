import java.util.Scanner;
public class SumofNnumbers {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int sum=0;
            System.out.print("Enter n:");
            int n= sc.nextInt();
            int answer=sum(n);
            System.out.println(answer);
        }
        static int sum(int n){
            if(n==0){
                return 0;
            }
            int sum=n+ sum(n-1);
            return sum;
        }

}

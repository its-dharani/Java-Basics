import java.util.Scanner;
public class MinimumCuts {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of slices: ");
        int n=sc.nextInt();
        if (n==1){
            System.out.println("No Cuts");
        }
        else if (n%2==0){
            int cuts=n/2;
            System.out.println("Cuts Needed:"+cuts);
        }
        else{
            System.out.println("Cuts Needed:"+n);
        }
    }
}

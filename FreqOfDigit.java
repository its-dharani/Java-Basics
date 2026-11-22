import java.util.*;
public class FreqOfDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter number to find frequency: ");
        int k=sc.nextInt();
        int freq=0;
        if (n == 0 && k == 0) {
            freq = 1;
        }
        while(n>0){
            int d=n%10;
            if(d==k){
                freq++;
            }
            n=n/10;
        }
        System.out.println("Frequency of "+ k + " is: "+freq);
    }
}

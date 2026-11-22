import java.util.*;
public class EvenNoInDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        int digit=sc.nextInt();
        int sum=0;
        int count=0;
        digit=Math.abs(digit);
        if(digit==0){
            count++;
        }
        while(digit>0){
            int ld=digit%10;
            digit=digit/10;
            if(ld%2==0) {
                sum += ld;
                count++;
            }

        }
        System.out.println("Sum of even digits: "+sum);
        System.out.println("Count of even digits: "+count);
    }
}

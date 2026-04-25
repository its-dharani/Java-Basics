import java.util.*;
public class GradeSystem {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int n= sc.nextInt();
        if(n<0 || n>100){
            System.out.println("Invalid Input");
        }
        else if (n >= 90) {
            System.out.println("Grade: A");
        }
        else if (n>=80){
            System.out.println("Grade: B");
        }
        else if(n>=70){
            System.out.println("Grade: C");
        }
        else if(n>=60){
            System.out.println("Grade: D");
        }
        else if(n>=50){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Fail");
        }
    }
}

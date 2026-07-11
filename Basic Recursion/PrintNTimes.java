import java.util.Scanner;
public class PrintNTimes {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int i=1;
        print(i,n);
    }

    static void print(int i,int n){
        if(i>n){
            return;
        }
            System.out.println("count: "+i);
            i++;
            print(i,n);
        }

    }


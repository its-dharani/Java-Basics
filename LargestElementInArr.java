import java.util.Scanner;
public class LargestElementInArr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Largest Element: "+ largest);
    }
}

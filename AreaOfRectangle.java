import java.util.*;
public class AreaOfRectangle {
    public static void main(String args[]){
        double width;
        double height;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the width: ");
        width= sc.nextDouble();
        System.out.println("Enter the height: ");
        height=sc.nextDouble();
        area=height*width;
        System.out.println("The Area is: " + area );
    }
}

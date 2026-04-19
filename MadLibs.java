import java.util.*;
public class MadLibs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter an animal: ");
        String animal = sc.nextLine();
        System.out.println("Enter a plural noun: ");
        String pluralnoun=sc.nextLine();
        System.out.println("Enter a name:");
        String name= sc.nextLine();
        System.out.println("Enter a verb:");
        String verb= sc.nextLine();

        System.out.println("At school, my teacher turned into a " + animal);
        System.out.println("and started throwing "+pluralnoun);
        System.out.println("Everyone ran except "+name+",");
        System.out.println("who calmly started "+verb+".");
    }
}

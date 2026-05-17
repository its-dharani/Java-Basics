import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("You will be given 10 guesses!");
        Random rand=new Random();
        int n=rand.nextInt(101);
        int guess=0;
        Scanner sc= new Scanner(System.in);
        while(guess<=10){
            System.out.println("Guess the Number: ");
            int g= sc.nextInt();
            if(g<n){
                System.out.println("Higher");
            }
            else if(g>n){
                System.out.println("lower");
            }
            else{
                System.out.println("Correct Guess");
                break;
            }
            guess++;
        }
        sc.close();
        System.out.println("The Number was:"+n);
    }
}

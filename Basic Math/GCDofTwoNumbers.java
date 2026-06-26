
public class GCDofTwoNumbers {
    public static void main(String[] args){
        int a=30;
        int b=45;
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%1==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

    }
}

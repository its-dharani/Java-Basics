public class ArmstrongNumber {
    public static void main(String[] args){
        int n=9474;
        int num=n;
        int count=0;
        int digit;
        int sum=0;
        while(num>0){
            count++;
            num=num/10;
        }
        num=n;
        while(num>0){
            digit=num%10;
            double power=Math.pow(digit,count);
            sum+=power;
            num=num/10;
        }
        if(sum==n){
            System.out.println("ARMSTRONG");
        }
        else{
            System.out.println("NOT ARMSTRONG");
        }
    }
}

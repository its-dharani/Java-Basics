 import java.util.Scanner;
    public class MaxSumin2dArray {
        public static void main(String[] args) {
            int[][] accounts = {
                    {1, 2, 3},
                    {3, 2, 1},
                    {4, 5, 6}
            };
            int max = 0;
            for(int i=0;i<accounts.length;i++){
                int sum = 0;
                for(int j=0;j<accounts[i].length;j++){
                    sum=sum+accounts[i][j];
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println("Richest customer wealth: " + max);
        }
    }


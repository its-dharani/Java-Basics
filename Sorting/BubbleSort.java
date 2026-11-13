import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={2,4,8,5,1,3};
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int[] arr={3,72,3,17,24,57};
        int n=arr.length;
        for(int i=0; i<n-2;i++){
            int min=i;
            for(int j=i;j<n-1;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print("Sorted Array:"+ Arrays.toString(arr));
    }
}

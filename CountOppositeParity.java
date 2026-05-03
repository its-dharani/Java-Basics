import java.util.*;
public class CountOppositeParity {
    public static void main(String[] args){
    int[] arr={1,2,3,4};
    int n=arr.length;
    int[] ans=new int[n];
    int odd=0;
    int even=0;
    for (int i :arr) {
        if (i % 2 == 0) {
            even++;
        } else {
            odd++;
        }}
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even--;
                ans[i] = odd;
            } else {
                odd--;
                ans[i] = even;
            }
        }
        System.out.println(Arrays.toString(ans));
    }}
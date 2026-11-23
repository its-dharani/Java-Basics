public class SmallerThanCurrent {
    public static void main(String[] args){
        int[] arr= {8,1,2,2,3};
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]) {
                    count = count + 1;
                }
            }
            res[i]=count;
        }
        System.out.println(Arrays.toString(res));
    }
}

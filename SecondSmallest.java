 public class SecondSmallest {
	public static void main(String args[]) {
        int[] arr={3,2,9,7,5,0};
        int n=arr.length;
		int smallest=Integer.MAX_VALUE;
		int ssmallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<ssmallest && arr[i]!=smallest){
                ssmallest=arr[i];
            }

        }
        System.out.println("Second smallest:"+ssmallest);

}}
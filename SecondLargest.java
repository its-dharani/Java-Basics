public class SecondLargest {
    public static void main(String[] args){
        int[] a = {1,5,7,8,2};
        int n= a.length;
        int l=a[0];
        for(int i=1;i<n;i++){
            if (a[i]>l){
                l=a[i];
            }
        }
        System.out.println("Largest:"+l);

        int sl=a[0];
        for(int j=1;j<n;j++){
            if(a[j]>sl && a[j]!=l){
                sl=a[j];
            }
        }
        System.out.println("Second Largest:"+sl);

    }
}

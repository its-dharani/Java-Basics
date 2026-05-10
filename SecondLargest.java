public class SecondLargest {
    public static void main(String[] args){
        int[] a = {1,5,7,8,2};
        int n= a.length;
        int l;
        int sl;
        if (a[0] > a[1]) {
            l = a[0];
            sl = a[1];
        } else {
            l = a[1];
            sl = a[0];
        }
        for(int i=1;i<5;i++){
            if(a[i]>l && a[i]>sl){
                sl=l;
                l=a[i];

            }
            else if(a[i]<l && a[i]>sl){
                sl=a[i];
            }
        }
        System.out.println("Largest:"+l);
        System.out.println("Second Largest:"+sl);

    }
}

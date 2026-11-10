import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] a= {1,2,4,5};
      boolean isSorted=true;
      for(int i=1;i<a.length;i++){
        if(a[i]>=a[i-1]){
            isSorted= true;
        }
        else{
          isSorted=false;
          break;
        }

      }
      if (isSorted){
        System.out.println("Sorted");
      }
      else{
        System.out.println("Not Sorted");
      }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4, 4, 5};

        int i = 0;

        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                a[i + 1] = a[j];
                i++;
            }
        }

        int[] result = Arrays.copyOf(a, i + 1);

        System.out.println(Arrays.toString(result));
    }
}

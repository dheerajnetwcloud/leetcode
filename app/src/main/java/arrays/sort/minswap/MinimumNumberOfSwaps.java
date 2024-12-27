package arrays.sort.minswap;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfSwaps {

    public static void main(String[] args) {
        int []a = {2, 4, 1, 5, 3};
        int minSwap = getMinSwap(a);
        System.out.println(minSwap);
    }

    private static int getMinSwap(int[] a) {
        int[][] b = new int[a.length][2];

        for (int i = 0; i < a.length; i++) {
            b[i][0] = a[i];
            b[i][1] = i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }

        System.out.println("");
        Arrays.sort(b, Comparator.comparingInt(ac -> ac[0]));

        boolean[] visited = new boolean[a.length];
        int count = 0;
        int j;
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            if (visited[i] || i == b[i][1]) {
                continue;
            }
            j = i;
            count =0;
            while (!visited[j]) {
                visited[j] = true;
                j = b[j][1];
                count++;
            }

            if(count > 1){
                swap += count -1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }

        return swap;
    }
}

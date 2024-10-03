package arrays.subarray;

import java.util.Arrays;

public class sub_array_sum_div_k {
    public static void main(String[] args) {
        int [] a= {3,1,4,2};
        subArrayWithSumDivK(a, 6);
    }

    private static void subArrayWithSumDivK(int[] a, int i) {
       int sum = Arrays.stream(a).sum();
       int t = sum%i;
       int start = 0;
       int localSum = 0;
       int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < a.length; end++) {
            localSum += a[end];
            localSum = localSum%i;
            while(localSum > t){
                localSum -= a[start]%i;
                start++;
            }
            if(localSum == t){
                minLength = Math.min(minLength, end - start + 1);
            }
        }
    }
}

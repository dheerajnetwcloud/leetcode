package arrays.subarray;

public class min_len_sub_array_with_given_sum {
    public static void main(String[] args) {
        int []a = {1,3,4,5,6,7,11,2,3};
        int len = exist(a, 15);
        System.out.println(" SUB ARRAY :: " + len);

        int []aa = {1,3,4,5,6,7,11,2,3,12};
        int len2 = exist(aa, 15);
        System.out.println(" SUB ARRAY :: " + len2);
    }

    private static int exist(int[] a, int target) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            while (sum > target){
                sum -= a[start];
                start++;
            }
            if(sum == target){
               minLength = Math.min(minLength, end - start + 1);
            }
        }
        return minLength;
    }
}

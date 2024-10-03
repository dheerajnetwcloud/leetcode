package arrays.subarray;

import java.util.HashSet;

public class sub_array_with_given_sum_cont_neg {
    public static void main(String[] args) {
        int []a= {1,12,-1,3,4};
        boolean exist = sub_array_with_neg_sum(a, 14);
        System.out.println("Exist :: "+ exist);
        exist = sub_array_with_neg_sum(a, 17);
        System.out.println("Exist :: " + exist);

    }

    private static boolean sub_array_with_neg_sum(int[] a, int target) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            if(set.contains(sum - target)){
                return true;
            }
            set.add(sum);
        }
        return  false;
    }
}

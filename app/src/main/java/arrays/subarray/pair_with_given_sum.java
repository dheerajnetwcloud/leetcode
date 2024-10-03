package arrays.subarray;

import java.util.HashSet;
import java.util.Set;

public class pair_with_given_sum {
    public static void main(String[] args) {
        int [] a = {1,4,2,3,7,3};
        boolean checkIfSumExist = checkIfSumExist(a,5);
        System.out.println("SUM EXIST :: " + checkIfSumExist);
        checkIfSumExist = checkIfSumExist(a,15);
        System.out.println("SUM EXIST :: " + checkIfSumExist);
    }


    private static boolean checkIfSumExist(int[] a, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int j : a) {
            if (set.contains(sum - j)) {
                return true;
            }
            set.add(j);
        }

        return false;
    }
}

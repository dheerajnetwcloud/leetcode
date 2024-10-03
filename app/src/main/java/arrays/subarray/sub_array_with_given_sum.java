package arrays.subarray;

public class sub_array_with_given_sum {
    public static void main(String[] args) {
        int []a = {1,3,4,5,6,7,11,2,3};
        boolean subArray = exist(a, 15);
        System.out.println(" SUB ARRAY :: " + subArray);

        subArray = exist(a, 154);
        System.out.println(" SUB ARRAY :: " + subArray);
    }

    private static boolean exist(int[] a, int target) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            while (sum > target){
                sum -= a[start];
                start++;
            }
            if(sum == target){
                System.out.println("SUM ARRAY EXIST");
                return true;
            }
        }
        return false;
    }
}

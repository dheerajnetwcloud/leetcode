package arrays.nextgreatereleement;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterCircularElements {
    public static void main(String[] args) {
        int a[] = {1,22,3,4,25,9, 13};
        System.out.println(Arrays.toString(gng(a)));

    }

    public static int[] gng(int a[]){
        int o[] = new int[a.length];
        Stack<Integer> stack  = new Stack<>();
        Arrays.fill(o, -1);
        int n = a.length;

        for (int i = 0; i < a.length*2; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i%n]){
                o[stack.pop()] = a[i%n];
            }
            stack.push(i%n);
        }

        return o;
    }
}

package arrays.nextgreatereleement;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int a[] = {1,22,3,4,22,9, 13};
        System.out.println(Arrays.toString(gng(a)));

    }

    public static int[] gng(int a[]){
        int o[] = new int[a.length];
        Stack<Integer> stack  = new Stack<>();
        Arrays.fill(o, -1);

        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]){
                o[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        return o;
    }
}

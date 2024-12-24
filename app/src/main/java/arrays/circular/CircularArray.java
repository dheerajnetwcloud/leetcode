package arrays.circular;

public class CircularArray {
    public static void main(String[] args) {
        int a[]  = {1,2,3,4,56,7};
        int count = a.length;
        int b  = 3;
        while (count-- > 0){
            System.out.println(a[b]);
            b = (b+1)% a.length;
        }
    }
}

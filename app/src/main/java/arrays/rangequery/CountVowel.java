package arrays.rangequery;

import java.util.Arrays;
import java.util.HashSet;

public class CountVowel {
    public static void main(String[] args) {
        CountVowel cv = new CountVowel();

        int a[] = cv.vowelStrings(new String[]{"aba","bcb","ece","aa","e"}, new int[][]{{0,2},{1,4},{1,1}});
        System.out.println(Arrays.toString(a));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {

        int [] out  = new int[queries.length];
        int prefixSum[] =  new int[words.length];
        int count=0;
        for (int i = 0; i < words.length; i++) {
            if(isValid(words[i])){
                count++;
            }
            prefixSum[i] = count;
        }

        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] != 0)
                out[i] = prefixSum[queries[i][1]] - prefixSum[queries[i][0] -1] ;
            else
                out[i] = prefixSum[queries[i][1]];
        }
        return out;
    }

    public boolean isValid(String s){
        HashSet<Character> set = new HashSet<>();
        set.addAll( Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int start = 0;
        int end = s.length() -1;
        if(set.contains(s.charAt(start)) && set.contains(s.charAt(end))){
            return true;
        }
        return false;
    }
}

package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumPlatformRequired {
    public static void main(String[] args) {
        String [] arrival= {"9:00", "9:40", "9:50"};
        String [] departure = {"19:10", "9:00", "11:20"};

        System.out.println(minNumberOfPlatforms(arrival, departure));

    }

    public static int minNumberOfPlatforms(String [] arrival, String[] departure){
        int count = 0;

        List<Integer> arrival1 = Arrays.stream(arrival).map(a-> a.replace(":", "")).map(a -> Integer.parseInt(a)).sorted().collect(Collectors.toList());

        List<Integer> departure1 = Arrays.stream(departure).map(a-> a.replace(":", "")).map(a -> Integer.parseInt(a)).sorted().collect(Collectors.toList());


        System.out.println(arrival1);
        System.out.println(departure1);

        int minCount  = 0;
        int curPlatfomr = 0;

        int arrIndex = 0;
        int depIndex = 0;

        while (arrIndex < arrival1.size()){
            if(arrival1.get(arrIndex) <= departure1.get(depIndex)){
                minCount++;
                arrIndex++;
                curPlatfomr++;
                minCount = Math.min(curPlatfomr, minCount);
            }else{
                depIndex++;
                curPlatfomr--;
            }
        }



        return minCount;
    }


}

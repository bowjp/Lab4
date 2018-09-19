
import java.util.Arrays;

public class Lab4 {
public static void main(String args[]) {

Integer[][] tests = new Integer[5][3];

tests[0] = new Integer[]{1,2,3};
tests[1] = new Integer[]{2,3,1};
tests[2] = new Integer[]{3,2,1};
tests[3] = new Integer[]{4,5,6};
tests[4] = new Integer[]{5,7,1};

for (Integer[] i: tests) {
    ReverseSorter(i);
}


}
    public static void ReverseSorter(Integer[] unsort){
        Arrays.sort(unsort);
        for(int j = 0; j < unsort.length/2; j++) {
            int temp = unsort[j];
            unsort[j] = unsort[unsort.length - j - 1];
            unsort[unsort.length - j - 1] = temp;
        }
    }
}

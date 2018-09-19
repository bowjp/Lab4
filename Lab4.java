import java.util.Arrays;

public class Lab4 {
public static void main(String args[]) {

int[][] tests = new int[5][3];

tests[0] = new int[]{1,2,3};
tests[1] = new int[]{2,3,1};
tests[2] = new int[]{3,2,1};
tests[3] = new int[]{4,5,6};
tests[4] = new int[]{5,7,1};

for (int[] i: tests) {
	Arrays.sort(i);
}; 

} 
}

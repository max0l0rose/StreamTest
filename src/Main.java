import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//	    int[][] arr1 = {{1,2},{3,4}};
//	    int[] arr12 = Arrays.stream(arr).map(q -> q+10).toArray();
	    int[][] arr2 = {{1,2},{3,4}};
	    int[] arr22 = Arrays.stream(arr2).flatMapToInt(q -> Arrays.stream(new int[] {q[0],q[1],30,40}))
			                                                .toArray(); //size -> new Integer[size]
		int a = 1;
    }
}

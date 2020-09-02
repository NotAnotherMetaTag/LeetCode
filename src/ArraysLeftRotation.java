import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraysLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	//we will make a circular queue using a double ended queue (deque)
    	Deque<Integer> arrayAsDeque = new ArrayDeque<Integer>();
    	for(int i = a.length-1; i >= 0; i--) {
    		arrayAsDeque.addFirst(a[i]);
    	}
    	while(d > 0) {
    		int poppedValue = arrayAsDeque.poll(); //get the value to put back
    		arrayAsDeque.addLast(poppedValue);
    		d--; //decrement after completing the rotation
    	}
    	Integer[] b = new Integer[a.length];
    	//we can assume the deque is the same size as the array for iteration
    	for(int i=0; i < a.length; i++) {
    		b[i] = arrayAsDeque.remove();
    	}
    	for(int i=0; i < a.length; i++) {
    		a[i] = b[i];
    	}
    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nd = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nd[0]);
//
//        int d = Integer.parseInt(nd[1]);
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
//
//        int[] result = rotLeft(a, d);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    	int d = 4;
    	int[] a = {1,2,3,4,5};
    	int[] b = rotLeft(a, d);
    	for(int x: b) {
    		System.out.print(x);
    	}
    }
}
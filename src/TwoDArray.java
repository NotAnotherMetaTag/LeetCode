import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int highestValue = -63;
		//find the hourglasses, starting top left
		//since 6x6 is the defined bound and the hourglass is 3x3, max loop is 4
		for(int x = 0; x < 4; x++) {
			for(int y= 0; y < 4 ; y++) {
				int a = arr[y][x];
				int b = arr[y][x+1];
				int c = arr[y][x+2];
				int d = arr[y+1][x+1]; //the mid of the hourglass
				int e = arr[y+2][x];
				int f = arr[y+2][x+1];
				int g = arr[y+2][x+2];

				int sum = a+b+c+d+e+f+g;

				if(sum > highestValue) {
					highestValue = sum; 
				}
			}
		}
		return highestValue;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		//
		//        int[][] arr = new int[6][6];
		//
		//        for (int i = 0; i < 6; i++) {
		//            String[] arrRowItems = scanner.nextLine().split(" ");
		//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		//            for (int j = 0; j < 6; j++) {
		//                int arrItem = Integer.parseInt(arrRowItems[j]);
		//                arr[i][j] = arrItem;
		//            }
		//        }
		//
		//        int result = hourglassSum(arr);
		//
		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();
		//
		//        scanner.close();

		int [][] arr = {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},
				{-9,-9,-9,1,2,3},{0,0,8,6,6,0},
				{0,0,0,-2,0,0},{0,0,1,2,4,0}};
		for(int[] x: arr) {
			for(int y: x) {
				System.out.print(y);
			}
			System.out.println();
		}
		//System.out.println(arr.toString());
		System.out.println(hourglassSum(arr));
	}
}

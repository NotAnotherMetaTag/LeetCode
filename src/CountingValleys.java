import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		char[] stepArray = s.toCharArray();
		int stepsFromSeaLevel = 0;
		int numOfValleys = 0;
		for (int i =0; i < stepArray.length; i++) {
			if(stepArray[i] == 'U') {
				stepsFromSeaLevel++;
			} else if(stepArray[i] == 'D') {
				if(stepsFromSeaLevel == 0) {
					numOfValleys++;
				}
				stepsFromSeaLevel--;
			}
		}
		return numOfValleys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

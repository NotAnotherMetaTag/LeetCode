import java.util.Arrays;

//Given an array of integers, return indices of the two numbers such that 
//they add up to a specific target.
//
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] tempArray = nums;
		int[] array = new int[0];
		for(int i = 0; i < nums.length; i++) {
			int numOne = nums[i];
			System.out.println("numOne" + numOne);
			for (int j = (i+1); j < tempArray.length; j++) {
				int numTwo = nums[j];
				if((numOne + numTwo) == target) {
					array = new int[] {i, j};
					break;
				}
			}
		}
		return array;
	}
}

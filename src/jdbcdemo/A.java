package jdbcdemo;
import java.util.Arrays;

public class A {

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5 };
	        double median = findMedian(nums);
	        System.out.println("Median: " + median);
	    }

	    public static double findMedian(int[] nums) {
	    	
	        Arrays.sort(nums);
	        
	        int n = nums.length;
	        if (n % 2 == 0) 
	        {
	            return (double) (nums[n / 2 - 1] + nums[n / 2]) / 2;
	        } 
	        else 
	        {
	            return (double) nums[n / 2];
	        }
	    }

}

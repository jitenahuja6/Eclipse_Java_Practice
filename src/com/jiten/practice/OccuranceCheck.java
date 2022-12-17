package com.jiten.practice;

public class OccuranceCheck {
	
	 public int FirstOcc(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length - 1;
	        // Index of fir Oc
	        int FirstOcc = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] == target) {
	                FirstOcc = mid;
	                high = mid - 1;
	            }
	            
	            else if (target < nums[mid]) {
	                high = mid - 1;
	            }
	            else {
	                low = mid + 1;
	            }
	        }
	        return FirstOcc;
	    }

	    public int LastOcc(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length - 1;
	        int LastOcc = -1;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (nums[mid] == target) {
	                LastOcc = mid;
	                low = mid + 1;
	            }
	            else if (target < nums[mid]) {
	                high = mid - 1;
	            }
	            else {
	                low = mid + 1;
	            }
	        }
	        return LastOcc;
	    }
	    
	    public static void main(String[] args) {
	    	OccuranceCheck obj  = new OccuranceCheck();
	    	int nums[] = {5,7,7,8,8,10};
	    	int target = 8;
	    	int a = obj.FirstOcc(nums, target);
	    	int b = obj.LastOcc(nums, target);
	    	System.out.print(a + " ");
	    	System.out.println(b);
	    	
		}}
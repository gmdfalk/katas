package codingbat.array;

public class Array3 {

	public static int maxSpan( final int[] nums ) {
		int span = 0;
		int len = nums.length < 2 ? 0 : nums.length-1;
		for (int i=0; i < nums.length; i++) {
			for (int j=len; j >= 0; j--) {
				if (nums[i] == nums[j]) {
					span = Math.max(span, (j-i)+1);
				}
			}
		}
		return span;
	}
}

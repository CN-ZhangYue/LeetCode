package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TwoSum {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return index of two numbers
	 */
	 public Vector<Integer> twoSum(Vector<Integer> nums, int target) {
	        
		 Vector<Integer> resultVector = new Vector<Integer>();
		 Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		 int length = nums.size();
		 
		 for(int i = 0; i<length; i++) {
			 int complementation = target - nums.get(i);
			 if(map.containsKey(complementation)) {
				 resultVector.add(map.get(complementation));
				 resultVector.add(i);
				 return resultVector;
			 }
			 map.put(nums.get(i),i);
		 }
		 return resultVector;
	   }
}

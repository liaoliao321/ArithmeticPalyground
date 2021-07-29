package LeetCode._1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            int anotherNum = target-nums[i];

            if (map.containsKey(anotherNum)) {
                return new int[]{map.get(anotherNum), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

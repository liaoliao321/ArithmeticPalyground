package LeetCode._1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            // 由于是两数相加等于target
            // 索引另一个数的值是target减去当前考察的元素值
            int anotherNum = target-nums[i];

            // 判断另一个数在map中是否存在
            // 存在则说明找到两个数，其和为target
            if (map.containsKey(anotherNum)) {
                return new int[]{map.get(anotherNum), i};
            }

            // key是当前考察的元素值，value是当前考察的元素对应的索引
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

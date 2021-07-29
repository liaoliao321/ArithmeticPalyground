package LeetCode.HOT100._136;

public class Main {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;

        return result;
    }
    public static void main(String[] args) {

    }
}

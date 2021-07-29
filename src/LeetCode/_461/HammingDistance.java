package LeetCode._461;

/*
https://www.cnblogs.com/findbetterme/p/10787118.html
位运算
偶数，二进制末尾为0
奇数，二进制末尾为1

&
|
^
~
<<
>>
>>>
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;

        int distance = 0;
        while (xor != 0) {
            if ((xor & 1) == 1)
                distance += 1;
            xor = xor >> 1;
        }
        return distance;
    }
}

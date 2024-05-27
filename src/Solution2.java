import java.util.*;
public class Solution2 {
}

class LongestSequence {
    public int longestSequence(int[] nums) {
        // 创建一个哈希表，用于存储每个数字及其连续的长度
        Map<Integer,Integer> map=new HashMap<>();
        int maxLen=0;

        // 遍历数组
        for (int num:nums) {
            // 如果当前数字已经存在于哈希表中，则跳过
            if(map.containsKey(num))
                continue;
            // 获取当前数字左右相邻的连续序列长度
            int left=map.getOrDefault(num-1,0);
            int right=map.getOrDefault(num+1,0);

            // 计算当前数字所在的连续序列的长度
            int currLen=left+right+1;
            maxLen=Math.max(maxLen,currLen);

            // 更新当前数字及其左右连续序列两端的值
            map.put(num,currLen);
            map.put(num-left,currLen);
            map.put(num+right,currLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSequence solution=new LongestSequence();
        // 测试用例
        int[] nums={100,4,200,1,3,2};
        int result= solution.longestSequence(nums);
        // 预期打印结果为4
        System.out.println(result);
    }
}

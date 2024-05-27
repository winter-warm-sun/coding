public class MaxSubArray {
}

class Solution {
    public int maxSubArray(int[] nums) {
        // 初始化maxSum为数组的第一个元素，这是目前找到的最大子数组和
        int maxSum=nums[0];
        // 初始化currentSum为0，这个变量用于存储当前遍历的子数组的和
        int currentSum=0;

        // 遍历数组中的每个元素
        for(int num: nums) {
            // 如果currentSum加上当前元素后仍不如当前元素大，则放弃之前的累加，从当前元素重新开始计算
            currentSum=Math.max(currentSum+num,num);
            // 更新已经找到的最大子数组和
            maxSum=Math.max(maxSum,currentSum);
        }

        // 返回最大子数组和
        return maxSum;
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution=new Solution();
        // 输出6，最大子数组为[4,-1,2,1]
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        // 输出1，最大子数组为[1]
        System.out.println(solution.maxSubArray(new int[]{1}));
        // 输出-1，最大子数组为[-1]
        System.out.println(solution.maxSubArray(new int[]{-1,-2}));
    }
}
public class Solution3 {
}

class MoveZeros {
    public void moveZeros(int[] nums) {
        // 定义两个指针，一个用于遍历数组，另一个用于记录非零元素应该移动到的位置
        int nonZeroIndex=0;

        // 遍历数组
        for(int i=0;i<nums.length;i++) {
            // 如果当前元素非零，则将其移动到非零元素应该存放的位置
            if(nums[i]!=0) {
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }

        // 将剩余的位置填充为零
        for(int i=nonZeroIndex;i<nums.length;i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        MoveZeros solution=new MoveZeros();
        // 测试用例
        int[] nums={0,1,0,3,12};
        solution.moveZeros(nums);
        // 输出移动后的数组
        for (int num:nums) {
            System.out.print(num+" ");
        }
    }
}

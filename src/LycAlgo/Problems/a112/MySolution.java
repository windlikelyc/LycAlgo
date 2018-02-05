package LycAlgo.Problems.a112;


import java.util.Stack;

/**
 * Created by lyc on 2017/9/15.
 */

//Given a circular array (the next element of the last element is the first element of the array),
// print the Next Greater Number for every element. The Next Greater Number of a number x is
// the first greater number to its traversing-order next in the array, which means you could search circularly to find
// its next greater number. If it doesn't exist, output -1 for this number.
public class MySolution {
    //我发现很多时候感觉自己懂了其实是似懂未懂
    //不过也比啥都不会强一点把
    //
    //实现循环数组的方法只要将数组写两遍即可
    //用下标取余来遍历
    //另外stack是个抽象的数据结构，不一定非要放数，放下标也可以。有数不一定有下标，有下标一定有数
    public int[] nextGreaterElements(int[] nums) {
        if (nums.length == 1) return new int[]{-1};
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int ans[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > stack.peek()) {
                int tmp = i - 1;
                do {
                    ans[tmp] = stack.pop();
                    tmp--;
                } while (stack.peek() < nums[i]);
            }
            stack.push(nums[i]);
        }
        return nums;
    }


}

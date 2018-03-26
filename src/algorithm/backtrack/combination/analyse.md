####leetcode 39
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 

```
[
  [7],
  [2, 2, 3]
]
```
###思路
每次从当前位置开始，比如从2开始的下一轮跌点仍然用2，如果等于目标就加入答案，
否则下标向下走

####leetcode 216
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:
```
[[1,2,4]]
```
Example 2:

Input: k = 3, n = 9

Output:
```
[[1,2,6], [1,3,5], [2,3,4]]
```

####思路
遍历1-9的每个数字，每次加1，当等于给定数字时加入，使用变量k记录已使用个数

####leetcode 377
Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

Example:

nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.

##注意和第一题的区别，一个结果是set，一个是有序list

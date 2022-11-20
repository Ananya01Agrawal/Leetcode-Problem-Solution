/*
Brute Force Approach
Squares of sorted array seems like the easiest problem, if you try to solve it in **O(nlogn) **approach */

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
/*
Optimized Approach
But if you want to solve the problem in O(n) then it needs brainstorming to find the approach.
Input: nums = [-7,-3,2,3,11]
If we see the elements with their absolute value then will get to know the element at the start and the last can be the highest value.
So we use this approach to find our solution, by using the two pointer solution
Taking one pointer at the start of the array and then another pointer at the last of the array, and then compare these values
{7,-3,0,3,9,11}
Math.abs(-7) < Math.abs(11)

{ , , , ,121} in the resultant array

by this we will get the last element of the last array and we can store that value to the resultant array

repeat the same method until left≤right.*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int index = nums.length- 1;
        int result[] = new int [nums.length];
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                result[index] = nums[left] * nums[left];
                left++;
            }
            else
            {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}``

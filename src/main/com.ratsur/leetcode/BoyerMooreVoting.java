package com.ratsur.leetcode;
class BoyerMooreVoting {
    public int majorityElement(int[] nums) {

        int counter = 1;
        int ans = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(counter==0)
            {
                ans=nums[i];
                counter++;
                continue;
            }
            if(nums[i]==ans)
            {
                counter++;
            }
            else
            {
                counter--;
            }
        }
        return ans;
    }
}
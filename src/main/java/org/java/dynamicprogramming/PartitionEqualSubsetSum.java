package org.java.dynamicprogramming;

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {

        int[] nums = {1,5,11,5};

        int sum = 0;

        for(int num : nums)
            sum += num;

        if(sum % 2 != 0){

            System.out.println(false);
            return;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for(int num : nums){

            for(int j=target; j>=num; j--){

                dp[j] = dp[j] || dp[j-num];
            }
        }

        System.out.println(dp[target]);
    }
}

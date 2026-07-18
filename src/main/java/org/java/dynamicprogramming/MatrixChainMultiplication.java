package org.java.dynamicprogramming;

public class MatrixChainMultiplication {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int n = arr.length;

        int[][] dp = new int[n][n];

        for(int length=2; length<n; length++){

            for(int i=1; i<n-length+1; i++){

                int j=i+length-1;

                dp[i][j]=Integer.MAX_VALUE;

                for(int k=i; k<j; k++){

                    int cost=dp[i][k]
                            +dp[k+1][j]
                            +arr[i-1]*arr[k]*arr[j];

                    dp[i][j]=Math.min(dp[i][j],cost);
                }
            }
        }

        System.out.println("Minimum Cost = "+dp[1][n-1]);
    }
}

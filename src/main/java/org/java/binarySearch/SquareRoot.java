package org.java.binarySearch;

public class SquareRoot {

    public static int sqrt(int x){

        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right){

            int mid = left + (right-left)/2;

            if((long)mid * mid <= x){

                ans = mid;
                left = mid + 1;
            }else{

                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(sqrt(17));
    }
}

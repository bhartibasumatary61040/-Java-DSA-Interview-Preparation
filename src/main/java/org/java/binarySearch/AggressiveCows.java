package org.java.binarySearch;
import java.util.Arrays;

public class AggressiveCows {

    static boolean canPlace(int[] stalls,int cows,int distance){

        int count = 1;
        int last = stalls[0];

        for(int i=1;i<stalls.length;i++){

            if(stalls[i]-last >= distance){

                count++;
                last = stalls[i];

                if(count == cows)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] stalls = {1,2,4,8,9};

        Arrays.sort(stalls);

        int cows = 3;

        int left = 1;
        int right = stalls[stalls.length-1]-stalls[0];
        int answer = 0;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(canPlace(stalls,cows,mid)){

                answer = mid;
                left = mid + 1;

            }else{

                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}

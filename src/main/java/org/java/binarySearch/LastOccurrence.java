package org.java.binarySearch;

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;

        int result = -1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(arr[mid] == target){

                result = mid;
                left = mid + 1;
            }
            else if(arr[mid] < target){

                left = mid + 1;
            }
            else{

                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,4,4,6,8};

        System.out.println(lastOccurrence(arr,4));
    }

}

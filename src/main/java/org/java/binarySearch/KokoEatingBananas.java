package org.java.binarySearch;

public class KokoEatingBananas {

    public static boolean canEat(int[] piles,int speed,int h){

        int hours = 0;

        for(int pile : piles){

            hours += Math.ceil((double)pile/speed);
        }

        return hours <= h;
    }

    public static void main(String[] args) {

        int[] piles = {3,6,7,11};

        int h = 8;

        int left = 1;
        int right = 11;
        int answer = right;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(canEat(piles,mid,h)){

                answer = mid;
                right = mid - 1;
            }else{

                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}

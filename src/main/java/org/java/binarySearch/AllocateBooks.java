package org.java.binarySearch;

public class AllocateBooks {

    static boolean isPossible(int[] books,int students,int maxPages){

        int count = 1;
        int pages = 0;

        for(int book : books){

            if(pages + book <= maxPages){

                pages += book;

            }else{

                count++;
                pages = book;

                if(count > students)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] books = {12,34,67,90};

        int students = 2;

        int left = 90;
        int right = 203;
        int answer = right;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(isPossible(books,students,mid)){

                answer = mid;
                right = mid - 1;

            }else{

                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}

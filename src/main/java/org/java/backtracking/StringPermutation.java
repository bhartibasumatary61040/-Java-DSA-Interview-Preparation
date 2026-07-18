package org.java.backtracking;

public class StringPermutation {

    static void permutation(char[] arr, int index){

        if (index == arr.length){
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i< arr.length; i++){
            swap(arr,index, i);
            permutation(arr, index + 1);
            swap(arr, index, i);

        }
    }

    static  void swap (char[] arr, int i, int j){

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        String str = "ABC";
        permutation(str.toCharArray(), 0);

    }
}

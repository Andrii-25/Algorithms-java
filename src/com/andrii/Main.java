package com.andrii;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(binarySearch(array, 3));
    }

    static int binarySearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (high - low) / 2;

        while(low <= high) {
            if(arr[mid] == val){
                return mid;
            }
            if(arr[mid] > val) {
                high = mid - 1;
            }
            if(arr[mid] < val) {
                low = mid + 1;
            }
        }
        return -1;
    }
}

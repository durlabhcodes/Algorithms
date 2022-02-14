package com.durlabh.algorithms;

public class Heapify {
    public static void main(String[] args) {
        int[] arr = {9, 15, 10, 7, 12, 11} ;//{ 90, 15, 10, 7, 12, 2, 7, 3 };
        System.out.println(isHeap(arr, 0));
    }

    private static boolean isHeap(int[] arr, int i) {
        if((2*i)+2 >= arr.length){
            return true;
        }


        return arr[(2*i)+1] <= arr[i] && arr[(2*i)+2] <= arr[i] && isHeap(arr, (2*i)+1) && isHeap(arr, (2*i)+2);
    }
}

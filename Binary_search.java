package com.company;

public class Binary_search {

    public static void main(String[] args) {
        int[] arr = {-3,-4,0,3,4,6,21,24,27,29,34,67,89,98};
        int target =378;
        int ans = binarysearch(arr,target);
        System.out.println(ans);


    }
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end =arr.length-1;

        while (start<=end){

            int mid = start+(end - start)/2;

            if(target<arr[mid]){
                end =mid-1;
            }
            else if(target>arr[mid]){
                start = start +1;
            }
            else {
                return mid;
            }


        }

        return -1;
    }


}

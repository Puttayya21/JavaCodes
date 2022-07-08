package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={3,4,6,5,-3,8,6,1};
        int min;
        min=searchmin(arr);

    }
    static int searchmin(int arr[]){
         int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println(min);
            }

        }
        return min;
    }

}

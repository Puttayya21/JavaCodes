package com.company;

import java.util.Scanner;

public class negativeon1side {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner array= new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i=0;i<arr.length;i++){
            arr[i]= array.nextInt();
           // System.out.println(arr);
        }
        int temp=0;
        for (int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the sorted array is ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

package com.company;

import javax.swing.*;

public class duplicate {
    public static void main(String[] args) {
        int[] arr =  {2,1,4,6,3,2,7,8};
        int copy=duplicat(arr);
        System.out.println(copy);

    }
    static int duplicat(int[] arr){
        int present=0;
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i] == arr[j]) {
                    present++;
                }

                }

            }
        return present;
        }
    }



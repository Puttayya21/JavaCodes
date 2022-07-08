package com.company;

public class evenNumberOfNumber {
    public static void main(String[] args) {
        int[] arr= {42,6,343,4264,4,5653,-8765,987};
        System.out.println(numberofdigits(arr));
    }
    static int numberofdigits(int[] arr){
        int count=0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
         return count;
    }

     static boolean even(int num) {
        int numdigits = evens(num);

        return numdigits % 2==0;
}

    static int evens(int num) {
        int count=0;

        if(num<0){
            num=num *-1;
        }
        while(num>0){
            count++;
            num=num/10;

        }
        return count;
    }

}

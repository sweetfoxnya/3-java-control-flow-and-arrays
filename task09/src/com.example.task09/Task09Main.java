package com.example.task09;

import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[3];
        arr[0] = -40;
        arr[1] = -200;
        arr[2] = -60;
        System.out.println(min(arr));

    }

    static int min(int[] arr) {

        /* Arrays.sort(arr);
        return arr[0]; */

        int min = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
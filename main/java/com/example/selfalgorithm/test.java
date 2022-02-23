package com.example.selfalgorithm;

import java.util.Arrays;

/**
 * packageName: com.example.selfalgorithm
 * fileName   : test
 * author     : HYUCK7
 * date       : 2022/02/23
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/23         HYUCK7         최초 생성
 */
public class test {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] =(int)Math.random() * 100;

        }
        int min = 0;
        int max = 0;

        for(int k=0; k<res.length; k++){
            if(min>k){
                min = k;
            }else if(max<k){
                max = k;
            }
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);


    }
}

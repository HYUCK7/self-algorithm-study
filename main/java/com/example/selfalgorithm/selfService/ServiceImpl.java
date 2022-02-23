package com.example.selfalgorithm.selfService;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName: com.example.selfalgorithm.selfService
 * fileName   : ServiceImpl
 * author     : HYUCK7
 * date       : 2022/02/23
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/23         HYUCK7         최초 생성
 */
public class ServiceImpl implements Service{
    @Override
    public void reverse(Scanner scanner) {
        // 오름차순의 배열 내림차순으로 정렬하기
        int students[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("변경 전: " + Arrays.toString(students));

        int students2[] = new int[students.length];
        for(int i=0; i < students.length; i++){
            students2[(students.length-1)-i] = students[i];
        }  System.out.println("변경 후: " + Arrays.toString(students2));
    }

    @Override
    public void prime(Scanner scanner) {
        int[] arr = new int[10];
        for(int i =0; i <arr.length; i++){
            boolean isPrimeNumber = true;
            int randomValue = (int)Math.random() * 10;

            if( randomValue == 1){  // 1과 2는 굳이 연산 할 필요가 없기 때문에 skip 한 코드
                continue;
            }
            if(randomValue ==2){
                arr[i] = randomValue;
                continue;
            }
            for(int j =2; j <randomValue; j++){
                if(randomValue % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber) {         //isPrimeNumber는 무분별한 반복을 피하기 위한 플래그.
                arr[i] = randomValue;   //이미 j=2 인 것에서 판단이 되어도 만족할 때까지 의미없는 반복을 하므로, 비효율적인 코드가 될 수 있다
            }

        }
        System.out.println("배열에 저장된 소수");
        for(int k: arr){
            if(k>0){
                System.out.println(k);
            }
        }
    }

    @Override
    public void minmax(Scanner scanner) {
        // 100까지의 랜덤값중 최대값과 최소값 뽑기
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
    }

    @Override
    public void allplus(Scanner scanner) {
        // 5개의 양수를 입력 받아, 배열의 요소들의 합 구하기
    }

    @Override
    public void minmax2(Scanner scanner) {
        // 정해진 배열의 최대값, 최소값 구하기(10개의 수 내가 넣기)
    }

    @Override
    public void comparison(Scanner scanner) {
        // 순서가 없는 두 배열에서 서로 같은 요소를 포함하는 지 판별
        // A배열[1,3,2], B배열 [2,3,1]
    }

    @Override
    public void newReturn(Scanner scanner) {
        //중복된 요소를 제거한 새 배열을 반환하는 메소드 작성
        //중복 제거된 빈 요소는 기본값 0으로 삽입된다.
        //int arr{5,10,9,26,3,8,10,4,3,5}
    }

    @Override
    public void deleteSame(Scanner scanner) {
        //사용자로부터 소문자 알파벳 1개를 입력받아 대문자로 변경하여 출력하는 코드 작성
        //ex) 'a' => 'A'로 출력
    }
}

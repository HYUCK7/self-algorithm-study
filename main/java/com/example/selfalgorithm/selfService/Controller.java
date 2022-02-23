package com.example.selfalgorithm.selfService;

import com.example.selfalgorithm.selfService.ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.selfalgorithm
 * fileName   : Controller
 * author     : HYUCK7
 * date       : 2022/02/23
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/23         HYUCK7         최초 생성
 */
public class Controller {
    ServiceImpl service = new ServiceImpl();
    Scanner scanner = new Scanner(System.in);
    public void execute(Scanner scanner){
        while (true){
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("exit"); return;
                case 1:
                    System.out.println("1. 배열의 역순, ");
                    switch(scanner.nextInt()){
                        case 0:
                            System.out.println("exit"); return;
                        case 1: service.reverse(scanner); break;
                        case 2: service.minmax(scanner);
                    }
            }break;
        }

    }
}

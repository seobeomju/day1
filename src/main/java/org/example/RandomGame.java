package org.example;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value  = (int)(Math.random() * 6);
        // 선공 후공 user computer 순서대로 대결
        int user = scanner.nextInt();
        int com = (int) (Math.random()*3);
        user = user <com?user+3:user;
        int result = user-com;

        // user가 이긴 경우
        if (result ==0){
            for(int i=0;i<6;i+=2){

            }
        }
    }
}

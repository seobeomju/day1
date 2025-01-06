package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가위바위보: ");
        int user = scanner.nextInt();

        int computer = (int)(Math.random() * 3);

        user = user <computer?user+3:user;
        int result = user-computer;
        switch (result){
            case 0:
                System.out.println("무승부");
                break;
            case 1:
                System.out.println("승리");
                break;
             case 2:
                System.out.println("패배");
                break;
        }
    }
}
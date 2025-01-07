package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wincount =0;
        // 0이면 무승부 1이면 승리 2이면 패배
        while (true){
            System.out.print("가위바위보: ");
            int user = scanner.nextInt();
            int computer = (int)(Math.random() * 3);
            user = user <computer?user+3:user;
            int result = user-computer;
            if (result ==1 ){
                wincount +=1;
                System.out.println("승리하였습니다" + wincount+"연승 중");
            }else {
                wincount = 0 ;
                System.out.println(("패배하였습니다"));
            }

            if(wincount == 3 ){
                System.out.println("3연승 성고하였습니다");
                break;
            }
        }
    }
}
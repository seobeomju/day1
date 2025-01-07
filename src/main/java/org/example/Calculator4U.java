package org.example;
import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int backsum =0;
        //몇번 반복할지 모름
        while(true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();
            if(str.equals("END")){
                break;
            }
            if(str.equals("back")){
                sum-=backsum;
                continue; //이거 생각을 못함
            }

            int money = Integer.parseInt(str);
            //이부분에서 실수를 함
            sum =sum+ money;
            backsum = money;
            System.out.println(sum);
        }//end while
        System.out.println("최종 결과는"+sum);
    }
}
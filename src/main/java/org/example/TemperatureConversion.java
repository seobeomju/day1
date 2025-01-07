package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TemperatureConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("화씨->섭씨 (1), 섭씨->화씨 (2) 기입:");
        String str = br.readLine();
        int choice = Integer.parseInt(str);

        if(choice==1){
            System.out.println("화씨 온도를 입력하세요: ");
            double f = Double.parseDouble(br.readLine());
            double c = (f-32) *5/9;
            System.out.println("섭씨 온도는 "+c+"입니다");
        }else if (choice==2){
            System.out.println("섭씨 온도를 입력하세요: ");
            double c = Double.parseDouble(br.readLine());
            double f = (c*9/5)+32;
            System.out.println("화씨 온도는 "+f+"입니다");
        }else{
            System.out.println("유효하지 않은 값입니다");
        }
    }
}

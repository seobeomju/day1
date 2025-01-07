package org.example;

public class MoneyBank {
    public static void main(String[] args) {
        double money = 100;
        double rate = 0.1; //10%의 금리

        for(int i =0;i<10;i++){
            double interest = money * rate;
            money = money + interest;
            System.out.println("   " + money);
        }
    }
}

package org.example;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024;
        //범우가 좁은 것 부터
        if(year % 400 == 0){
            System.out.println("윤년");
        } else if (year % 100 == 0 ) {
            System.out.println("평년");
        } else if (year % 4 ==0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
    }
}

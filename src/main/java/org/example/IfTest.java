package org.example;

public class IfTest {
    public static void main(String[] args) {
        //랜덤 int값 만들기

        // 값 0.0 - 0.99999 * 6 = 5.99999, random()은 double값
        int value = (int) (Math.random() * 6) + 1;
        System.out.println(value);

        int oddEven = value % 2;
        //만일 oddEven값이 0이면 짝수 출력 ==>boolean (참/거짓)
        if(oddEven == 0){
            System.out.println("짝수");
            return;
        }
        System.out.println(("홀수"));

    }
}

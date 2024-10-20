package com.company.Basic;

//Digits Frequency

public class B2 {
    public static void main(String[] args) {
        int n = 95439692;
        int check_num = 9;
        int number_of_times = 0;

        while(n>0) {
            int digit = n%10;
            if(digit == check_num) {
                number_of_times++;
            }
            n/=10;
        }
        System.out.println("The number " + check_num + " occurs " + number_of_times + " times. ");
    }
}

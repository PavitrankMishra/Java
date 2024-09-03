package com.company.Z_AC;

//Fibonacci Series
public class AC1 {
    public static int print_Fibonacci(int n) {
        if(n==0) {
            return 0;
        }

        if(n==1) {
            return 1;
        }

        int pre1 = 0;
        int pre2 = 1;

        for(int i=2;i<=n;i++) {
            int curr = pre1 + pre2;
            pre1 = pre2;
            pre2 = curr;
        }

        return pre2;
    }

    public static void main(String[] args) {
        int num = print_Fibonacci(5);
        System.out.println("Last Fibonacci number: " + num);
    }
}

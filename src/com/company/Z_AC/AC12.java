package com.company.Z_AC;

//Space Counter
public class AC12 {
    public static void main(String[] args) {
        String a = "abc bcd cda";
        String b = "abc bc";

        String res = "";

        int count_a = 0;
        int count_b = 0;
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i) == ' ') {
                count_a++;
            }
        }

        for(int i=0;i<b.length();i++) {
            if(b.charAt(i) == ' ') {
                count_b++;
            }
        }

        int diff = Math.abs(count_a - count_b);
        if(diff%2 == 0) {
            res = "EVEN : " + diff;
            System.out.println(res);
        } else {
            res = "Odd : " + diff;
            System.out.println(res);
        }
    }
}

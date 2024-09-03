package com.company.Z_AC;

public class AC11 {
    public static void main(String[] args) {
        String s = "snakewaterwatergun";

        String A = "";
        String B = "";
        String word = "";
        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            word += s.charAt(i);

            if (word.equals("snake") || word.equals("gun") || word.equals("water")) {
                if (flag == 0) {
                    if (word.equals("snake")) {
                        A += "s";
                    } else if (word.equals("gun")) {
                        A += "g";
                    } else if (word.equals("water")) {
                        A += "w";
                    }
                    flag = 1;
                } else {
                    if (word.equals("snake")) {
                        B += "s";
                    } else if (word.equals("gun")) {
                        B += "g";
                    } else if (word.equals("water")) {
                        B += "w";
                    }
                    flag = 0;
                }
                word = ""; // Reset word after processing
            }
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);

        int res = 0;
        for(int i=0;i<A.length();i++) {
            if((A.charAt(i) == 's' && B.charAt(i) == 'w') || (A.charAt(i) == 'w' && B.charAt(i) == 'g') || (A.charAt(i) == 'g' && B.charAt(i) == 'w')) {
                res++;
            }
        }

        System.out.println(res);
    }
}

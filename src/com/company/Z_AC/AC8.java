package com.company.Z_AC;

public class AC8 {
    public static int calc_Score(String s1) {
        int score = 0;
        int count = 0;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) == 'H') {
                score += 2;
                count++;
            } else {
                score -= 1;
                count = 0;
            }

            if(count == 3) {
                return score;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        String a = "HTHHTTHTHHHT";
        int res = calc_Score(a);
        System.out.println(res);
    }
}

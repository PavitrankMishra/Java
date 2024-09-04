package com.company.Z_AC;

//Check Pssword
public class AC22 {
    public static int check_Password(char[] s, int n) {
        if(n<0) {
            return 0;
        }

        if(s[0]-'0'>=0 && s[0]-'0'<=9) {
            return 0;
        }

        int cap = 0;
        int nu = 0;

        for(int i=0;i<n;i++) {
            if(s[i] == '_' || s[i] == '/') {
                return 0;
            } else if(s[i]>='0' && s[i]<='9') {
                nu++;
            } else if(s[i] >= 'A' && s[i] <= 'Z') {
                cap++;
            }
        }
        if(cap > 0 && nu > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        char[] s = new char[] {'a','A','1', '6','7'};
        int res = check_Password(s,5);
        System.out.println(res);
    }
}

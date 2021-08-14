package com.aca.week5.Homework05;

public class LookAndSay {
    //1, 11, 21, 1211, 111221, 312211...
    public static String lookAndSay(int n) {

        if(n == 1)
            return "1";

        if(n == 2)
            return "2";

        String str = "11";

        for(int i = 3; i <= n; i++) {

            str += '#'; // dummy char
            String tmpStr = "";
            int count = 1;
            char[] arr = str.toCharArray();

            for(int j = 1; j < str.length(); j++) {
                // if different number
                if(arr[j] != arr[j - 1]){

                    tmpStr += count; // "count times"
                    tmpStr += arr[j - 1]; // "number"
                    count = 1; // reset count
                }
                else {
                    count++;
                }

                str = tmpStr;
            }

        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println(LookAndSay.lookAndSay(6));
    }
}

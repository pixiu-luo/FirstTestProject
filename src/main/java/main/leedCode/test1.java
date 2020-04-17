package main.leedCode;

public class test1 {

    public static void main(String[] args) {
        int aaa = lengthOfLongestSubstring("abcabcbb");

        System.out.println(aaa);
    }

    public static int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);

            if (chars[i] == chars[i + 1]) {

            }
        }
        return 0;


    }

    public static int lengthOfLongestSubstringTwo(String s) {

//        int freq[256] = {0};
//
//        int l = 0, r = -1;
//
//        int res = 0;
//
//        freq[s[r+1]] == 0 ;

        return 0;

    }

}

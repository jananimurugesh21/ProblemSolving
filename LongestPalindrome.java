//problem link - https://www.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1?page=1&company=Zoho&sortBy=submissions
Examples :

Input: s = “forgeeksskeegfor” 
Output: “geeksskeeg”

Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.
Input: s = “Geeks” 
Output: “ee”
Explanation: "ee" is the longest palindromic substring of "Geeks". 



class Main {
    public static String reverse(String s) {
        int l = 0, r = s.length() - 1;
        char[] c = s.toCharArray();
        while (l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return new String(c);

    }

    public static String longestPalindrome(String s) {
        // code here
        String res = "";
        int maxi = Integer.MIN_VALUE;
        int startingIndex = 0;
        for(int k=0;k < s.length();k++){

            for (int i = 0; i < s.length() - 1; i++) {
                String str = "";
                int count = 0;

                for (int j = startingIndex ; j <= i + 1; j++) {
                    str = str + s.charAt(j);
                    count++;
                }
                String rev = reverse(str);
                if (str.equals(rev) && str.length() > maxi) {
                    maxi = str.length();
                    res = str;
                }
            }
            startingIndex++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }
}

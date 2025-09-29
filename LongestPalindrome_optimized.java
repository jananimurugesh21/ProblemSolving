public class Main {

    //function to return true or false is palindrome or not

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        int max = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    if (s.substring(i, j).length() > max) {
                        max = s.substring(i, j).length();
                        result = s.substring(i, j);
                    }
                }
            }
        }
        System.out.println(result);
    }
}

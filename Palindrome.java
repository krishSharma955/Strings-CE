package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String s = "";
        for(int i = 0; i<str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i))) {
                s += str.charAt(i);
            }
        }

        s = s.toLowerCase();
        for(int i = 0; i<str.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}

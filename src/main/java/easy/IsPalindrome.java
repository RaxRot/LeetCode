package easy;

//Given an integer x, return true if x is a palindrome, and false otherwise.
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(12));
        System.out.println(new IsPalindrome().isPalindrome(11));
    }

}

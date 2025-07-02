package easy;

//Given a string s consisting of words and spaces, return the length of the last word in the string.
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String sWithoutSpaces=s.trim();
        String[] words = sWithoutSpaces.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World i am Vlad"));
    }
}

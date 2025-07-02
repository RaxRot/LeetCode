package easy;
//Given a string s, reverse the order of characters in each word
// within a sentence while still preserving whitespace and initial word order.
public class ReverseWordsInString3 {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < words.length ; i++) {
            sb.append(reverseWord(words[i]));
            if (i != words.length - 1) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    private String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}

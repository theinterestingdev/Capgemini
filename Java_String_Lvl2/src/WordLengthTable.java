import java.util.Scanner;

public class WordLengthTable {
    
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    
    public static String[] splitWords(String text) {
        int wordCount = 0;
        int len = getLength(text);
        boolean wasSpace = true;
        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wasSpace = true;
            } else {
                if (wasSpace) {
                    wordCount++;
                    wasSpace = false;
                }
            }
        }
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            } else {
                currentWord = currentWord + ch;
            }
        }
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }
        return words;
    }
    
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitWords(text);
        String[][] table = getWordLengths(words);
        
        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + " - " + length);
        }
        sc.close();
    }
}

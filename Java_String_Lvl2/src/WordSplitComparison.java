import java.util.Scanner;

public class WordSplitComparison {
    
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
    
    public static int countWords(String text) {
        int len = getLength(text);
        int words = 0;
        boolean wasSpace = true;
        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wasSpace = true;
            } else {
                if (wasSpace) {
                    words++;
                    wasSpace = false;
                }
            }
        }
        return words;
    }
    
    public static String[] splitWords(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        int len = getLength(text);
        
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
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] mySplit = splitWords(text);
        String[] javaSplit = text.split(" ");
        
        System.out.println("My split:");
        for (int i = 0; i < mySplit.length; i++) {
            System.out.println(mySplit[i]);
        }
        
        System.out.println("Java split:");
        for (int i = 0; i < javaSplit.length; i++) {
            System.out.println(javaSplit[i]);
        }
        
        System.out.println("Same? " + compareArrays(mySplit, javaSplit));
        sc.close();
    }
}

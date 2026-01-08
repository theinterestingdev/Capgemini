import java.util.Scanner;

public class VowelConsonantType {
    
    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }
    
    public static String[][] getCharTypes(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }
        
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = getCharType(text.charAt(i));
        }
        return result;
    }
    
    public static void showTable(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " - " + data[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[][] result = getCharTypes(text);
        showTable(result);
        sc.close();
    }
}

public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
//    public static void generateException() {
//        String text = null;
//        System.out.println(text.length());
//    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully"+" "+e.getMessage());
        }
    }

    public static void main(String[] args) {


//        generateException();
        handleException();
    }
}

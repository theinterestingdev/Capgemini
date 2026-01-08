public class StringOutOfBoundsExceptionDemo {


    public static void handleException(String text)
    {
        try{
            text.charAt(text.length());
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException Handled Successfully"+" "+e.getMessage());
        }
    }


    public static void main(String[] args) {

        String text = "abc";
        handleException(text);
    }

}

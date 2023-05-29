package codes;

public class HelloWorld {
   
    public static void main(String[] args) {
      System.out.println(getValue(10));
    }

    private static int getValue(int i) {
        try{
            return 100/i;
        } catch(ArithmeticException ex){
            return 0;
        } finally {
            return -1;
        }
    }
}

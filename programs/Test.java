package programs;
import java.util.*;



public class Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String sentence = "i am madhu sudhan rao";

        String newString = "";

        for(int i=0; i< sentence.length(); i++)
        {
            if(i==0 || sentence.charAt(i-1) == ' ' ){
                char temp = sentence.toUpperCase(sentence.charAt(i));
            }
        }
        
        
    }
}

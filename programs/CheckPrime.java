package programs;
import java.util.*;



public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "i am madhu sudhan rao";
        String[] array = sentence.split(" ");
        String newString = "";

        for(int i=0; i<array.length;i++){
            char temp = Character.toUpperCase(array[i].charAt(0));
            newString= newString + " "+ temp;
        }
        System.out.println(newString);
    }
    
}

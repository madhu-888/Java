package programs;
import java.util.*;

class CountDigit{
    public void getCount(int num){
        int[] count = new int[10];

        while(num > 0){
            int digit = num%10;
            count[digit]++;
            num= num/10;
        }

        for(int i=0; i<10; i++){
            if (count[i]>0){
                System.out.println("Digit " + i + " is repeated " + count[i] + " times." );
            }
        }
    }
}

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        CountDigit obj = new CountDigit();
        obj.getCount(num);
    }
}

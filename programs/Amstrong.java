package programs;
import java.util.*;

class AmstrongCode{
    public void checkAmstrongNum(int num){
        int sum = 0;
        int temp = num;
        int len = String.valueOf(num).length();

        while(temp>0){
            int digit = temp % 10;
            sum += Math.pow(digit,len);
            temp = temp/10;
        }

        if (num == sum){
            System.out.println("The number is Amstrong");
        } else {
            System.out.println("The number is not amstrong");
        }

    }
}

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("the number: ");
        int num = input.nextInt();
        AmstrongCode obj = new AmstrongCode();
        obj.checkAmstrongNum(num);
    }
}

package programs;
import java.util.*;

class Nthprime{
    public int getNthPrime(int n){
        int count = 0;
        int num = 2;
        while (count < n){
            boolean isPrime = true;

            for(int i = 2; i<Math.sqrt(num); i++){
                if (num%1==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
            }
            num++;
        }
        return num - 1;
    }

}

public class NthPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        Nthprime result = new Nthprime();
        int value = result.getNthPrime(n);
        System.out.println(value);

        
    }
    
}

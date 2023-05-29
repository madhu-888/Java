package programs;
import java.util.*;

class PrintPrimeNumsInRange{
    public void printPrimesInRange(int start, int end){
        for(int i = start; i<=end; i++){
            int count = 0;
            for(int j =2; j< ((i/2)+1); j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
        }
    }
}

public class PrimeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Number:");
        int start = input.nextInt();
        System.out.println("Ending Number: ");
        int end = input.nextInt();
        PrintPrimeNumsInRange resObj = new PrintPrimeNumsInRange();
        resObj.printPrimesInRange(start, end);
    }
}

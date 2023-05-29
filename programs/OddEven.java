package programs;
import java.util.*;

class CheckNum {
    public int checkNum(int a){
        if (a % 2 ==0){
            
            int eve = 1;
            return eve;
        }
        if (a%2!=0){
            
            int result = 2;
            return result;
        }
    
        return 0;
    }

    public void printEvenRange(int start, int end){
        for(int i =start; i<=end; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public void printOddRange(int start, int end){
        for(int i =start; i<=end; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        CheckNum checkObj = new CheckNum();
        checkObj.checkNum(num);
        System.out.println("Starting Number: ");
        int start = input.nextInt();
        System.out.println("Ending Number: ");
        int end = input.nextInt();
        System.out.println("The Even Numbers are:");
        checkObj.printEvenRange(start,end);
        System.out.println("The Odd Numbers are:");
        checkObj.printOddRange(start,end);
        
        
    }
}

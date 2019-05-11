import java.util.Scanner;

public class TargetNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=0;
        int original=40;
        do{
            n=s.nextInt();
            if(n>original){
                System.out.println("number guessed is more than original number");
            }
            else if(n<original){
                System.out.println("number guessed is less than original number");
            }
            else {
                System.out.println("number guessed matches the original number");
                return;
            }

        }while(original!=n);
    }
}

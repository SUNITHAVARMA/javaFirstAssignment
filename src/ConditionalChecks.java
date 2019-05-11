import java.util.Scanner;

public class ConditionalChecks {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(((n%2)!=0)&& ((n>20)&&(n<30))){
            System.out.println("Tom");
        }
        if(((n%2)==0)&& ((n>20)&&(n<30))){
            System.out.println("Jerry");
        }
    }
}

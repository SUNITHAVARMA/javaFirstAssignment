import java.util.Scanner;

public class NthIteration {
    public static void main(String args[]){
        System.out.println("Enter number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");


            }
        }

    }
}

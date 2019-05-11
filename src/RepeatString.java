import java.util.Scanner;

public class RepeatString {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        String s1=a.nextLine();
        int n=a.nextInt();
        String substring=s1.substring(s1.length()-n);
        while(n>0){
            s1=s1+substring;
            n--;
        }
        System.out.println(s1);


    }
}

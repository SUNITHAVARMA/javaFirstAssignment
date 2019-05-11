import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        String rev="";
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println(rev);
    }

}

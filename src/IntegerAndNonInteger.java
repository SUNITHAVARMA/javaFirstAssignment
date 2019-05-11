import java.util.Scanner;

public class IntegerAndNonInteger {
    public  static void main(String args[]){

        Scanner a=new Scanner(System.in);
        String s1=a.nextLine();
        String[] s2=s1.split("\\s");
        int sum=0;
        for(int i=0;i<=s2.length-1;i++){
            sum=sum+(Integer.parseInt(s2[i]));
        }
        System.out.println(sum);
    }
}

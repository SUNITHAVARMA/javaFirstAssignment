import java.util.Scanner;

public class CheckCharacter{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if((ch>='a')&&(ch<='z')){
            System.out.println("small letter");
        }
        else if((ch>='A')&&(ch<='Z')){
            System.out.println("capital letter");
        }
        else if((ch>='0')&&((ch<='9'))){
            System.out.println("Digit");
        }
        else System.out.println("special character");

    }

}

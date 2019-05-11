import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String args[]){
        char var;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character");
        var=sc.next().charAt(0);
        if(var=='a'||var=='A'||var=='e'||var=='E'||var=='i'||var=='I'||var=='o'||var=='O'||var=='u'||var=='U')
            System.out.println("Input is a vowel");
        else if((var>='a'&&var<='z')||(var>='A'&&var<='Z'))
            System.out.println("Input is a consonant");
        else
            System.out.println("Input is not a letter");
    }
}

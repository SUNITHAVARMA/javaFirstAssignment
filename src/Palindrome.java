import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        String num="", reverse = "";
        Scanner s = new Scanner(System.in);
        num = s.nextLine();
        int length = num.length();
        long number=Long.parseLong(num);
//        int number=Integer.parseInt(num);
        long sum = 0;
        for (int i = length - 1; i>=0; i--) {
            reverse = reverse + num.charAt(i);
        }
//        System.out.println(reverse);
        if (num.equals(reverse)) {
            System.out.println("palindrome");
            while (number > 0){
                    if (number % 2 == 0) {
                    sum = sum + (number % 10);
                }
                number = number / 10;
            }
//            System.out.println(sum);

        } else {
            System.out.println("not palindrome");
            return;
        }

        if(sum>25) {
            System.out.println(num+"is palindrome and the sum of even numbers is greater than 25");
        }else{
            System.out.println(num+" is palindrome and sum of even numbers is less than 25");
        }
        }
    }



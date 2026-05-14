import java.rmi.Naming;
import java.util.Scanner;

public class PalindromeClient {

    public static void main(String args[]) {

        try {

            PalindromeInterface obj =
                    (PalindromeInterface)
                            Naming.lookup(
                                    "rmi://localhost/palindrome"
                            );

            Scanner sc = new Scanner(System.in);

            System.out.print(
                    "Enter String or Number: "
            );

            String str = sc.nextLine();

            String result =
                    obj.checkPalindrome(str);

            System.out.println(result);

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
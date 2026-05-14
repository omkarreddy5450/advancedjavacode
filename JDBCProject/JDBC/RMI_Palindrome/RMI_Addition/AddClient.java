import java.rmi.Naming;
import java.util.Scanner;

public class AddClient {

    public static void main(String args[]) {

        try {

            AddInterface obj =
                    (AddInterface)
                            Naming.lookup(
                                    "rmi://localhost/add"
                            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            int result = obj.add(a, b);

            System.out.println(
                    "Addition = " + result
            );

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
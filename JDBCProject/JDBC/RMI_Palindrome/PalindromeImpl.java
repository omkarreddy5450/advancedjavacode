import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class PalindromeImpl
        extends UnicastRemoteObject
        implements PalindromeInterface {

    PalindromeImpl() throws RemoteException {
        super();
    }

    public String checkPalindrome(String str)
            throws RemoteException {

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equalsIgnoreCase(rev)) {
            return "Palindrome";
        }
        else {
            return "Not Palindrome";
        }
    }
}
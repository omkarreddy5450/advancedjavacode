import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AddImpl
        extends UnicastRemoteObject
        implements AddInterface {

    AddImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b)
            throws RemoteException {

        return a + b;
    }
}
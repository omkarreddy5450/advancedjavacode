import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AddServer {

    public static void main(String args[]) {

        try {

            LocateRegistry.createRegistry(1099);

            AddImpl obj = new AddImpl();

            Naming.rebind(
                    "rmi://localhost/add",
                    obj
            );

            System.out.println("Server Started");

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
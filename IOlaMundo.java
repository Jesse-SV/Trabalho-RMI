import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOlaMundo extends Remote {

    String digaOla() throws RemoteException ;
}
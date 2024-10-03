// import java.rmi.registry.Registry;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
// import java.rmi.registry.LocateRegistry;

public class Server{
    
    public static void main(String[] args){
        
        try{
        
        // Cria um registro na RMI na porta 1099 que é padrão para RMI
        // Registry registry = LocateRegistry.createRegistry(1099);

        // o bind registra um objeto no RMIregister e se tiver outro objeto com aquele nome ele lança uma exceção.
        // o rebing registra, porém se tiver um objeto com o mesmo nome ele vai substituir.

        // Vai ser responsável por criar automaticamente o Skeleton
        Naming.rebind("rmi://localhost:1099/OlaMundo", new OlaMundo());

        System.out.println("Servidor está online");

        } catch (MalformedURLException | RemoteException e) {
            e.printStackTrace();
        } 
    }
}

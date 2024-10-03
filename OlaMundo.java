import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementa os objetos remotos
public class OlaMundo extends UnicastRemoteObject implements IOlaMundo {

    // Serializar é a transferencia de objetos em uma rede bytes
    private static final long serialVersionUID = 1L;

    protected OlaMundo() throws RemoteException {
        super();
    }

    // Método que vou chamar remotamente
    @Override
    public String digaOla() throws RemoteException {
        return "Olá mundo";
    }
    
}

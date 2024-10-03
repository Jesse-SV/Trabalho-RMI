import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) {

        // Objeto do cliente que faz o papel de server na maquina do cliente
        try {

            // Procura o objeto remoto com o nome "OlaMundo" no registro
            // stub é o objeto que representa o objeto remoto, permitindo que o cliente invoque os métodos no server
            IOlaMundo stub = (IOlaMundo) Naming.lookup("rmi://localhost:1099/OlaMundo");
            System.out.println(stub.digaOla());

        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        } 
    }
    
}

// Referencia: https://youtu.be/L9yQ724BbRA?si=gSlZKRC5SEK6OAhq

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {

    // Métodos que el cliente puede invocar
    String solicitarOperacion() throws RemoteException;
    double realizarOperacion(String operacion, double a, double b) throws RemoteException;

    // Otros métodos que ya tenías
    String mensaje() throws RemoteException;
    double suma(double a, double b) throws RemoteException;
}

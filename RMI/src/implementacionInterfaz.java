import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class implementacionInterfaz extends UnicastRemoteObject implements interfaz {

    private Scanner scanner;

    public implementacionInterfaz() throws RemoteException {
        super();
        scanner = new Scanner(System.in);
    }

    public String solicitarOperacion() throws RemoteException {
        System.out.println("Ingrese la operación que desea realizar:");
        System.out.println("s para suma, r para resta, m para multiplicación, d para división");
        return scanner.nextLine();
    }

    public double realizarOperacion(String operacion, double a, double b) throws RemoteException {
        switch (operacion) {
            case "s":
                return a + b;
            case "r":
                return a - b;
            case "m":
                return a * b;
            case "d":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Operación no válida.");
                return Double.NaN;
        }
    }

    public String mensaje() throws RemoteException {
        return "Hola desde el servidor";
    }

    public double suma(double a, double b) throws RemoteException {
        return a + b;
    }
}

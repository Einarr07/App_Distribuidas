import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) throws NotBoundException {

        Registry registro;
        try {
            registro = LocateRegistry.getRegistry("localhost", 1234);
            interfaz objetoRemoto = (interfaz) registro.lookup("ClienteRemoto");

            // Solicitar la operación al cliente
            String operacion = solicitarOperacionAlCliente();
            System.out.println("Operación seleccionada: " + operacion);

            // Ingresar dos números desde el cliente
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el primer número:");
            double numero1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double numero2 = scanner.nextDouble();

            // Realizar la operación remota
            double resultado = objetoRemoto.realizarOperacion(operacion, numero1, numero2);
            System.out.println("El resultado es: " + resultado);

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

    private static String solicitarOperacionAlCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la operación que desea realizar:");
        System.out.println("s para suma, r para resta, m para multiplicación, d para división");
        return scanner.nextLine();
    }
}

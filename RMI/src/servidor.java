import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDate;

public class servidor {
    public static void main(String[] args){
        // Crear una isntancia de la implementación de la interfaz
        try {
            interfaz objetoRemoto = new implementacionInterfaz();
            //Crear y obtener registro RMI en el puerto específico
            Registry registro = LocateRegistry.createRegistry(1234);

            //vincular la implementación remota al registro
            registro.rebind("ClienteRemoto", objetoRemoto);

            System.out.println("Servidor remoto iniciado ");
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
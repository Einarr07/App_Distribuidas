import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class HiloCliente extends Thread{

    private DatagramSocket socket;
    private DatagramPacket paquete;

    // Constructor
    public HiloCliente(DatagramSocket socket, DatagramPacket paquete){
        this.socket = socket;
        this.paquete =paquete;
    }

    public void run(){

        Scanner entrada = new Scanner(System.in);
        // Extraer la información del paquete
        String mensajeRecibido = new String(paquete.getData(), paquete.getOffset(), paquete.getLength());
        System.out.println("Mensaje recibido: " + mensajeRecibido);

        // Obtener la dirección del cliente (dirección de origen)
        InetAddress direccionIP_cliente = paquete.getAddress();
        int puerto_cliente = paquete.getPort();


        // Verificar si el mensaje indica el final de la conversación
        if (mensajeRecibido.equalsIgnoreCase("fin")) {
            System.out.println("Conversación terminada. Cerrando el hilo del cliente.");
            return;
        }else{
            // Mensaje de respuesta
            String respuesta = entrada.nextLine();

            // Arreglos de bytes para recibir los datos
            byte[] bufferSalida = respuesta.getBytes();

            // Crear paquete
            DatagramPacket paquete_respuesta = new DatagramPacket(
                    bufferSalida,
                    0,
                    bufferSalida.length,
                    direccionIP_cliente,
                    puerto_cliente);

            // Enviar el Datagrama
            try {
                socket.send(paquete_respuesta);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

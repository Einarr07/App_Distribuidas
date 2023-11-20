import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClienteUDP {

    public static void main(String[] args) throws IOException {

        int puerto = 500; //Número de puerto

        // Crear un socket UDP
        DatagramSocket socket = new DatagramSocket();

        // Dirección IP del servidor
        InetAddress direccionIP_servidor = InetAddress.getByName("localhost");


        // Mensaje para enviar
        String mensaje_cliente = "Hola, soy el Cliente";

        // Arreglo de bytes para enviar los datos
        byte[] bufferSalida = mensaje_cliente.getBytes();

        // Crear paquete para enviar datos
        DatagramPacket paquete_enviar = new DatagramPacket(
                bufferSalida,
                0,
                bufferSalida.length,
                direccionIP_servidor,
                puerto);

        // Enviar paquete
        socket.send(paquete_enviar);

        // Arreglos de bytes para recibir los datos
        byte[] bufferEntrada = new byte[1024];

        // Crear paquete para recibir datos
        DatagramPacket paquete_recibir = new DatagramPacket(
                bufferEntrada,
                0,
                bufferEntrada.length);

        // Recibir paquete
        socket.receive(paquete_recibir);

        // Extraer la información del paquete
        String mensajeRecibido = new String(paquete_recibir.getData(), paquete_recibir.getOffset(), paquete_recibir.getLength());
        System.out.println("Mensaje recibido: " + mensajeRecibido);

    }
}

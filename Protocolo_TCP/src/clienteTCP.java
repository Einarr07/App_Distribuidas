import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clienteTCP {
    public static void main(String[] args){
        try {
            // Crear socket para conectar el servidor
            Socket socket_cliente = new Socket("localhost", 5000);

            //Crear buffer para recibir y enviar datos cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket_cliente.getInputStream()));
            PrintWriter salida = new PrintWriter(socket_cliente.getOutputStream(),true);

            // Enviar datos al cliente
            String mensaje = "Hola soy el cliente";
            salida.println(mensaje);

            // Leer datos recibidos desde el cliente
            String datos_recibidos = entrada.readLine();
            System.out.println("Cliente: " + datos_recibidos);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
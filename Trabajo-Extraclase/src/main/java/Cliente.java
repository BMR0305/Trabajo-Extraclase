 
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Bryan Martínez
 */
public class Cliente implements Runnable{
    private static Logger log = LoggerFactory.getLogger(Cliente.class);
    
    /**
     *
     */
    public int puerto;

    /**
     *
     */
    public String mensaje;
    
    /**
     *
     * @param puerto
     * @param mensaje
     */
    public Cliente(int puerto, String mensaje){
        this.puerto = puerto;
        this.mensaje= mensaje;
                
    }
    /**
     *Creacion del nuevo cliente y envio del mensaje
     */
    @Override
    public void run() {
        String host = "127.0.0.1";
        DataOutputStream out;
        try{
            Socket sc = new Socket(host, puerto);
            out = new DataOutputStream(sc.getOutputStream());
            out.writeUTF(mensaje);
            String[] components = mensaje.split("\\|");
            Chat chat = new Chat(String.valueOf(puerto), components[1]);
            sc.close();
            
        }catch(ConnectException e){
            log.error(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexion con el puerto");
           
        } catch (IOException ex) {
            log.error(ex.getMessage(), ex);
        }
}
}

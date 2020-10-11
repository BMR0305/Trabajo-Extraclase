
import java.io.IOException;
import java.net.ServerSocket; 
import java.io.DataInputStream;
import java.net.Socket;
import java.util.Observable;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Bryan Martínez
 */
public class Servidor extends Observable implements Runnable{
    private static org.slf4j.Logger log = LoggerFactory.getLogger(Servidor.class);

    /**
     *
     */
    public int puerto = 5000;

    /**
     *
     */
    public ServerSocket servidor = null;

    /**
     *
     */
    public Servidor (){
        boolean flag =true;
        while (flag){
            try{
                this.servidor = new ServerSocket(puerto);
                flag = false;
            }catch(IOException ex){
                log.error(ex.getMessage(), ex);
                puerto+=10;           
            }  
        }
        this.puerto = puerto;
    }
    /**
     *Inicia el servidor y esta atento a recibir mensajes para notificar y crear un nuevo chat o agregar el mensaje a uno existente
     */    
    @Override
    public void run() {
        Socket sc = null;
        DataInputStream in;
        try{
            while(true){
                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();
                String[] components = mensaje.split("\\|");
                Chat chat = new Chat(components[0], components[1]);
                
                this.setChanged();
                this.notifyObservers(components[0]);
                this.clearChanged();
                sc.close();
                
            } 
        }catch (IOException ex){ 
            log.error(ex.getMessage(), ex);
            
        }
      
    }
    
}


import java.io.IOException;
import java.net.ServerSocket; 
import java.io.DataInputStream;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Observable implements Runnable{
    public int puerto = 5000;
    public ServerSocket servidor = null;
    public Servidor (){
        boolean flag =true;
        while (flag){
            try{
                this.servidor = new ServerSocket(puerto);
                flag = false;
            }catch(IOException ex){
                puerto+=1;           
            }  
        }
        this.puerto= puerto;
    }
    @Override
    public void run() {
        Socket sc = null;
        DataInputStream in;
        try{
            System.out.println("Servidor conectado");
            System.out.println(puerto);
            while(true){
                sc = servidor.accept();
                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                sc.close();
            } 
        }catch (IOException ex){ 
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }
      
    }
    
}

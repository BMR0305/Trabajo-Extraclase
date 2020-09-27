
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan Martínez
 */
public class Chat{

    /**
     *
     */
    public String emisor; 

    /**
     *
     */
    public String mensajes;

    /**
     *Lista chats creados
     */
    public static List <Chat> lista_de_chats = new ArrayList<Chat>(); 
    
    /**
     *Creaión de chat si no existe 
     * @param emisor
     * @param mensajes
     */
    public Chat (String emisor, String mensajes){
        boolean flag = false;
        for (int i = 0; i < lista_de_chats.size(); i++) {
            Chat get = lista_de_chats.get(i);
            if (get.emisor.equals(emisor)){
                get.mensajes = get.mensajes + mensajes;
                flag = true;
                break;
            }
            
        }
        if (flag == false){
            this.emisor = emisor;
            this.mensajes = mensajes;
            Chat.lista_de_chats.add(this);         
        }

    }
    
    
}

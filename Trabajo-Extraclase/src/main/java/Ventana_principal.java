
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Martínez
 */
public class Ventana_principal extends javax.swing.JFrame implements Observer {
    /**
     *
     */
    public List<javax.swing.JButton> botones_chat = new ArrayList<javax.swing.JButton>();

    /**
     *Rellena la lista con los botones de los chats 
     */
    public void llenar_lista() {
        this.botones_chat.add(this.chat_1);
        this.botones_chat.add(this.chat_2);
        this.botones_chat.add(this.chat_3);
        this.botones_chat.add(this.chat_4);
        this.botones_chat.add(this.chat_5);
        this.botones_chat.add(this.chat_6);
        this.botones_chat.add(this.chat_7);
        this.botones_chat.add(this.chat_8);

    }

    /**
     *Inicia la ventana y el servidor. a la vez asigna el puerto y llama la función para llenar la lista
     */
    public Ventana_principal() {
        initComponents();
        this.getRootPane().setDefaultButton(this.send);
        Servidor s = new Servidor();
        s.addObserver(this);
        Thread ts = new Thread(s);
        ts.start();
        port_a.setText(String.valueOf(s.puerto));
        llenar_lista();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lista_chats = new javax.swing.JPanel();
        chat_1 = new javax.swing.JButton();
        chat_2 = new javax.swing.JButton();
        chat_3 = new javax.swing.JButton();
        chat_4 = new javax.swing.JButton();
        chat_5 = new javax.swing.JButton();
        chat_6 = new javax.swing.JButton();
        chat_7 = new javax.swing.JButton();
        chat_8 = new javax.swing.JButton();
        chat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chat_area = new javax.swing.JTextArea();
        send_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        p = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        port = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        port_a = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lista_chats.setBackground(new java.awt.Color(204, 255, 255));

        chat_1.setBackground(new java.awt.Color(0, 153, 153));
        chat_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_1.setForeground(new java.awt.Color(255, 255, 255));
        chat_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_1ActionPerformed(evt);
            }
        });

        chat_2.setBackground(new java.awt.Color(0, 153, 153));
        chat_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_2.setForeground(new java.awt.Color(255, 255, 255));
        chat_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_2ActionPerformed(evt);
            }
        });

        chat_3.setBackground(new java.awt.Color(0, 153, 153));
        chat_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_3.setForeground(new java.awt.Color(255, 255, 255));
        chat_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_3ActionPerformed(evt);
            }
        });

        chat_4.setBackground(new java.awt.Color(0, 153, 153));
        chat_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_4.setForeground(new java.awt.Color(255, 255, 255));
        chat_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_4ActionPerformed(evt);
            }
        });

        chat_5.setBackground(new java.awt.Color(0, 153, 153));
        chat_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_5.setForeground(new java.awt.Color(255, 255, 255));
        chat_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_5ActionPerformed(evt);
            }
        });

        chat_6.setBackground(new java.awt.Color(0, 153, 153));
        chat_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_6.setForeground(new java.awt.Color(255, 255, 255));
        chat_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_6ActionPerformed(evt);
            }
        });

        chat_7.setBackground(new java.awt.Color(0, 153, 153));
        chat_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_7.setForeground(new java.awt.Color(255, 255, 255));
        chat_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_7ActionPerformed(evt);
            }
        });

        chat_8.setBackground(new java.awt.Color(0, 153, 153));
        chat_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_8.setForeground(new java.awt.Color(255, 255, 255));
        chat_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lista_chatsLayout = new javax.swing.GroupLayout(lista_chats);
        lista_chats.setLayout(lista_chatsLayout);
        lista_chatsLayout.setHorizontalGroup(
            lista_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lista_chatsLayout.createSequentialGroup()
                .addGroup(lista_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chat_2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(chat_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lista_chatsLayout.setVerticalGroup(
            lista_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lista_chatsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(chat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat_7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chat_8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        chat.setBackground(new java.awt.Color(0, 204, 204));

        chat_area.setColumns(20);
        chat_area.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_area.setRows(5);
        chat_area.setFocusable(false);
        jScrollPane2.setViewportView(chat_area);

        javax.swing.GroupLayout chatLayout = new javax.swing.GroupLayout(chat);
        chat.setLayout(chatLayout);
        chatLayout.setHorizontalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        chatLayout.setVerticalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        send_panel.setBackground(new java.awt.Color(204, 255, 255));

        message.setColumns(20);
        message.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        message.setLineWrap(true);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        p.setText("Port:");

        m.setText("Message");

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });
        port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                portKeyTyped(evt);
            }
        });

        jLabel2.setText("Personal port:");

        javax.swing.GroupLayout send_panelLayout = new javax.swing.GroupLayout(send_panel);
        send_panel.setLayout(send_panelLayout);
        send_panelLayout.setHorizontalGroup(
            send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, send_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, send_panelLayout.createSequentialGroup()
                        .addComponent(p)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(port))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, send_panelLayout.createSequentialGroup()
                        .addComponent(m)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(send_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(send_panelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(port_a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        send_panelLayout.setVerticalGroup(
            send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(port_a, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p))
                .addGap(25, 25, 25)
                .addComponent(m)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lista_chats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(send_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lista_chats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(send_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     *Envió y verificación del mensaje, asignación del boton al chat creado 
     */
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

        if (this.port_a.getText().equals(this.port.getText())){
            JOptionPane.showMessageDialog(rootPane, "El puerto no debe de ser el mismo que el propio");
            this.port.setText(null);
        }
        else if (this.message.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane, "El mensaje debe de incluir un contenido");
        }
        else {
            String mensaje = this.port_a.getText() + "|" + this.port_a.getText() + ": " + this.message.getText() + "\n";
            Cliente c = new Cliente(Integer.parseInt(this.port.getText()), mensaje);
            Thread tc = new Thread(c);
            tc.start();
            for (int i = 0; i < this.botones_chat.size(); i++) {
                JButton get = this.botones_chat.get(i);
                if (get.getText().equals(this.port.getText())) {
                    get.setBackground(new java.awt.Color(255, 204, 153));
                    break;
                }
                if (get.getText().equals("")) {
                    get.setText(this.port.getText());
                    get.setBackground(new java.awt.Color(255, 204, 153));
                    break;
                }
            }

            
        
            this.message.setText(null);
            this.port.setText(null);
            chat_area.setText("");

        }


    }//GEN-LAST:event_sendActionPerformed

    private void chat_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_1ActionPerformed
        chat_area.setText("");
        chat_1.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_1.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_1.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_1ActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

    private void chat_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_2ActionPerformed
        chat_area.setText("");
        chat_2.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_2.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_2.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);
            }
        }

    }//GEN-LAST:event_chat_2ActionPerformed

    private void chat_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_3ActionPerformed
        chat_area.setText("");
        chat_3.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_3.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_3.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_3ActionPerformed

    private void chat_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_4ActionPerformed
        chat_area.setText("");
        chat_4.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_4.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_4.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_4ActionPerformed

    private void chat_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_5ActionPerformed
        chat_area.setText("");
        chat_5.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_5.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_5.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_5ActionPerformed

    private void chat_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_6ActionPerformed
        chat_area.setText("");
        chat_6.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_6.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_6.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_6ActionPerformed

    private void chat_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_7ActionPerformed
        chat_area.setText("");
        chat_7.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_7.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_7.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_7ActionPerformed

    private void chat_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_8ActionPerformed
        chat_area.setText("");
        chat_8.setBackground(new java.awt.Color(0, 153, 153));
        port.setText(this.chat_8.getText());
        for (int i = 0; i < Chat.lista_de_chats.size(); i++) {
            Chat get = Chat.lista_de_chats.get(i);
            if (get.emisor.equals(this.chat_8.getText())) {
                chat_area.setText("");
                chat_area.append(get.mensajes);

            }

        }
    }//GEN-LAST:event_chat_8ActionPerformed

    private void portKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portKeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Por favor solo ingresar números");
        }
    }//GEN-LAST:event_portKeyTyped

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chat;
    private javax.swing.JButton chat_1;
    private javax.swing.JButton chat_2;
    private javax.swing.JButton chat_3;
    private javax.swing.JButton chat_4;
    private javax.swing.JButton chat_5;
    private javax.swing.JButton chat_6;
    private javax.swing.JButton chat_7;
    private javax.swing.JButton chat_8;
    private javax.swing.JTextArea chat_area;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lista_chats;
    private javax.swing.JLabel m;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel p;
    private javax.swing.JTextField port;
    private javax.swing.JLabel port_a;
    private javax.swing.JButton send;
    private javax.swing.JPanel send_panel;
    // End of variables declaration//GEN-END:variables
    /**
     *Recibe el mensaje y asgina un boton de chat a la conversación 
     */
    @Override
    public void update(Observable o, Object arg) {
        for (int i = 0; i < this.botones_chat.size(); i++) {
            JButton get = this.botones_chat.get(i);
            if (get.getText().equals(arg)) {
                get.setBackground(new java.awt.Color(255, 204, 153));
                break;
            }
            if (get.getText().equals("")) {
                get.setText((String) arg);
                get.setBackground(new java.awt.Color(255, 204, 153));
                break;
            }
        }
    }

}

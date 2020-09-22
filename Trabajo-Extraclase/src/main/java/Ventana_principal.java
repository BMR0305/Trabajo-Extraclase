
import java.util.Observable;
import java.util.Observer;


public class Ventana_principal extends javax.swing.JFrame implements Observer{
    
    public Ventana_principal() {
        initComponents();
        this.getRootPane().setDefaultButton(this.send);
        Servidor s = new Servidor();
        s.addObserver(this);
        Thread ts = new Thread (s);
        ts.start();
        port_a.setText(String.valueOf(s.puerto));
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

        chat_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_1ActionPerformed(evt);
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

        javax.swing.GroupLayout chatLayout = new javax.swing.GroupLayout(chat);
        chat.setLayout(chatLayout);
        chatLayout.setHorizontalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        chatLayout.setVerticalGroup(
            chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        jLabel2.setText("Personal port:");

        javax.swing.GroupLayout send_panelLayout = new javax.swing.GroupLayout(send_panel);
        send_panel.setLayout(send_panelLayout);
        send_panelLayout.setHorizontalGroup(
            send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_panelLayout.createSequentialGroup()
                .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, send_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(send_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addGroup(send_panelLayout.createSequentialGroup()
                                .addComponent(p)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(port))
                            .addGroup(send_panelLayout.createSequentialGroup()
                                .addComponent(m)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(send_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(port_a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        send_panelLayout.setVerticalGroup(
            send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(send_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String mensaje = "1: "+ this.message.getText()+"\n";
        
        this.message.append(mensaje);
        
        Cliente c = new Cliente(Integer.parseInt(this.port.getText()), mensaje);
        
        Thread tc = new Thread (c);
        tc.start();
        
    }//GEN-LAST:event_sendActionPerformed

    private void chat_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_1ActionPerformed

    }//GEN-LAST:event_chat_1ActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lista_chats;
    private javax.swing.JLabel m;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel p;
    private javax.swing.JTextField port;
    private javax.swing.JLabel port_a;
    private javax.swing.JButton send;
    private javax.swing.JPanel send_panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.message.append((String) arg);
    }
}

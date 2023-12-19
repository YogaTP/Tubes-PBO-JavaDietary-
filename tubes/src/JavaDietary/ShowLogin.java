package JavaDietary;

import java.awt.Color;

public class ShowLogin extends javax.swing.JFrame {
    private String username;

    private javax.swing.JButton cancelButton;

    public ShowLogin() {
        initComponents();
        customizeUI();
        setSize(430, 280);
    }

    private void customizeUI() {
        getContentPane().setBackground(new Color(236, 227, 206));

        loginButton.setBackground(new Color(79, 111, 82));
        loginButton.setForeground(new Color(0, 0, 0));

        loginButton.setBounds(240, 150, 100, 40);

        cancelButton = new javax.swing.JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBackground(new Color(79, 111, 82));
        cancelButton.setForeground(new Color(0, 0, 0));
        cancelButton.setBounds(120, 150, 100, 40);

        // Add the Cancel button to the JFrame
        getContentPane().add(cancelButton);

        // Set layout to null to allow manual positioning and sizing of components
        setLayout(null);

        // Add action listener to the Cancel button
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("\nSELAMAT DATANG DI JAVADIETARY");

        jLabel2.setText("Menyediakan Layanan Untuk Mengukur Berat Badan");

        jLabel3.setText("Nama: ");

        usernameField.setColumns(15);
        usernameField.setPreferredSize(new java.awt.Dimension(200, 25)); // Atur panjang dan tinggi sesuai kebutuhan


        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("dan Membantu Menghitung Kalori Harian Anda!!!");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginButton))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    
        pack();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Code to handle cancel button action
        // You can close the JFrame or perform other actions here
        System.exit(0); // Example: Exit the application
    }

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        username = usernameField.getText();
        MainMenu menu = new MainMenu(this); // Kirim instance ShowLogin ke MainMenu
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    public String getUsername() {
        return username; // Getter untuk mendapatkan nama pengguna
    }
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}

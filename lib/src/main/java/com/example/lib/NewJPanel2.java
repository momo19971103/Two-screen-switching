package com.example.lib;

public class NewJPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    NewJFrame n2=null;
    public NewJPanel2(NewJFrame n2) {
        initComponents();
        this.n2=n2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setText("ด๚ธี2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                NewJPanel p=new NewJPanel(n2);
                setVisible(false);
                n2.add(p);
                n2.setVisible(true);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    // End of variables declaration
}
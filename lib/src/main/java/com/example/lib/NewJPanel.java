package com.example.lib;

public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    NewJFrame n2=null;
    public NewJPanel(NewJFrame n2) {
        initComponents();
        this.n2=n2;//�q�L�غc�禡�������e�ǹL�Ӫ����O
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();//�s�W���s
        jButton1.setText("����1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                NewJPanel2 p1=new NewJPanel2(n2);//�s�ح��ONewJPanel2�A�ñN����n2�ǤJ
                setVisible(false);//���÷�e���O
                n2.add(p1);//�b�������s�W���Op1
                n2.setVisible(true);//��ܭ��O
            }
        });
        //https://blog.xuite.net/reshenchen/computer/30596064-java+GroupLayout+%E6%95%99%E5%AD%B8
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(400, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    // End of variables declaration
}
